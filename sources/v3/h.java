package v3;

import c3.a0;
import c3.c0;
import e2.d0;
public final class h implements f {
    public final long f42914a;
    public final int f42915b;
    public final long f42916c;
    public final int d;
    public final long e;
    public final long f42917f;
    public final long[] f42918g;

    public h(long j3, int i10, long j10, int i11, long j11, long[] jArr) {
        this.f42914a = j3;
        this.f42915b = i10;
        this.f42916c = j10;
        this.d = i11;
        this.e = j11;
        this.f42918g = jArr;
        this.f42917f = j11 != -1 ? j3 + j11 : -1L;
    }

    @Override
    public final long a(long j3) {
        long j10;
        double d;
        long j11 = j3 - this.f42914a;
        if (f() && j11 > this.f42915b) {
            long[] jArr = this.f42918g;
            e2.d.h(jArr);
            double d10 = (j11 * 256.0d) / this.e;
            int e = d0.e(jArr, (long) d10, true);
            long j12 = this.f42916c;
            long j13 = (e * j12) / 100;
            long j14 = jArr[e];
            int i10 = e + 1;
            long j15 = (j12 * i10) / 100;
            if (e == 99) {
                j10 = 256;
            } else {
                j10 = jArr[i10];
            }
            if (j14 == j10) {
                d = 0.0d;
            } else {
                d = (d10 - j14) / (j10 - j14);
            }
            return Math.round(d * (j15 - j13)) + j13;
        }
        return 0L;
    }

    @Override
    public final long d() {
        return this.f42917f;
    }

    @Override
    public final long e() {
        return this.f42914a + this.f42915b;
    }

    @Override
    public final boolean f() {
        if (this.f42918g != null) {
            return true;
        }
        return false;
    }

    @Override
    public final a0 j(long j3) {
        double d;
        double d10;
        boolean f7 = f();
        int i10 = this.f42915b;
        long j10 = this.f42914a;
        if (!f7) {
            c0 c0Var = new c0(0L, j10 + i10);
            return new a0(c0Var, c0Var);
        }
        long i11 = d0.i(j3, 0L, this.f42916c);
        double d11 = (i11 * 100.0d) / this.f42916c;
        double d12 = 0.0d;
        if (d11 <= 0.0d) {
            d = 256.0d;
        } else if (d11 >= 100.0d) {
            d = 256.0d;
            d12 = 256.0d;
        } else {
            int i12 = (int) d11;
            long[] jArr = this.f42918g;
            e2.d.h(jArr);
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
        long j11 = this.e;
        c0 c0Var2 = new c0(i11, j10 + d0.i(Math.round((d12 / d) * j11), i10, j11 - 1));
        return new a0(c0Var2, c0Var2);
    }

    @Override
    public final int k() {
        return this.d;
    }

    @Override
    public final long l() {
        return this.f42916c;
    }
}
