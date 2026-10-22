package v3;

import c3.b0;
import c3.d0;
import e2.m0;
public final class j implements h {
    public final long f47953a;
    public final int f47954b;
    public final long f47955c;
    public final int d;
    public final long e;
    public final long f47956f;
    public final long[] f47957g;

    public j(long j10, int i10, long j11, int i11, long j12, long[] jArr) {
        this.f47953a = j10;
        this.f47954b = i10;
        this.f47955c = j11;
        this.d = i11;
        this.e = j12;
        this.f47957g = jArr;
        this.f47956f = j12 != -1 ? j10 + j12 : -1L;
    }

    @Override
    public final long a(long j10) {
        long j11;
        double d;
        long j12 = j10 - this.f47953a;
        if (d() && j12 > this.f47954b) {
            long[] jArr = this.f47957g;
            jArr.getClass();
            double d10 = (j12 * 256.0d) / this.e;
            int f7 = m0.f(jArr, (long) d10, true);
            long j13 = this.f47955c;
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
        return this.f47956f;
    }

    @Override
    public final long c() {
        return this.f47953a + this.f47954b;
    }

    @Override
    public final boolean d() {
        if (this.f47957g != null) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean e() {
        return false;
    }

    @Override
    public final b0 f(long j10) {
        double d;
        double d10;
        boolean d11 = d();
        int i10 = this.f47954b;
        long j11 = this.f47953a;
        if (!d11) {
            d0 d0Var = new d0(0L, j11 + i10);
            return new b0(d0Var, d0Var);
        }
        long j12 = m0.j(j10, 0L, this.f47955c);
        double d12 = (j12 * 100.0d) / this.f47955c;
        double d13 = 0.0d;
        if (d12 <= 0.0d) {
            d = 256.0d;
        } else if (d12 >= 100.0d) {
            d = 256.0d;
            d13 = 256.0d;
        } else {
            int i11 = (int) d12;
            long[] jArr = this.f47957g;
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
        d0 d0Var2 = new d0(j12, j11 + m0.j(Math.round((d13 / d) * j13), i10, j13 - 1));
        return new b0(d0Var2, d0Var2);
    }

    @Override
    public final int g() {
        return this.d;
    }

    @Override
    public final long h() {
        return this.f47955c;
    }
}
