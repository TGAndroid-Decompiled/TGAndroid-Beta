package v7;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
public abstract class y7 {
    public static List a(int... iArr) {
        if (iArr.length == 0) {
            return Collections.EMPTY_LIST;
        }
        return new h9.b(0, iArr.length, iArr);
    }

    public static int b(long j3) {
        boolean z10;
        int i10 = (int) j3;
        if (i10 == j3) {
            z10 = true;
        } else {
            z10 = false;
        }
        t6.b(j3, "Out of range: %s", z10);
        return i10;
    }

    public static int c(byte b10, byte b11, byte b12, byte b13) {
        return (b10 << 24) | ((b11 & 255) << 16) | ((b12 & 255) << 8) | (b13 & 255);
    }

    public static int d(int i10, int i11, int i12, int[] iArr) {
        while (i11 < i12) {
            if (iArr[i11] == i10) {
                return i11;
            }
            i11++;
        }
        return -1;
    }

    public static int e(long j3) {
        if (j3 > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j3 < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j3;
    }

    public static int[] f(Collection collection) {
        if (collection instanceof h9.b) {
            h9.b bVar = (h9.b) collection;
            return Arrays.copyOfRange(bVar.f9272a, bVar.f9273b, bVar.f9274c);
        }
        Object[] array = collection.toArray();
        int length = array.length;
        int[] iArr = new int[length];
        for (int i10 = 0; i10 < length; i10++) {
            Object obj = array[i10];
            obj.getClass();
            iArr[i10] = ((Number) obj).intValue();
        }
        return iArr;
    }

    public static Integer g(String str) {
        byte b10;
        Integer num;
        Long l4;
        byte b11;
        str.getClass();
        if (!str.isEmpty()) {
            int i10 = 0;
            if (str.charAt(0) == '-') {
                i10 = 1;
            }
            if (i10 != str.length()) {
                int i11 = i10 + 1;
                char charAt = str.charAt(i10);
                if (charAt < 128) {
                    b10 = h9.c.f9275a[charAt];
                } else {
                    byte[] bArr = h9.c.f9275a;
                    b10 = -1;
                }
                if (b10 >= 0 && b10 < 10) {
                    long j3 = -b10;
                    long j10 = 10;
                    long j11 = Long.MIN_VALUE / j10;
                    while (true) {
                        if (i11 < str.length()) {
                            int i12 = i11 + 1;
                            char charAt2 = str.charAt(i11);
                            if (charAt2 < 128) {
                                b11 = h9.c.f9275a[charAt2];
                            } else {
                                byte[] bArr2 = h9.c.f9275a;
                                b11 = -1;
                            }
                            if (b11 < 0 || b11 >= 10 || j3 < j11) {
                                break;
                            }
                            long j12 = j3 * j10;
                            num = null;
                            long j13 = b11;
                            if (j12 < j13 - Long.MIN_VALUE) {
                                break;
                            }
                            j3 = j12 - j13;
                            i11 = i12;
                        } else {
                            num = null;
                            if (i10 != 0) {
                                l4 = Long.valueOf(j3);
                            } else if (j3 != Long.MIN_VALUE) {
                                l4 = Long.valueOf(-j3);
                            }
                        }
                    }
                }
                num = null;
                l4 = num;
                if (l4 == 0 && l4.longValue() == l4.intValue()) {
                    return Integer.valueOf(l4.intValue());
                }
                return num;
            }
        }
        l4 = 0;
        num = null;
        if (l4 == 0) {
        }
        return num;
    }
}
