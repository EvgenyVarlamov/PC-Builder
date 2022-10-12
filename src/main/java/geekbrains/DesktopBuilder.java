package geekbrains;

public abstract class DesktopBuilder {
    Desktop desktop;

    void createDesktop() {
        desktop = new Desktop();
    }

    abstract void buildCpu();



    abstract void buildGrafhiController();

    abstract void buildMotherBoard();

    abstract void buildOs();

    abstract void buildPowerSupply();

    abstract void buildRam();
    abstract void buildSsd();

    Desktop getDesktop() {
        return desktop;
    }
}
