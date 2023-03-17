package com.study.springboot.item.dto;

import com.study.springboot.item.entity.ItemImg;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.modelmapper.ModelMapper;


@Getter
@Setter
@ToString
public class ItemImgDto {
    private Long id;

    private String imgName;
    private String oriImgName;
    private String ImgUrl; //이미지 경로
    private String repImgYn; //대표 이미지

    private static ModelMapper modelMapper = new ModelMapper();
    public static ItemImgDto of(ItemImg itemImg) {
        //아이템 이미지 dto로 받아서 매핑.
        return modelMapper.map(itemImg, ItemImgDto.class);
    }
}
