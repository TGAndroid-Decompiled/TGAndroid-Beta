package r3;

import h5.d0;
public final class b {
    public final long f43227a;
    public final long f43228b;
    public final long f43229c;
    public long d = 0;
    public long e;
    public long f43230f;
    public long f43231g;
    public long h;

    public b(long j10, long j11, long j12, long j13, long j14, long j15) {
        this.f43227a = j10;
        this.f43228b = j11;
        this.e = j12;
        this.f43230f = j13;
        this.f43231g = j14;
        this.f43229c = j15;
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
