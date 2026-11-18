package y3;

import f3.a0;
import f3.c0;
import h2.l0;
public final class j implements h {
    public final long f60745a;
    public final int f60746b;
    public final long f60747c;
    public final int d;
    public final long f60748e;
    public final long f60749f;
    public final long[] f60750g;

    public j(long j3, int i7, long j10, int i10, long j11, long[] jArr) {
        this.f60745a = j3;
        this.f60746b = i7;
        this.f60747c = j10;
        this.d = i10;
        this.f60748e = j11;
        this.f60750g = jArr;
        this.f60749f = j11 != -1 ? j3 + j11 : -1L;
    }

    @Override
    public final long a(long j3) {
        long j10;
        double d;
        long j11 = j3 - this.f60745a;
        if (d() && j11 > this.f60746b) {
            long[] jArr = this.f60750g;
            jArr.getClass();
            double d2 = (j11 * 256.0d) / this.f60748e;
            int f10 = l0.f(jArr, (long) d2, true);
            long j12 = this.f60747c;
            long j13 = (f10 * j12) / 100;
            long j14 = jArr[f10];
            int i7 = f10 + 1;
            long j15 = (j12 * i7) / 100;
            if (f10 == 99) {
                j10 = 256;
            } else {
                j10 = jArr[i7];
            }
            if (j14 == j10) {
                d = 0.0d;
            } else {
                d = (d2 - j14) / (j10 - j14);
            }
            return Math.round(d * (j15 - j13)) + j13;
        }
        return 0L;
    }

    @Override
    public final long b() {
        return this.f60749f;
    }

    @Override
    public final long c() {
        return this.f60745a + this.f60746b;
    }

    @Override
    public final boolean d() {
        if (this.f60750g != null) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean e() {
        return false;
    }

    @Override
    public final a0 f(long j3) {
        double d;
        double d2;
        boolean d10 = d();
        int i7 = this.f60746b;
        long j10 = this.f60745a;
        if (!d10) {
            c0 c0Var = new c0(0L, j10 + i7);
            return new a0(c0Var, c0Var);
        }
        long j11 = l0.j(j3, 0L, this.f60747c);
        double d11 = (j11 * 100.0d) / this.f60747c;
        double d12 = 0.0d;
        if (d11 <= 0.0d) {
            d = 256.0d;
        } else if (d11 >= 100.0d) {
            d = 256.0d;
            d12 = 256.0d;
        } else {
            int i10 = (int) d11;
            long[] jArr = this.f60750g;
            jArr.getClass();
            double d13 = jArr[i10];
            if (i10 == 99) {
                d = 256.0d;
                d2 = 256.0d;
            } else {
                d = 256.0d;
                d2 = jArr[i10 + 1];
            }
            d12 = ((d2 - d13) * (d11 - i10)) + d13;
        }
        long j12 = this.f60748e;
        c0 c0Var2 = new c0(j11, j10 + l0.j(Math.round((d12 / d) * j12), i7, j12 - 1));
        return new a0(c0Var2, c0Var2);
    }

    @Override
    public final int g() {
        return this.d;
    }

    @Override
    public final long h() {
        return this.f60747c;
    }
}
