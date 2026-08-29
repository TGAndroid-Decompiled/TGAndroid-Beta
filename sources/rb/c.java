package rb;
public final class c {
    public static final int[][] f47094c = {new int[]{21522, 0}, new int[]{20773, 1}, new int[]{24188, 2}, new int[]{23371, 3}, new int[]{17913, 4}, new int[]{16590, 5}, new int[]{20375, 6}, new int[]{19104, 7}, new int[]{30660, 8}, new int[]{29427, 9}, new int[]{32170, 10}, new int[]{30877, 11}, new int[]{26159, 12}, new int[]{25368, 13}, new int[]{27713, 14}, new int[]{26998, 15}, new int[]{5769, 16}, new int[]{5054, 17}, new int[]{7399, 18}, new int[]{6608, 19}, new int[]{1890, 20}, new int[]{597, 21}, new int[]{3340, 22}, new int[]{2107, 23}, new int[]{13663, 24}, new int[]{12392, 25}, new int[]{16177, 26}, new int[]{14854, 27}, new int[]{9396, 28}, new int[]{8579, 29}, new int[]{11994, 30}, new int[]{11245, 31}};
    public final b f47095a;
    public final byte f47096b;

    public c(int i10) {
        int i11 = (i10 >> 3) & 3;
        if (i11 >= 0 && i11 < 4) {
            this.f47095a = b.d[i11];
            this.f47096b = (byte) (i10 & 7);
            return;
        }
        throw new IllegalArgumentException();
    }

    public static c a(int i10, int i11) {
        int bitCount;
        int i12 = Integer.MAX_VALUE;
        int i13 = 0;
        for (int i14 = 0; i14 < 32; i14++) {
            int[] iArr = f47094c[i14];
            int i15 = iArr[0];
            if (i15 != i10 && i15 != i11) {
                int bitCount2 = Integer.bitCount(i10 ^ i15);
                if (bitCount2 < i12) {
                    i13 = iArr[1];
                    i12 = bitCount2;
                }
                if (i10 != i11 && (bitCount = Integer.bitCount(i15 ^ i11)) < i12) {
                    i13 = iArr[1];
                    i12 = bitCount;
                }
            } else {
                return new c(iArr[1]);
            }
        }
        if (i12 <= 3) {
            return new c(i13);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f47095a != cVar.f47095a || this.f47096b != cVar.f47096b) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.f47095a.ordinal() << 3) | this.f47096b;
    }
}
