package y6;

import java.math.RoundingMode;
import java.util.Arrays;

public final class j0 {

    public final String f49742a;

    public final char[] f49743b;

    public final int f49744c;
    public final int d;

    public final int f49745e;

    public final int f49746f;

    public final byte[] f49747g;
    public final boolean h;

    public j0(String str, char[] cArr) {
        byte[] bArr = new byte[128];
        Arrays.fill(bArr, (byte) -1);
        for (int i10 = 0; i10 < cArr.length; i10++) {
            char c10 = cArr[i10];
            if (!(c10 < 128)) {
                throw new IllegalArgumentException(a.c("Non-ASCII character: %s", Character.valueOf(c10)));
            }
            if (!(bArr[c10] == -1)) {
                throw new IllegalArgumentException(a.c("Duplicate character: %s", Character.valueOf(c10)));
            }
            bArr[c10] = (byte) i10;
        }
        this(str, cArr, bArr, false);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj;
        return this.h == j0Var.h && Arrays.equals(this.f49743b, j0Var.f49743b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f49743b) + (true != this.h ? 1237 : 1231);
    }

    public final String toString() {
        return this.f49742a;
    }

    public j0(String str, char[] cArr, byte[] bArr, boolean z10) {
        int iNumberOfLeadingZeros;
        boolean[] zArr;
        int i10;
        this.f49742a = str;
        cArr.getClass();
        this.f49743b = cArr;
        try {
            int length = cArr.length;
            RoundingMode roundingMode = RoundingMode.UNNECESSARY;
            if (length > 0) {
                switch (n0.f49761a[roundingMode.ordinal()]) {
                    case 1:
                        if (((length - 1) & length) != 0) {
                            throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
                        }
                    case 2:
                    case 3:
                        iNumberOfLeadingZeros = 31 - Integer.numberOfLeadingZeros(length);
                        this.d = iNumberOfLeadingZeros;
                        int iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(iNumberOfLeadingZeros);
                        int i11 = 1 << (3 - iNumberOfTrailingZeros);
                        this.f49745e = i11;
                        this.f49746f = iNumberOfLeadingZeros >> iNumberOfTrailingZeros;
                        this.f49744c = length - 1;
                        this.f49747g = bArr;
                        zArr = new boolean[i11];
                        for (i10 = 0; i10 < this.f49746f; i10++) {
                            int i12 = this.d;
                            RoundingMode roundingMode2 = RoundingMode.CEILING;
                            zArr[a.a(i10 * 8, i12)] = true;
                        }
                        this.h = z10;
                        return;
                    case 4:
                    case 5:
                        iNumberOfLeadingZeros = 32 - Integer.numberOfLeadingZeros(length - 1);
                        this.d = iNumberOfLeadingZeros;
                        int iNumberOfTrailingZeros2 = Integer.numberOfTrailingZeros(iNumberOfLeadingZeros);
                        int i13 = 1 << (3 - iNumberOfTrailingZeros2);
                        this.f49745e = i13;
                        this.f49746f = iNumberOfLeadingZeros >> iNumberOfTrailingZeros2;
                        this.f49744c = length - 1;
                        this.f49747g = bArr;
                        zArr = new boolean[i13];
                        while (i10 < this.f49746f) {
                            int i14 = this.d;
                            RoundingMode roundingMode3 = RoundingMode.CEILING;
                            zArr[a.a(i10 * 8, i14)] = true;
                        }
                        this.h = z10;
                        return;
                    case 6:
                    case 7:
                    case 8:
                        int iNumberOfLeadingZeros2 = Integer.numberOfLeadingZeros(length);
                        iNumberOfLeadingZeros = (31 - iNumberOfLeadingZeros2) + ((((-1257966797) >>> iNumberOfLeadingZeros2) - length) >>> 31);
                        this.d = iNumberOfLeadingZeros;
                        int iNumberOfTrailingZeros3 = Integer.numberOfTrailingZeros(iNumberOfLeadingZeros);
                        int i15 = 1 << (3 - iNumberOfTrailingZeros3);
                        this.f49745e = i15;
                        this.f49746f = iNumberOfLeadingZeros >> iNumberOfTrailingZeros3;
                        this.f49744c = length - 1;
                        this.f49747g = bArr;
                        zArr = new boolean[i15];
                        while (i10 < this.f49746f) {
                            int i16 = this.d;
                            RoundingMode roundingMode4 = RoundingMode.CEILING;
                            zArr[a.a(i10 * 8, i16)] = true;
                        }
                        this.h = z10;
                        return;
                    default:
                        throw new AssertionError();
                }
            } else {
                throw new IllegalArgumentException("x (0) must be > 0");
            }
        } catch (ArithmeticException e9) {
            throw new IllegalArgumentException(i0.a.k(cArr.length, "Illegal alphabet length "), e9);
        }
    }
}
