package com.yhy.strategy;


import com.yhy.strategy.base.Hero;
import com.yhy.strategy.impl.SwordWeapon;

/**
 * Author : YangHaoyi on 2017/2/17.
 * Email  :  yanghaoyi@neusoft.com
 * Description :英雄模型类
 */

public class HeroModel extends Hero {
    public HeroModel() {
        weapon = new SwordWeapon();
    }
}
