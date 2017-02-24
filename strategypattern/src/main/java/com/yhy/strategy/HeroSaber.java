package com.yhy.strategy;


import com.yhy.strategy.base.Hero;
import com.yhy.strategy.impl.SwordWeapon;

/**
 * Author : YangHaoyi on 2017/2/17.
 * Email  :  yanghaoyi@neusoft.com
 * Description :剑客英雄类
 */

public class HeroSaber extends Hero {
    public HeroSaber() {
        weapon = new SwordWeapon();
    }
}
