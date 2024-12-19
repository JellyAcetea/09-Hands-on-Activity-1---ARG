public class Square extends Rectangle {
    @Override
    public void showDescription() {
        super.showDescription(); // Call Rectangle's method
        System.out.println("- has 4 equal sides");
    }
}