package u2;

import v7.u6;
public final class z0 implements x3.g {
    public long f47496a;
    public long f47497b;
    public Object f47498c;
    public Object d;

    public z0(long j10, int i10) {
        u6.p(((y2.a) this.f47498c) == null);
        this.f47496a = j10;
        this.f47497b = j10 + i10;
    }

    @Override
    public void X(long j10) {
        long[] jArr = (long[]) ((n4.s) this.d).f17125b;
        this.f47497b = jArr[e2.m0.f(jArr, j10, true)];
    }

    @Override
    public long k(c3.p pVar) {
        long j10 = this.f47497b;
        if (j10 < 0) {
            return -1L;
        }
        long j11 = -(j10 + 2);
        this.f47497b = -1L;
        return j11;
    }

    @Override
    public c3.c0 x() {
        boolean z10;
        if (this.f47496a != -1) {
            z10 = true;
        } else {
            z10 = false;
        }
        u6.p(z10);
        return new c3.t((c3.u) this.f47498c, this.f47496a, 0);
    }

    public z0(String str, byte[] bArr, long j10, long j11) {
        this.f47498c = str;
        this.d = bArr;
        this.f47496a = j10;
        this.f47497b = j11;
    }
}
