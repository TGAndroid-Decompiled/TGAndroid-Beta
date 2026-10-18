package u2;

import v7.u6;
public final class y0 implements x3.g {
    public long f47537a;
    public long f47538b;
    public Object f47539c;
    public Object d;

    public y0(long j10, int i10) {
        u6.p(((y2.a) this.f47539c) == null);
        this.f47537a = j10;
        this.f47538b = j10 + i10;
    }

    @Override
    public void X(long j10) {
        long[] jArr = (long[]) ((n4.s) this.d).f17128b;
        this.f47538b = jArr[e2.m0.f(jArr, j10, true)];
    }

    @Override
    public long k(c3.p pVar) {
        long j10 = this.f47538b;
        if (j10 < 0) {
            return -1L;
        }
        long j11 = -(j10 + 2);
        this.f47538b = -1L;
        return j11;
    }

    @Override
    public c3.c0 x() {
        boolean z10;
        if (this.f47537a != -1) {
            z10 = true;
        } else {
            z10 = false;
        }
        u6.p(z10);
        return new c3.t((c3.u) this.f47539c, this.f47537a, 0);
    }

    public y0(String str, byte[] bArr, long j10, long j11) {
        this.f47539c = str;
        this.d = bArr;
        this.f47537a = j10;
        this.f47538b = j11;
    }
}
