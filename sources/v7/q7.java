package v7;
public abstract class q7 {
    public static long a(long j3, long j10) {
        boolean z10;
        long j11 = j3 + j10;
        boolean z11 = false;
        if ((j3 ^ j10) < 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if ((j3 ^ j11) >= 0) {
            z11 = true;
        }
        if (z10 | z11) {
            return j11;
        }
        throw new ArithmeticException(a4.a.r(a4.a.t(j3, "overflow: checkedAdd(", ", "), j10, ")"));
    }

    public static long b(long r8, long r10, java.math.RoundingMode r12) {
        throw new UnsupportedOperationException("Method not decompiled: v7.q7.b(long, long, java.math.RoundingMode):long");
    }

    public static long c(long j3, long j10) {
        r7.a(j3, "a");
        r7.a(j10, "b");
        if (j3 == 0) {
            return j10;
        }
        if (j10 == 0) {
            return j3;
        }
        int numberOfTrailingZeros = Long.numberOfTrailingZeros(j3);
        long j11 = j3 >> numberOfTrailingZeros;
        int numberOfTrailingZeros2 = Long.numberOfTrailingZeros(j10);
        long j12 = j10 >> numberOfTrailingZeros2;
        while (j11 != j12) {
            long j13 = j11 - j12;
            long j14 = (j13 >> 63) & j13;
            long j15 = (j13 - j14) - j14;
            j12 += j14;
            j11 = j15 >> Long.numberOfTrailingZeros(j15);
        }
        return j11 << Math.min(numberOfTrailingZeros, numberOfTrailingZeros2);
    }

    public static long d(long j3, long j10) {
        boolean z10;
        boolean z11;
        int numberOfLeadingZeros = Long.numberOfLeadingZeros(~j10) + Long.numberOfLeadingZeros(j10) + Long.numberOfLeadingZeros(~j3) + Long.numberOfLeadingZeros(j3);
        if (numberOfLeadingZeros > 65) {
            return j3 * j10;
        }
        long j11 = ((j3 ^ j10) >>> 63) + Long.MAX_VALUE;
        boolean z12 = false;
        if (numberOfLeadingZeros < 64) {
            z10 = true;
        } else {
            z10 = false;
        }
        int i10 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        if (i10 < 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (j10 == Long.MIN_VALUE) {
            z12 = true;
        }
        if (!(z10 | (z12 & z11))) {
            long j12 = j3 * j10;
            if (i10 == 0 || j12 / j3 == j10) {
                return j12;
            }
        }
        return j11;
    }
}
