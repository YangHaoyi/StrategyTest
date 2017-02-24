package com.yhy.strategy;


import com.yhy.strategy.base.People;
import com.yhy.strategy.impl.MasterWeapon;

/**
 * Author : YangHaoyi on 2017/2/17.
 * Email  :  yanghaoyi@neusoft.com
 * Description :
 */

public class Master extends People {
    public Master() {
        weapon = new MasterWeapon();
    }
}
