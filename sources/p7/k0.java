package p7;

import java.math.RoundingMode;
import java.util.Arrays;
import k2.p1;
public final class k0 {
    public final String f53372a;
    public final char[] f53373b;
    public final int f53374c;
    public final int d;
    public final int f53375e;
    public final int f53376f;
    public final byte[] f53377g;
    public final boolean h;

    public k0(java.lang.String r9, char[] r10) {
        throw new UnsupportedOperationException("Method not decompiled: p7.k0.<init>(java.lang.String, char[]):void");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k0) {
            k0 k0Var = (k0) obj;
            if (this.h == k0Var.h && Arrays.equals(this.f53373b, k0Var.f53373b)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int i3;
        int hashCode = Arrays.hashCode(this.f53373b);
        if (true != this.h) {
            i3 = 1237;
        } else {
            i3 = 1231;
        }
        return hashCode + i3;
    }

    public final String toString() {
        return this.f53372a;
    }

    public k0(String str, char[] cArr, byte[] bArr, boolean z10) {
        int numberOfLeadingZeros;
        this.f53372a = str;
        cArr.getClass();
        this.f53373b = cArr;
        try {
            int length = cArr.length;
            RoundingMode roundingMode = RoundingMode.UNNECESSARY;
            if (length > 0) {
                switch (o0.f53391a[roundingMode.ordinal()]) {
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
                int i3 = 1 << (3 - numberOfTrailingZeros);
                this.f53375e = i3;
                this.f53376f = numberOfLeadingZeros >> numberOfTrailingZeros;
                this.f53374c = length - 1;
                this.f53377g = bArr;
                boolean[] zArr = new boolean[i3];
                for (int i10 = 0; i10 < this.f53376f; i10++) {
                    int i11 = this.d;
                    RoundingMode roundingMode2 = RoundingMode.CEILING;
                    zArr[a.a(i10 * 8, i11)] = true;
                }
                this.h = z10;
                return;
            }
            throw new IllegalArgumentException("x (0) must be > 0");
        } catch (ArithmeticException e10) {
            throw new IllegalArgumentException(p1.i(cArr.length, "Illegal alphabet length "), e10);
        }
    }
}
