public class Main {
    public static void main(String[] args) {
        PartTimeEmployee part = new PartTimeEmployee("Kiet", 15, 80);
        FullTimeEmployee full = new FullTimeEmployee("Thu", 20);

        System.out.println("nhan vien Partime: " + part.getName() + ", Luong: " + part.calculateSalary());
        System.out.println("nhan vien Fulltime: " + full.getName() + ",Luong: " +full.calculateSalary());
    }
}
