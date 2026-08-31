package r3;

import h5.d0;
public final class b {
    public final long f46534a;
    public final long f46535b;
    public final long f46536c;
    public long d = 0;
    public long f46537e;
    public long f46538f;
    public long f46539g;
    public long h;

    public b(long j10, long j11, long j12, long j13, long j14, long j15) {
        this.f46534a = j10;
        this.f46535b = j11;
        this.f46537e = j12;
        this.f46538f = j13;
        this.f46539g = j14;
        this.f46536c = j15;
        this.h = a(j11, 0L, j12, j13, j14, j15);
    }

    public static long a(long j10, long j11, long j12, long j13, long j14, long j15) {
        if (j13 + 1 < j14 && j11 + 1 < j12) {
            long j16 = ((float) (j10 - j11)) * (((float) (j14 - j13)) / ((float) (j12 - j11)));
            return d0.i(((j16 + j13) - j15) - (j16 / 20), j13, j14 - 1);
        }
        return j13;
    }
}
