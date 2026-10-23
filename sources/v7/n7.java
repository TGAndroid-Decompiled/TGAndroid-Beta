package v7;

import java.math.RoundingMode;
public abstract class n7 {
    public static long a(long j10, long j11) {
        boolean z10;
        long j12 = j10 + j11;
        boolean z11 = false;
        if ((j10 ^ j11) < 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if ((j10 ^ j12) >= 0) {
            z11 = true;
        }
        if (z10 | z11) {
            return j12;
        }
        throw new ArithmeticException(a1.g.r(a1.g.t(j10, "overflow: checkedAdd(", ", "), j11, ")"));
    }

    public static long b(long j10, long j11, RoundingMode roundingMode) {
        roundingMode.getClass();
        long j12 = j10 / j11;
        long j13 = j10 - (j11 * j12);
        int i10 = (j13 > 0L ? 1 : (j13 == 0L ? 0 : -1));
        if (i10 == 0) {
            return j12;
        }
        boolean z10 = true;
        int i11 = ((int) ((j10 ^ j11) >> 63)) | 1;
        switch (g9.e.f10963a[roundingMode.ordinal()]) {
            case 1:
                if (i10 != 0) {
                    z10 = false;
                }
                o7.b(z10);
                return j12;
            case 2:
                return j12;
            case 3:
                if (i11 >= 0) {
                    return j12;
                }
                return j12 + i11;
            case 4:
                return j12 + i11;
            case 5:
                if (i11 <= 0) {
                    return j12;
                }
                return j12 + i11;
            case 6:
            case 7:
            case 8:
                long abs = Math.abs(j13);
                int i12 = ((abs - (Math.abs(j11) - abs)) > 0L ? 1 : ((abs - (Math.abs(j11) - abs)) == 0L ? 0 : -1));
                if (i12 == 0) {
                    if (roundingMode != RoundingMode.HALF_UP && (roundingMode != RoundingMode.HALF_EVEN || (1 & j12) == 0)) {
                        return j12;
                    }
                } else if (i12 <= 0) {
                    return j12;
                }
                return j12 + i11;
            default:
                throw new AssertionError();
        }
    }

    public static long c(long j10, long j11) {
        o7.a(j10, "a");
        o7.a(j11, "b");
        if (j10 == 0) {
            return j11;
        }
        if (j11 == 0) {
            return j10;
        }
        int numberOfTrailingZeros = Long.numberOfTrailingZeros(j10);
        long j12 = j10 >> numberOfTrailingZeros;
        int numberOfTrailingZeros2 = Long.numberOfTrailingZeros(j11);
        long j13 = j11 >> numberOfTrailingZeros2;
        while (j12 != j13) {
            long j14 = j12 - j13;
            long j15 = (j14 >> 63) & j14;
            long j16 = (j14 - j15) - j15;
            j13 += j15;
            j12 = j16 >> Long.numberOfTrailingZeros(j16);
        }
        return j12 << Math.min(numberOfTrailingZeros, numberOfTrailingZeros2);
    }

    public static long d(long j10, long j11) {
        boolean z10;
        boolean z11;
        int numberOfLeadingZeros = Long.numberOfLeadingZeros(~j11) + Long.numberOfLeadingZeros(j11) + Long.numberOfLeadingZeros(~j10) + Long.numberOfLeadingZeros(j10);
        if (numberOfLeadingZeros > 65) {
            return j10 * j11;
        }
        long j12 = ((j10 ^ j11) >>> 63) + Long.MAX_VALUE;
        boolean z12 = false;
        if (numberOfLeadingZeros < 64) {
            z10 = true;
        } else {
            z10 = false;
        }
        int i10 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        if (i10 < 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (j11 == Long.MIN_VALUE) {
            z12 = true;
        }
        if (!(z10 | (z12 & z11))) {
            long j13 = j10 * j11;
            if (i10 == 0 || j13 / j10 == j11) {
                return j13;
            }
        }
        return j12;
    }
}
