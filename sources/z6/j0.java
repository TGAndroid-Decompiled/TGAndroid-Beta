package z6;

import java.math.RoundingMode;
import java.util.Arrays;
public final class j0 {
    public final String f50725a;
    public final char[] f50726b;
    public final int f50727c;
    public final int d;
    public final int f50728e;
    public final int f50729f;
    public final byte[] f50730g;
    public final boolean h;

    public j0(java.lang.String r9, char[] r10) {
        throw new UnsupportedOperationException("Method not decompiled: z6.j0.<init>(java.lang.String, char[]):void");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j0) {
            j0 j0Var = (j0) obj;
            if (this.h == j0Var.h && Arrays.equals(this.f50726b, j0Var.f50726b)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = Arrays.hashCode(this.f50726b);
        if (true != this.h) {
            i10 = 1237;
        } else {
            i10 = 1231;
        }
        return hashCode + i10;
    }

    public final String toString() {
        return this.f50725a;
    }

    public j0(String str, char[] cArr, byte[] bArr, boolean z10) {
        int numberOfLeadingZeros;
        this.f50725a = str;
        cArr.getClass();
        this.f50726b = cArr;
        try {
            int length = cArr.length;
            RoundingMode roundingMode = RoundingMode.UNNECESSARY;
            if (length > 0) {
                switch (n0.f50744a[roundingMode.ordinal()]) {
                    case 1:
                        if (((length - 1) & length) != 0) {
                            throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
                        }
                    case 2:
                    case 3:
                        numberOfLeadingZeros = 31 - Integer.numberOfLeadingZeros(length);
                        break;
                    case 4:
                    case 5:
                        numberOfLeadingZeros = 32 - Integer.numberOfLeadingZeros(length - 1);
                        break;
                    case 6:
                    case 7:
                    case 8:
                        int numberOfLeadingZeros2 = Integer.numberOfLeadingZeros(length);
                        numberOfLeadingZeros = (31 - numberOfLeadingZeros2) + ((((-1257966797) >>> numberOfLeadingZeros2) - length) >>> 31);
                        break;
                    default:
                        throw new AssertionError();
                }
                this.d = numberOfLeadingZeros;
                int numberOfTrailingZeros = Integer.numberOfTrailingZeros(numberOfLeadingZeros);
                int i10 = 1 << (3 - numberOfTrailingZeros);
                this.f50728e = i10;
                this.f50729f = numberOfLeadingZeros >> numberOfTrailingZeros;
                this.f50727c = length - 1;
                this.f50730g = bArr;
                boolean[] zArr = new boolean[i10];
                for (int i11 = 0; i11 < this.f50729f; i11++) {
                    int i12 = this.d;
                    RoundingMode roundingMode2 = RoundingMode.CEILING;
                    zArr[a.a(i11 * 8, i12)] = true;
                }
                this.h = z10;
                return;
            }
            throw new IllegalArgumentException("x (0) must be > 0");
        } catch (ArithmeticException e10) {
            throw new IllegalArgumentException(j7.l1.k(cArr.length, "Illegal alphabet length "), e10);
        }
    }
}
