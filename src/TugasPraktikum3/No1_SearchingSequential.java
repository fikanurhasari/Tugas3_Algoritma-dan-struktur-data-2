package TugasPraktikum3;
    import java.util.Scanner;
public class No1_SearchingSequential {
    public static void main(String[] args) {
        System.out.println("Fika Nur Hasari - 21092001");
        System.out.println("No.1 Searching Sequential");
        System.out.println("");
        
        String data[] = {"Galileo","Archimedes","Alkhawarizmi","Aljabar","Nama Mahasiswa","Tesla"};
        String key;
        
        //fitur scanner
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan data yang dicari: ");
        key = scan.nextLine();
        System.out.println("");
                
        //data array
        System.out.print("isi data adalah:");
            for (int i = 0; i<data.length; i++) {
                System.out.print(data[i] + "");
                System.out.println("");
            }
        for (int i=0; i<data.length; i++) {
            if (key.equalsIgnoreCase(data[i])) {
                System.out.println("");
                System.out.print(" Data "+key+" berada pada index ke - " + i);
                break; //stop perulangan
            }
        }
        System.out.println("\n");
        System.out.println();
    }
}
