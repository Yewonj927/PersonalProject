package com.study.springboot.item.repository;

import com.study.springboot.item.dto.ItemSearchDto;
import com.study.springboot.item.entity.Item;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ItemRepositoryCustom {
    Page<Item> getAdminItemPage(ItemSearchDto itemSearchDto, Pageable pageable);

}
