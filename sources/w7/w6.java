package w7;
public abstract class w6 {
    public static int a(int i10) {
        if (i10 != 1) {
            if (i10 == 2) {
                return 1;
            }
            if (i10 == 4) {
                return 2;
            }
            if (i10 != 8) {
                if (i10 == 16) {
                    return 4;
                }
                if (i10 != 32) {
                    if (i10 != 64) {
                        if (i10 != 128) {
                            if (i10 == 256) {
                                return 8;
                            }
                            if (i10 == 512) {
                                return 9;
                            }
                            throw new IllegalArgumentException(hc.b.j(i10, "type needs to be >= FIRST and <= LAST, type="));
                        }
                        return 7;
                    }
                    return 6;
                }
                return 5;
            }
            return 3;
        }
        return 0;
    }
}
