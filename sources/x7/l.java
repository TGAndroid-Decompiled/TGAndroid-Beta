package x7;
public abstract class l {
    public static int a(int i3) {
        if (i3 != 1) {
            if (i3 == 2) {
                return 1;
            }
            if (i3 == 4) {
                return 2;
            }
            if (i3 != 8) {
                if (i3 == 16) {
                    return 4;
                }
                if (i3 != 32) {
                    if (i3 != 64) {
                        if (i3 != 128) {
                            if (i3 == 256) {
                                return 8;
                            }
                            if (i3 == 512) {
                                return 9;
                            }
                            throw new IllegalArgumentException(k2.p1.i(i3, "type needs to be >= FIRST and <= LAST, type="));
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
