package com.yhy.strategy.main;


import com.yhy.strategy.HeroArcher;
import com.yhy.strategy.HeroModel;
import com.yhy.strategy.HeroSaber;
import com.yhy.strategy.Master;
import com.yhy.strategy.base.Hero;
import com.yhy.strategy.base.People;
import com.yhy.strategy.impl.ArrowWeapon;
import com.yhy.strategy.impl.SexMan;

public class HeroTest {
    public static void main(String[] arges){
        Hero saber = new HeroSaber();
        saber.fight();
        Hero archer = new HeroArcher();
        archer.fight();
        Hero model = new HeroModel();
        model.setWeapon(new ArrowWeapon());
        model.fight();
        model.setSex(new SexMan());
        model.heroSex();
        People master = new Master();
        master.fight();
    }
}
