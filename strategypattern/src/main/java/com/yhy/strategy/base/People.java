package com.yhy.strategy.base;


import com.yhy.strategy.inteface.Weapon;

/**
 * Author : YangHaoyi on 2017/2/17.
 * Email  :  yanghaoyi@neusoft.com
 * Description :
 */

public abstract class People {
    protected Weapon weapon;
    public void fight(){
        weapon.useWeapon();
    }
}
