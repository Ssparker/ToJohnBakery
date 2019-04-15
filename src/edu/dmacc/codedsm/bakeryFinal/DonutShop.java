package edu.dmacc.codedsm.bakeryFinal;

import java.util.List;

public abstract class DonutShop extends BakeryFinal {

    public DonutShop() {
    }

    public DonutShop(List<String> equipment, List<String> employees, List<String> inventory, Double cashOnHand, Boolean isOpen) {
        super(equipment, employees, inventory, cashOnHand, isOpen);   // CONSTRUCTOR GENERATE CONSTRUCTOR
    }

    public DonutShop(BakeryFinal natesBakery) {
        super(natesBakery);
    }

    @Override
    public boolean openTheBakery(List<Employee> employees) {
        System.out.println("eat donuts");
        return super.openTheBakery(employees);
    }

    @Override
    public void bakeTheGoods(List<Goods> goods, Employee employee) {
        System.out.println("Bakery is opening");
        super.bakeTheGoods(goods, employee);


    }

    //    @Override
//    public abstract void bakeTheGoods();

    }

    //added becuase of abstract
    //alt enter - impliment methods  or alt insert - impl methods

