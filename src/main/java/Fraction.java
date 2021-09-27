import java.util.ArrayList;

public class Fraction {
    /*Phân số
         Khai báo kiểu dữ liệu phân số (PHANSO)
         Nhập/Xuất ds phân số
         Rút gọn phân số
         Kiểm tra phân số tối giản
     */
    private int _tuSo;
    private int _mauSo;
    static ArrayList<Fraction> listFraction = new ArrayList<>();

    //Nhap phan so
    public Fraction(int tuSo, int mauSo) {
        this._tuSo = tuSo;
        this._mauSo = mauSo;
    }

    //Nhập ds 1 phan so
    public static void addListToList(String fra) {
        String[] input = fra.split("\\s+");
        for (int i = 0; i < input.length; i++) {
            String[] item = input[i].split("/");
            int tuSo = Integer.parseInt(item[0]);
            int mauSo = Integer.parseInt(item[1]);
            Fraction fraction = new Fraction(tuSo, mauSo);
            listFraction.add(fraction);

        }
    }

    //Them 1 phan so vao ds
    public static void addToList(String fra) {
        String[] input = fra.split("/");
        int tuSo = Integer.parseInt(input[0]);
        int mauSo = Integer.parseInt(input[1]);
        if (mauSo == 0) {
            System.out.println("Fraction incorrect!");
        } else {
            Fraction fraction = new Fraction(tuSo, mauSo);
            listFraction.add(fraction);
        }
    }

    //Xuat ds phan so
    public static void printList() {
        if (listFraction.isEmpty()) {
            System.out.println("List is empty!");
        } else {
            for (Fraction fr : listFraction) {
                System.out.print(fr);
            }
        }
    }

    //Xoa ps tại vị trí k
    public static void removeItemInList(int k) {
        listFraction.remove(k - 1);
    }

    //Cap nhat ps tại vị trí k
    public static void replaceItemInList(int k, String fr) {
        String[] input = fr.split("/");
        int tuSo = Integer.parseInt(input[0]);
        int mauSo = Integer.parseInt(input[1]);
        if (mauSo == 0) {
            System.out.println("Fraction incorrect!");
        } else {
            Fraction fraction = new Fraction(tuSo, mauSo);
            listFraction.set(k - 1, fraction);
        }
    }

    //Tìm các phan so co giá trị lớn nhất
    public static Fraction[] findMaxfraction() {
        Fraction[] arr = new Fraction[listFraction.size()];
        return arr;
    }

    //Xóa tất cả các phân số
    public static void removeAllList() {
        for (int i = listFraction.size(); i >= 0; i--) {
            listFraction.clear();
        }
    }

}
