package q7;

import java.math.RoundingMode;
import java.util.Arrays;
public final class j0 {
    public final String f56053a;
    public final char[] f56054b;
    public final int f56055c;
    public final int d;
    public final int f56056e;
    public final int f56057f;
    public final byte[] f56058g;
    public final boolean h;

    public j0(java.lang.String r9, char[] r10) {
        throw new UnsupportedOperationException("Method not decompiled: q7.j0.<init>(java.lang.String, char[]):void");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j0) {
            j0 j0Var = (j0) obj;
            if (this.h == j0Var.h && Arrays.equals(this.f56054b, j0Var.f56054b)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        int hashCode = Arrays.hashCode(this.f56054b);
        if (true != this.h) {
            i7 = 1237;
        } else {
            i7 = 1231;
        }
        return hashCode + i7;
    }

    public final String toString() {
        return this.f56053a;
    }

    public j0(String str, char[] cArr, byte[] bArr, boolean z10) {
        int numberOfLeadingZeros;
        this.f56053a = str;
        cArr.getClass();
        this.f56054b = cArr;
        try {
            int length = cArr.length;
            RoundingMode roundingMode = RoundingMode.UNNECESSARY;
            if (length > 0) {
                switch (n0.f56072a[roundingMode.ordinal()]) {
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
                int i7 = 1 << (3 - numberOfTrailingZeros);
                this.f56056e = i7;
                this.f56057f = numberOfLeadingZeros >> numberOfTrailingZeros;
                this.f56055c = length - 1;
                this.f56058g = bArr;
                boolean[] zArr = new boolean[i7];
                for (int i10 = 0; i10 < this.f56057f; i10++) {
                    int i11 = this.d;
                    RoundingMode roundingMode2 = RoundingMode.CEILING;
                    zArr[a.a(i10 * 8, i11)] = true;
                }
                this.h = z10;
                return;
            }
            throw new IllegalArgumentException("x (0) must be > 0");
        } catch (ArithmeticException e10) {
            throw new IllegalArgumentException(i5.c.i(cArr.length, "Illegal alphabet length "), e10);
        }
    }
}
