package com.yhy.strategy.impl;


import com.yhy.strategy.inteface.Weapon;

/**
 * Author : YangHaoyi on 2017/2/17.
 * Email  :  yanghaoyi@neusoft.com
 * Description :剑武器实现类
 */

public class SwordWeapon implements Weapon {
    @Override
    public void useWeapon() {
        //用剑去攻击
        System.out.println("This hero fight with sword");
    }
    public void descirbe(){
        System.out.println("The hero's name is Saber");
    }
}
