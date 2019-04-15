package edu.dmacc.codedsm.bakeryFinal;

import java.util.List;

public abstract class PizzaParlor extends BakeryFinal {
    public PizzaParlor() {
    }

    public PizzaParlor(List<String> equipment, List<String> employees, List<String> inventory, Double cashOnHand, Boolean isOpen) {
        super(equipment, employees, inventory, cashOnHand, isOpen);  // CONSTRUCTOR GENERATE CONSTRUCTOR
    }

    public PizzaParlor(BakeryFinal natesBakery) {
        super(natesBakery);
    }

    // int hateColdPizza;

        @Override
  //  public abstract void bakeTheGoods();


    @Override
    public boolean openTheBakery(List<Employee> employees) {
            System.out.println("Pizza is yummy");
        return super.openTheBakery(employees);
    }

    @Override
    public void bakeTheGoods(List<Goods> goods, Employee employee) {
        System.out.println("Making pizza");
        super.bakeTheGoods(goods, employee);

        System.out.println();
    }
}


