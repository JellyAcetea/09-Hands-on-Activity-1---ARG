public class RunQuad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select from the following:");
        System.out.println("R - Rectangle");
        System.out.println("S - Square");
        System.out.println("P - Parallelogram");
        System.out.println("H - Rhombus");
        System.out.println("T - Trapezoid");
        String choice = scanner.nextLine().toUpperCase();

        switch (choice) {
            case "R":
                Rectangle rectangle = new Rectangle();
                rectangle.showDescription();
                break;
            case "S":
                Square square = new Square();
                square.showDescription();
                break;
            case "P":
                Parallelogram parallelogram = new Parallelogram();
                parallelogram.showDescription();
                break;
            case "H":
                Rhombus rhombus = new Rhombus();
                rhombus.showDescription();
                break;
            case "T":
                Trapezoid trapezoid = new Trapezoid();
                trapezoid.showDescription();
                break;
            default:
                System.out.println("Invalid choice.");
        }
        scanner.close();
    }
}
