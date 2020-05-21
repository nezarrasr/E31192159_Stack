/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e31192159_stack;

/**
 *
 * @author Nezarra Selvia R
 * Golongan D
 */
public class Stack {

    private String data[]; //deklarasi array
    private int size; //deklarasi variabel max sebagai batas kapasitas array
    private int top; //deklarasi variabel top sebagai pointer data yang paling akhir

    private Stack(int kapasitas) {
        size = kapasitas;
        top = -1; //indikator bahwa array masih kosong
        data = new String[size];
    }

    public boolean isEmpty() { //proses mengecek array
        return top == -1; //jika index top -1 maka stacknya kosong
    }

    public boolean isFull() { //proses pengujian. jika benar makan mengembalikan nilai true
        //dan menyatakan bahwa array telah penuh
        return top == size - 1; //jika top=size-1 maka stacknya penuh
    }

    public void push(String input) { //proses memasukkan data ke dalam array
        if (isFull()) { //kondisi jika stack penuh
            System.out.println("Stack penuh"); //output saat stack penuh
        } else {
            data[++top] = input; //jika stack kosong maka top ditambah 1
            System.out.println("Data " + input + " dimasukkan ke dalam stack");
        }
    }

    public void pop() { //proses mengeluarkan data dari urutan paling akhir
        if (isEmpty()) { //kondisi jika stack kosong
            System.out.println("Stack kosong"); //output saat stack kosong
        } else {
            String temp = data[top];
            data[top] = data[top--]; //data kedua dari akhir menjadi data paling akhir
            System.out.println("Data " + temp + " dihapus dari dalam stack");
        }
    }

    public void infoStack() { //proses mengakses data dari dalam stack
        System.out.println("");
        for (int i = 0; i <= top; i++) { //perulangan untuk menampilkan data dalam array
            System.out.println("Data stack ke " + i + " = " + data[i]);
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        Stack s = new Stack(10);
        s.push("Algoritma Pemrograman");
        s.push("Struktur Data");
        s.push("Basis Data");
        s.push("Jaringan Komunikasi");
        s.push("Komputer Dasar");
        s.infoStack();
        s.pop();
        s.pop();
        s.infoStack();
        s.pop();
        s.infoStack();
    }
}
