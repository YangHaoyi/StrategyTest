package com.yhy.strategy.impl;


import com.yhy.strategy.inteface.Weapon;

/**
 * Author : YangHaoyi on 2017/2/17.
 * Email  :  yanghaoyi@neusoft.com
 * Description :设计模式---------代理模式
 * master没有武器，但他是saber的代理，会使用剑当武器
 */

public class MasterWeapon implements Weapon {

    private Weapon weapon;

    public MasterWeapon() {
        //为master设置代理
        this.weapon = new SwordWeapon();
    }

    @Override
    public void useWeapon() {
        this.weapon.useWeapon();
    }
}
