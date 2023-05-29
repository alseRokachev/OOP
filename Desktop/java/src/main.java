import java.util.LinkedList;
public class Main {
    public static void main(String[] args) {
        WaterVendingMachine wvm = new WaterVendingMachine();
        Product bonAqua = new Water("BonAqua", 30);
        Product redKey = new Water("RedKey", 35);
        LinkedList<Product> list = new LinkedList<>();
        list.add(bonAqua);
        list.add(redKey);
        wvm.putProduct(list);
        System.out.println(wvm.getProduct());
        System.out.println(wvm.getProduct());

        HotWaterVendingMachine hwvm = new HotWaterVendingMachine();
        Product jacobs = new HotWater("Jacobs", 45, 90);
        Product nescafe = new HotWater("Nescafe", 50, 90);
        Product greenfield = new HotWater("Greenfield", 55, 90);
        LinkedList<Product> hotWaters = new LinkedList<>();
        hotWaters.add(nescafe);
        hotWaters.add(jacobs);
        hotWaters.add(greenfield);
        hwvm.putProduct(hotWaters);
        System.out.println(hwvm.getProduct());
        System.out.println(hwvm.getProduct());
        System.out.println(hwvm.getProduct());
    }
}