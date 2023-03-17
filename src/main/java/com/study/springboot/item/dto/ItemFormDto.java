package com.study.springboot.item.dto;

import com.study.springboot.item.constant.ItemSellStatus;
import com.study.springboot.item.entity.Item;
import lombok.Getter;
import lombok.Setter;
import org.modelmapper.ModelMapper;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Lob;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class ItemFormDto {
    private Long id; //코드

    @NotBlank(message = "상품명은 필수 항목 입니다.")
    private String itemNm; //이름

    @NotNull(message = "가격은 필수 항목 입니다.")
    private int price; //가격

    @NotNull(message = "재고는 필수 항목 입니다.")
    private int stockNumber; //재고 수량

    private ItemSellStatus itemSellStatus; //상품 판매 상태

    @NotBlank(message = "상품 설명은 필수 항목 입니다.")
    private String itemDetail; //상품 상세

    private List<ItemImgDto> itemImgDtoList = new ArrayList<>();

    private List<Long> ItemImgIds = new ArrayList<>(); //아이디 정보를 받아오려고 함.

    private static ModelMapper modelMapper = new ModelMapper();

    public Item createItem() {
        return modelMapper.map(this, Item.class); //dto에서 entity로.
    }

    public static ItemFormDto of(Item item) {
        return modelMapper.map(item, ItemFormDto.class); //entity에서 dto로.
    }


}
