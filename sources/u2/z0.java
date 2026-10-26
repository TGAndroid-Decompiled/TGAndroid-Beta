package u2;

import a8.yb;
public final class z0 implements x3.g {
    public long f49492a;
    public long f49493b;
    public Object f49494c;
    public Object d;

    public z0(long j10, int i10) {
        yb.p(((y2.a) this.f49494c) == null);
        this.f49492a = j10;
        this.f49493b = j10 + i10;
    }

    @Override
    public void N0(long j10) {
        long[] jArr = (long[]) ((rf.b) this.d).f47335b;
        this.f49493b = jArr[e2.n0.f(jArr, j10, true)];
    }

    @Override
    public c3.b0 U() {
        boolean z10;
        if (this.f49492a != -1) {
            z10 = true;
        } else {
            z10 = false;
        }
        yb.p(z10);
        return new c3.t((c3.u) this.f49494c, this.f49492a, 0);
    }

    @Override
    public long w(c3.p pVar) {
        long j10 = this.f49493b;
        if (j10 < 0) {
            return -1L;
        }
        long j11 = -(j10 + 2);
        this.f49493b = -1L;
        return j11;
    }

    public z0(String str, byte[] bArr, long j10, long j11) {
        this.f49494c = str;
        this.d = bArr;
        this.f49492a = j10;
        this.f49493b = j11;
    }
}
