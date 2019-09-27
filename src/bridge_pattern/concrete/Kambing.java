package bridge_pattern.concrete;

import bridge_pattern.BinatangDarat;

public class Kambing extends BinatangDarat {
    @Override
    public String getName() {
        return "Kambing";
    }

    @Override
    public Integer getJumlahKaki() {
        return 4;
    }
}
