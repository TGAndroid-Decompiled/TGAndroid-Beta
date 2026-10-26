package v3;

import c3.a0;
import c3.c0;
import e2.n0;
public final class j implements h {
    public final long f50065a;
    public final int f50066b;
    public final long f50067c;
    public final int d;
    public final long e;
    public final long f50068f;
    public final long[] f50069g;

    public j(long j10, int i10, long j11, int i11, long j12, long[] jArr) {
        this.f50065a = j10;
        this.f50066b = i10;
        this.f50067c = j11;
        this.d = i11;
        this.e = j12;
        this.f50069g = jArr;
        this.f50068f = j12 != -1 ? j10 + j12 : -1L;
    }

    @Override
    public final long a(long j10) {
        long j11;
        double d;
        long j12 = j10 - this.f50065a;
        if (d() && j12 > this.f50066b) {
            long[] jArr = this.f50069g;
            jArr.getClass();
            double d10 = (j12 * 256.0d) / this.e;
            int f7 = n0.f(jArr, (long) d10, true);
            long j13 = this.f50067c;
            long j14 = (f7 * j13) / 100;
            long j15 = jArr[f7];
            int i10 = f7 + 1;
            long j16 = (j13 * i10) / 100;
            if (f7 == 99) {
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
        return this.f50068f;
    }

    @Override
    public final long c() {
        return this.f50065a + this.f50066b;
    }

    @Override
    public final boolean d() {
        if (this.f50069g != null) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean e() {
        return false;
    }

    @Override
    public final a0 f(long j10) {
        double d;
        double d10;
        boolean d11 = d();
        int i10 = this.f50066b;
        long j11 = this.f50065a;
        if (!d11) {
            c0 c0Var = new c0(0L, j11 + i10);
            return new a0(c0Var, c0Var);
        }
        long j12 = n0.j(j10, 0L, this.f50067c);
        double d12 = (j12 * 100.0d) / this.f50067c;
        double d13 = 0.0d;
        if (d12 <= 0.0d) {
            d = 256.0d;
        } else if (d12 >= 100.0d) {
            d = 256.0d;
            d13 = 256.0d;
        } else {
            int i11 = (int) d12;
            long[] jArr = this.f50069g;
            jArr.getClass();
            double d14 = jArr[i11];
            if (i11 == 99) {
                d = 256.0d;
                d10 = 256.0d;
            } else {
                d = 256.0d;
                d10 = jArr[i11 + 1];
            }
            d13 = ((d10 - d14) * (d12 - i11)) + d14;
        }
        long j13 = this.e;
        c0 c0Var2 = new c0(j12, j11 + n0.j(Math.round((d13 / d) * j13), i10, j13 - 1));
        return new a0(c0Var2, c0Var2);
    }

    @Override
    public final int g() {
        return this.d;
    }

    @Override
    public final long h() {
        return this.f50067c;
    }
}
