package com.yhy.strategy.impl;


import com.yhy.strategy.inteface.Weapon;

/**
 * Author : YangHaoyi on 2017/2/17.
 * Email  :  yanghaoyi@neusoft.com
 * Description :弓箭武器接口实现类
 */

public class ArrowWeapon implements Weapon {
    @Override
    public void useWeapon() {
        //用弓箭攻击
        System.out.println("This hero fight with arrow");
    }
    public void describe(){
        System.out.println("The hero's name is Archer");
    }
}
