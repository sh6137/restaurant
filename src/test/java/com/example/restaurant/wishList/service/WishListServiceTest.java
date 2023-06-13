package com.example.restaurant.wishList.service;

import com.example.restaurant.wishlist.dto.WishListDto;
import com.example.restaurant.wishlist.service.WishListService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class WishListServiceTest {
    @Autowired
    private WishListService wishListService;

    @Test
    public void searchTest(){
        WishListDto wishListDto = wishListService.search("갈비집");
        System.out.println(wishListDto);
        Assertions.assertNotNull(wishListDto);
    }
}
