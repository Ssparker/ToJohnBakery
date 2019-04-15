package edu.dmacc.codedsm.bakeryFinal;

import java.util.List;
import java.util.Objects;

public abstract class Equipment {

    private String equipmentType = "";

    public String getEquipmentType() {  // default constructors are getters and setters
        return equipmentType;
    }

    public void setEquipmentType(String equipmentType) {
        this.equipmentType = equipmentType;
    }

    public String getEquipmentLocation() {
        return equipmentLocation;
    }

    public void setEquipmentLocation(String equipmentLocation) {
        this.equipmentLocation = equipmentLocation;
    }

    private String equipmentLocation = "";

    public abstract Boolean useEquipment(Integer duration);

    public abstract Boolean useEquipment(Integer duration, Integer intesity);

    public Boolean useEquipment(String reason) {
        System.out.printf("Using the equipment sux");
    }

}

    @Override
    public String toString() {
        return "Equipment{" +
                "equipmentType='" + equipmentType + '\'' +
                ", equipmentLocation='" + equipmentLocation + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Equipment)) return false;
        Equipment equipment = (Equipment) o;
        return Objects.equals(getEquipmentType(), equipment.getEquipmentType()) &&
                Objects.equals(getEquipmentLocation(), equipment.getEquipmentLocation());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getEquipmentType(), getEquipmentLocation());
    }
}
//generate equals and hashcode  at end with toString