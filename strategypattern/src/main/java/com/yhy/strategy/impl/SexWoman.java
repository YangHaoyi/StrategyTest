package com.yhy.strategy.impl;


import com.yhy.strategy.inteface.Sex;

/**
 * Author : YangHaoyi on 2017/2/17.
 * Email  :  yanghaoyi@neusoft.com
 * Description :女性英雄接口实现类
 */

public class SexWoman implements Sex {
    @Override
    public void heroSex() {
        System.out.println("She is a girl");
    }
}
