package com.yhy.strategy;


import com.yhy.strategy.base.Hero;
import com.yhy.strategy.impl.ArrowWeapon;

/**
 * Author : YangHaoyi on 2017/2/17.
 * Email  :  yanghaoyi@neusoft.com
 * Description :弓箭英雄类
 */

public class HeroArcher extends Hero {
    public HeroArcher() {
        weapon = new ArrowWeapon();
    }
}
