package edu.dmacc.codedsm.bakeryFinal;

import java.util.List;

public abstract class MailOrderCakes extends BakeryFinal {
    public MailOrderCakes() {
    }

    public MailOrderCakes(List<String> equipment, List<String> employees, List<String> inventory, Double cashOnHand, Boolean isOpen) {
        super(equipment, employees, inventory, cashOnHand, isOpen);  // GENERATE CONSTUCTOR
    }

    public MailOrderCakes(BakeryFinal natesBakery) {
        super(natesBakery);
    }

    @Override
    public boolean openTheBakery(List<Employee> employees) {
        System.out.println("Happy camper");
        return super.openTheBakery(employees);
    }

    @Override
    public void bakeTheGoods(List<Goods> goods, Employee employee) {
        System.out.println("Bakery is opening");
        super.bakeTheGoods(goods, employee);


    }

    //    int hateDryCakes;
//
//    @Override
//    public abstract void bakeTheGoods();
    }



