package bridge_pattern;

import bridge_pattern.concrete.Ayam;
import bridge_pattern.concrete.Hiu;
import bridge_pattern.concrete.Kambing;
import bridge_pattern.concrete.Lele;

import java.util.Arrays;
import java.util.List;

public class BridgePatternDemo {
    public static void main(String[] args) {
        List<Binatang> binatangs = Arrays.asList(
                new Ayam(),
                new Hiu(),
                new Kambing(),
                new Lele()
        );

        binatangs.forEach(binatang -> {
            if (binatang instanceof BinatangAir) {
                BinatangAir binatangAir = (BinatangAir) binatang;
                System.out.println(binatangAir.getName() + " hidup di air");
            } else if (binatang instanceof  BinatangDarat) {
                BinatangDarat binatangDarat = (BinatangDarat) binatang;
                System.out.println(binatangDarat.getName() + " hidup di darat dengan kaki " + binatangDarat.getJumlahKaki());
            }
        });
    }
}
