package com.pmm.pickmymenu_back.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest
@ActiveProfiles("dev")
@Transactional
class RankServiceTest {

    @Autowired
    RankService rankService;

    @Test
    void getSurveyRank() {
        rankService.getSurveyRank(null);
    }
}