package bridge_pattern.concrete;

import bridge_pattern.BinatangDarat;

public class Ayam extends BinatangDarat {
    @Override
    public String getName() {
        return "Ayam";
    }

    @Override
    public Integer getJumlahKaki() {
        return 2;
    }
}
