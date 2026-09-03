package r3;

import h5.d0;
public final class b {
    public final long f46565a;
    public final long f46566b;
    public final long f46567c;
    public long d = 0;
    public long f46568e;
    public long f46569f;
    public long f46570g;
    public long h;

    public b(long j10, long j11, long j12, long j13, long j14, long j15) {
        this.f46565a = j10;
        this.f46566b = j11;
        this.f46568e = j12;
        this.f46569f = j13;
        this.f46570g = j14;
        this.f46567c = j15;
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
