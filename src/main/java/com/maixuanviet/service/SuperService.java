package com.maixuanviet.service;

import com.maixuanviet.interceptor.Audited;

public class SuperService {
    @Audited
    public String deliverService(String uid) {
        return uid;
    }
}
