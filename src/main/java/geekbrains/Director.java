package geekbrains;

public class Director {
    DesktopBuilder builder;

    public void setBuilder(DesktopBuilder builder) {
        this.builder = builder;
    }

    Desktop buildDesktop() {
        builder.createDesktop();
        builder.buildCpu();
        builder.buildGrafhiController();
        builder.buildMotherBoard();
        builder.buildOs();
        builder.buildPowerSupply();
        builder.buildRam();
        builder.buildSsd();
        Desktop desktop = builder.getDesktop();
        return desktop;
    }
}
