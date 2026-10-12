package u2;

import v7.u6;
public final class z0 implements x3.g {
    public long f46110a;
    public long f46111b;
    public Object f46112c;
    public Object d;

    public z0(long j10, int i10) {
        u6.p(((y2.a) this.f46112c) == null);
        this.f46110a = j10;
        this.f46111b = j10 + i10;
    }

    @Override
    public void W(long j10) {
        long[] jArr = (long[]) ((qf.b) this.d).f43355b;
        this.f46111b = jArr[e2.m0.f(jArr, j10, true)];
    }

    @Override
    public long k(c3.p pVar) {
        long j10 = this.f46111b;
        if (j10 < 0) {
            return -1L;
        }
        long j11 = -(j10 + 2);
        this.f46111b = -1L;
        return j11;
    }

    @Override
    public c3.b0 v() {
        boolean z10;
        if (this.f46110a != -1) {
            z10 = true;
        } else {
            z10 = false;
        }
        u6.p(z10);
        return new c3.t((c3.u) this.f46112c, this.f46110a, 0);
    }

    public z0(String str, byte[] bArr, long j10, long j11) {
        this.f46112c = str;
        this.d = bArr;
        this.f46110a = j10;
        this.f46111b = j11;
    }
}
