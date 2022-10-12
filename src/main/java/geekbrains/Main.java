package geekbrains;

public class Main {

    public static void main(String[] args) {
        Director director=new Director();
        director.setBuilder(new AsusDesktopDuilder());
        Desktop desktop=director.buildDesktop();
        System.out.println(desktop);
    }
}
