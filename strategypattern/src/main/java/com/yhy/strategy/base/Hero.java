package com.yhy.strategy.base;


import com.yhy.strategy.inteface.Sex;
import com.yhy.strategy.inteface.Weapon;

/**
 * Author : YangHaoyi on 2017/2/17.
 * Email  :  yanghaoyi@neusoft.com
 * Description : 英雄抽象类 英雄属性有使用武器与性别
 * 设计模式-----策略模式
 * 定义了算法族，分别封装起来，让它们之间可以相互替换，此设计模式让算法的变化独立于使用算法的客户。
 */

public abstract class Hero {
    //将hero的内部属性封装
    protected Weapon weapon;
    protected Sex sex;

    public void fight(){
        weapon.useWeapon();
    }
    public void heroSex(){
        sex.heroSex();
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }
}
