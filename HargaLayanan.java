/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appKasirLaundry;

/**
 *
 * @author HP
 */
import java.util.HashMap;
import java.util.Map;

public class HargaLayanan {

    // Map untuk menyimpan harga berdasarkan kombinasi layanan, barang, dan berat
    private static final Map<String, Double> hargaMap = new HashMap<>();

    static {
        // Misalnya data harga, Anda bisa mengubah atau menambah harga sesuai dengan kebutuhan
        hargaMap.put("Cuci Kering-Pakaian-1", 5000.0);
        hargaMap.put("Cuci Kering-Karpet-1", 10000.0);
        hargaMap.put("Cuci Setrika-Pakaian-1", 7000.0);
        hargaMap.put("Cuci Setrika-Karpet-1", 12000.0);
        // Tambahkan harga lainnya sesuai kebutuhan
    }

    // Metode untuk mendapatkan harga berdasarkan layanan, barang, dan berat 
    public static double getHarga(String jenisLayanan, String jenisBarang, double berat) {
        // Kombinasikan string untuk mencari harga di Map
        String key = jenisLayanan + "-" + jenisBarang + "-" + berat;
        // Ambil harga dari Map
        return hargaMap.getOrDefault(key, 0.0);  // Jika tidak ditemukan, kembalikan 0
    }
}
