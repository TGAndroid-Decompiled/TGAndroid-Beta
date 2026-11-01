package u2;

import v7.t6;
public final class z0 implements x3.g {
    public long f50085a;
    public long f50086b;
    public Object f50087c;
    public Object d;

    public z0(long j10, int i10) {
        t6.p(((y2.a) this.f50087c) == null);
        this.f50085a = j10;
        this.f50086b = j10 + i10;
    }

    @Override
    public c3.b0 E() {
        boolean z10;
        if (this.f50085a != -1) {
            z10 = true;
        } else {
            z10 = false;
        }
        t6.p(z10);
        return new c3.t((c3.u) this.f50087c, this.f50085a, 0);
    }

    @Override
    public void b0(long j10) {
        long[] jArr = (long[]) ((hf.b) this.d).f7658b;
        this.f50086b = jArr[e2.l0.f(jArr, j10, true)];
    }

    @Override
    public long w(c3.p pVar) {
        long j10 = this.f50086b;
        if (j10 < 0) {
            return -1L;
        }
        long j11 = -(j10 + 2);
        this.f50086b = -1L;
        return j11;
    }

    public z0(String str, byte[] bArr, long j10, long j11) {
        this.f50087c = str;
        this.d = bArr;
        this.f50085a = j10;
        this.f50086b = j11;
    }
}
