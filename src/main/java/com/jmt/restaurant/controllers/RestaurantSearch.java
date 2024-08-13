package com.jmt.restaurant.controllers;

import lombok.Data;

@Data
public class RestaurantSearch {
    // 통합 검색
    private int page = 1;
    private int limit = 20; // 1페이지에 20개

    private String sopt; // 검색 조건
    private String skey; // 검색 키워드

}