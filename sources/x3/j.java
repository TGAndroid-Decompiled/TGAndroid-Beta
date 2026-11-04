package x3;

import e3.a0;
import e3.c0;
import g2.n0;
public final class j implements h {
    public final long f58213a;
    public final int f58214b;
    public final long f58215c;
    public final int d;
    public final long f58216e;
    public final long f58217f;
    public final long[] f58218g;

    public j(long j10, int i3, long j11, int i10, long j12, long[] jArr) {
        this.f58213a = j10;
        this.f58214b = i3;
        this.f58215c = j11;
        this.d = i10;
        this.f58216e = j12;
        this.f58218g = jArr;
        this.f58217f = j12 != -1 ? j10 + j12 : -1L;
    }

    @Override
    public final long a() {
        return this.f58217f;
    }

    @Override
    public final long b(long j10) {
        long j11;
        double d;
        long j12 = j10 - this.f58213a;
        if (d() && j12 > this.f58214b) {
            long[] jArr = this.f58218g;
            jArr.getClass();
            double d10 = (j12 * 256.0d) / this.f58216e;
            int f10 = n0.f(jArr, (long) d10, true);
            long j13 = this.f58215c;
            long j14 = (f10 * j13) / 100;
            long j15 = jArr[f10];
            int i3 = f10 + 1;
            long j16 = (j13 * i3) / 100;
            if (f10 == 99) {
                j11 = 256;
            } else {
                j11 = jArr[i3];
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
    public final long c() {
        return this.f58213a + this.f58214b;
    }

    @Override
    public final boolean d() {
        if (this.f58218g != null) {
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
        int i3 = this.f58214b;
        long j11 = this.f58213a;
        if (!d11) {
            c0 c0Var = new c0(0L, j11 + i3);
            return new a0(c0Var, c0Var);
        }
        long j12 = n0.j(j10, 0L, this.f58215c);
        double d12 = (j12 * 100.0d) / this.f58215c;
        double d13 = 0.0d;
        if (d12 <= 0.0d) {
            d = 256.0d;
        } else if (d12 >= 100.0d) {
            d = 256.0d;
            d13 = 256.0d;
        } else {
            int i10 = (int) d12;
            long[] jArr = this.f58218g;
            jArr.getClass();
            double d14 = jArr[i10];
            if (i10 == 99) {
                d = 256.0d;
                d10 = 256.0d;
            } else {
                d = 256.0d;
                d10 = jArr[i10 + 1];
            }
            d13 = ((d10 - d14) * (d12 - i10)) + d14;
        }
        long j13 = this.f58216e;
        c0 c0Var2 = new c0(j12, j11 + n0.j(Math.round((d13 / d) * j13), i3, j13 - 1));
        return new a0(c0Var2, c0Var2);
    }

    @Override
    public final int g() {
        return this.d;
    }

    @Override
    public final long h() {
        return this.f58215c;
    }
}
