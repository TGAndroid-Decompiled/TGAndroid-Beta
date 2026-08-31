package y3;

import h5.d0;
import r3.r;
import r3.t;
public final class h implements f {
    public final long f50740a;
    public final int f50741b;
    public final long f50742c;
    public final long d;
    public final long f50743e;
    public final long[] f50744f;

    public h(long j10, int i10, long j11, long j12, long[] jArr) {
        this.f50740a = j10;
        this.f50741b = i10;
        this.f50742c = j11;
        this.f50744f = jArr;
        this.d = j12;
        this.f50743e = j12 != -1 ? j10 + j12 : -1L;
    }

    @Override
    public final long a(long j10) {
        long j11;
        double d;
        long j12 = j10 - this.f50740a;
        if (c() && j12 > this.f50741b) {
            long[] jArr = this.f50744f;
            h5.a.j(jArr);
            double d10 = (j12 * 256.0d) / this.d;
            int e6 = d0.e(jArr, (long) d10, true);
            long j13 = this.f50742c;
            long j14 = (e6 * j13) / 100;
            long j15 = jArr[e6];
            int i10 = e6 + 1;
            long j16 = (j13 * i10) / 100;
            if (e6 == 99) {
                j11 = 256;
            } else {
                j11 = jArr[i10];
            }
            if (j15 == j11) {
                d = 0.0d;
            } else {
                d = (d10 - j15) / (j11 - j15);
            }
            return Math.round(d * (j16 - j14)) + j14;
        }
        return 0L;
    }

    @Override
    public final long b() {
        return this.f50743e;
    }

    @Override
    public final boolean c() {
        if (this.f50744f != null) {
            return true;
        }
        return false;
    }

    @Override
    public final r f(long j10) {
        double d;
        double d10;
        boolean c3 = c();
        int i10 = this.f50741b;
        long j11 = this.f50740a;
        if (!c3) {
            t tVar = new t(0L, j11 + i10);
            return new r(tVar, tVar);
        }
        long i11 = d0.i(j10, 0L, this.f50742c);
        double d11 = (i11 * 100.0d) / this.f50742c;
        double d12 = 0.0d;
        if (d11 <= 0.0d) {
            d = 256.0d;
        } else if (d11 >= 100.0d) {
            d = 256.0d;
            d12 = 256.0d;
        } else {
            int i12 = (int) d11;
            long[] jArr = this.f50744f;
            h5.a.j(jArr);
            double d13 = jArr[i12];
            if (i12 == 99) {
                d = 256.0d;
                d10 = 256.0d;
            } else {
                d = 256.0d;
                d10 = jArr[i12 + 1];
            }
            d12 = ((d10 - d13) * (d11 - i12)) + d13;
        }
        long j12 = this.d;
        t tVar2 = new t(i11, j11 + d0.i(Math.round((d12 / d) * j12), i10, j12 - 1));
        return new r(tVar2, tVar2);
    }

    @Override
    public final long g() {
        return this.f50742c;
    }
}
