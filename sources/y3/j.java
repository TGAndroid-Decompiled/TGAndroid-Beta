package y3;

import f3.b0;
import f3.d0;
import h2.m0;
public final class j implements h {
    public final long f58840a;
    public final int f58841b;
    public final long f58842c;
    public final int d;
    public final long f58843e;
    public final long f58844f;
    public final long[] f58845g;

    public j(long j3, int i7, long j10, int i10, long j11, long[] jArr) {
        this.f58840a = j3;
        this.f58841b = i7;
        this.f58842c = j10;
        this.d = i10;
        this.f58843e = j11;
        this.f58845g = jArr;
        this.f58844f = j11 != -1 ? j3 + j11 : -1L;
    }

    @Override
    public final long a(long j3) {
        long j10;
        double d;
        long j11 = j3 - this.f58840a;
        if (d() && j11 > this.f58841b) {
            long[] jArr = this.f58845g;
            jArr.getClass();
            double d2 = (j11 * 256.0d) / this.f58843e;
            int f10 = m0.f(jArr, (long) d2, true);
            long j12 = this.f58842c;
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
        return this.f58844f;
    }

    @Override
    public final long c() {
        return this.f58840a + this.f58841b;
    }

    @Override
    public final boolean d() {
        if (this.f58845g != null) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean e() {
        return false;
    }

    @Override
    public final b0 f(long j3) {
        double d;
        double d2;
        boolean d10 = d();
        int i7 = this.f58841b;
        long j10 = this.f58840a;
        if (!d10) {
            d0 d0Var = new d0(0L, j10 + i7);
            return new b0(d0Var, d0Var);
        }
        long j11 = m0.j(j3, 0L, this.f58842c);
        double d11 = (j11 * 100.0d) / this.f58842c;
        double d12 = 0.0d;
        if (d11 <= 0.0d) {
            d = 256.0d;
        } else if (d11 >= 100.0d) {
            d = 256.0d;
            d12 = 256.0d;
        } else {
            int i10 = (int) d11;
            long[] jArr = this.f58845g;
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
        long j12 = this.f58843e;
        d0 d0Var2 = new d0(j11, j10 + m0.j(Math.round((d12 / d) * j12), i7, j12 - 1));
        return new b0(d0Var2, d0Var2);
    }

    @Override
    public final int g() {
        return this.d;
    }

    @Override
    public final long h() {
        return this.f58842c;
    }
}
