package geekbrains;

public class UsualDesktopBuilder extends DesktopBuilder {

    @Override
    void buildCpu() {
        desktop.setCpu("Intel Core i5");
    }

    @Override
    void buildGrafhiController() {
        desktop.setGraphicController("Integrated");
    }

    @Override
    void buildMotherBoard() {
        desktop.setMotherBoard("Noname");
    }

    @Override
    void buildOs() {
        desktop.setOs("FreeOS");
    }

    @Override
    void buildPowerSupply() {
        desktop.setPowerSupply("300 W");
    }

    @Override
    void buildRam() {
        desktop.setRam("8 GB");
    }

    @Override
    void buildSsd() {
        desktop.setSsd("256 GB");
    }
}
