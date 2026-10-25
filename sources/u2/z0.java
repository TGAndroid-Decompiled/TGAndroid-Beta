package u2;

import a8.yb;
public final class z0 implements x3.g {
    public long f49489a;
    public long f49490b;
    public Object f49491c;
    public Object d;

    public z0(long j10, int i10) {
        yb.p(((y2.a) this.f49491c) == null);
        this.f49489a = j10;
        this.f49490b = j10 + i10;
    }

    @Override
    public void N0(long j10) {
        long[] jArr = (long[]) ((rf.b) this.d).f47332b;
        this.f49490b = jArr[e2.n0.f(jArr, j10, true)];
    }

    @Override
    public c3.b0 U() {
        boolean z10;
        if (this.f49489a != -1) {
            z10 = true;
        } else {
            z10 = false;
        }
        yb.p(z10);
        return new c3.t((c3.u) this.f49491c, this.f49489a, 0);
    }

    @Override
    public long w(c3.p pVar) {
        long j10 = this.f49490b;
        if (j10 < 0) {
            return -1L;
        }
        long j11 = -(j10 + 2);
        this.f49490b = -1L;
        return j11;
    }

    public z0(String str, byte[] bArr, long j10, long j11) {
        this.f49491c = str;
        this.d = bArr;
        this.f49489a = j10;
        this.f49490b = j11;
    }
}
