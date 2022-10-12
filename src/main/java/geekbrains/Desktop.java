package geekbrains;

import geekbrains.parts.*;

public class Desktop {

    String cpu;
    String graphicController;
    String motherBoard;
    String os;
    String powerSupply;
    String ram;
    String ssd;

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public void setGraphicController(String graphicController) {
        this.graphicController = graphicController;
    }

    public void setMotherBoard(String motherBoard) {
        this.motherBoard = motherBoard;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public void setPowerSupply(String powerSupply) {
        this.powerSupply = powerSupply;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public void setSsd(String ssd) {
        this.ssd = ssd;
    }

    @Override
    public String toString() {
        return "Desktop{" +
                "cpu=" + cpu +
                ", graphicController=" + graphicController +
                ", motherBoard=" + motherBoard +
                ", os=" + os +
                ", powerSupply=" + powerSupply +
                ", ram=" + ram +
                ", ssd=" + ssd +
                '}';
    }
}
