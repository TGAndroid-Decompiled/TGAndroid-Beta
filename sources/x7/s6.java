package x7;
public abstract class s6 {
    public static int a(Object obj, Object obj2, int i3, Object obj3, int[] iArr, Object[] objArr, Object[] objArr2) {
        int i10;
        int i11;
        int a10 = t6.a(obj);
        int i12 = a10 & i3;
        int b10 = b(i12, obj3);
        if (b10 != 0) {
            int i13 = ~i3;
            int i14 = a10 & i13;
            int i15 = -1;
            while (true) {
                i10 = b10 - 1;
                i11 = iArr[i10];
                if ((i11 & i13) != i14 || !w6.a(obj, objArr[i10]) || (objArr2 != null && !w6.a(obj2, objArr2[i10]))) {
                    int i16 = i11 & i3;
                    if (i16 == 0) {
                        break;
                    }
                    i15 = i10;
                    b10 = i16;
                }
            }
            int i17 = i11 & i3;
            if (i15 == -1) {
                d(i12, i17, obj3);
                return i10;
            }
            iArr[i15] = (i17 & i3) | (iArr[i15] & i13);
            return i10;
        }
        return -1;
    }

    public static int b(int i3, Object obj) {
        if (obj instanceof byte[]) {
            return ((byte[]) obj)[i3] & 255;
        }
        if (obj instanceof short[]) {
            return (char) ((short[]) obj)[i3];
        }
        return ((int[]) obj)[i3];
    }

    public static Object c(int i3) {
        if (i3 >= 2 && i3 <= 1073741824 && Integer.highestOneBit(i3) == i3) {
            if (i3 <= 256) {
                return new byte[i3];
            }
            if (i3 <= 65536) {
                return new short[i3];
            }
            return new int[i3];
        }
        throw new IllegalArgumentException(k2.p1.i(i3, "must be power of 2 between 2^1 and 2^30: "));
    }

    public static void d(int i3, int i10, Object obj) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i3] = (byte) i10;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i3] = (short) i10;
        } else {
            ((int[]) obj)[i3] = i10;
        }
    }
}
