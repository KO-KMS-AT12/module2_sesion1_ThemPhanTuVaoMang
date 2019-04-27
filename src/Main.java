import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = hienThiMang(nhapPhanTuMang(nhapSizeMang(scanner), scanner));
        System.out.print("Nhap gia tri phan tu them vao mang la: ");
        int value = scanner.nextInt();
        System.out.print("Nhap vi tri dua phan tu vao mang la: ");
        int index = scanner.nextInt();
        hienThiMang(themPhanTu(arr, value, index));
    }

    static int nhapSizeMang(Scanner scanner) {
        System.out.print("Nhap vao kich thuoc cua mang: ");
        int size = scanner.nextInt();
        return size;
    }

    static int[] nhapPhanTuMang(int size, Scanner scanner) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Nhap phan tu thu " + i + " la");
            arr[i] = scanner.nextInt();
        }
        return arr;
    }

    static int[] hienThiMang(int[] arr) {
        System.out.print("[ ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(+arr[i] + " ");
        }
        System.out.println("]");
        return arr;
    }

    private static int[] themPhanTu(int arr[], int value, int index) {
        int length = arr.length;
        int newArr[] = new int[length + 1];
        System.arraycopy(arr, 0, newArr, 0, index);
        newArr[index] = value;
        System.arraycopy(arr, index, newArr, index + 1, length - index);
        return newArr;
    }
}
