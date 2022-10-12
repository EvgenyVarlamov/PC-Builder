package geekbrains;

public class AsusDesktopDuilder extends DesktopBuilder {

    @Override
    void buildCpu() {
        desktop.setCpu((String) "Intel Core i7");
    }

    @Override
    void buildGrafhiController() {
        desktop.setGraphicController("NVIDIA GeForce RTX 3080 - 10240 Mb");
    }

    @Override
    void buildMotherBoard() {
        desktop.setMotherBoard("ASUS G35CG-1170KF003W");
    }

    @Override
    void buildOs() {
        desktop.setOs("Windows 11 Home");
    }

    @Override
    void buildPowerSupply() {
        desktop.setPowerSupply("700 W");
    }


    void buildRam() {
        desktop.setRam("16 GB");
    }

    @Override
    void buildSsd() {
        desktop.setSsd("1 TB");
    }
}
