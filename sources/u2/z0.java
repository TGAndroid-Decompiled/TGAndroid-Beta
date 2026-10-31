package u2;

import v7.t6;
public final class z0 implements x3.g {
    public long f50071a;
    public long f50072b;
    public Object f50073c;
    public Object d;

    public z0(long j10, int i10) {
        t6.p(((y2.a) this.f50073c) == null);
        this.f50071a = j10;
        this.f50072b = j10 + i10;
    }

    @Override
    public c3.b0 E() {
        boolean z10;
        if (this.f50071a != -1) {
            z10 = true;
        } else {
            z10 = false;
        }
        t6.p(z10);
        return new c3.t((c3.u) this.f50073c, this.f50071a, 0);
    }

    @Override
    public void b0(long j10) {
        long[] jArr = (long[]) ((hf.b) this.d).f7657b;
        this.f50072b = jArr[e2.l0.f(jArr, j10, true)];
    }

    @Override
    public long w(c3.p pVar) {
        long j10 = this.f50072b;
        if (j10 < 0) {
            return -1L;
        }
        long j11 = -(j10 + 2);
        this.f50072b = -1L;
        return j11;
    }

    public z0(String str, byte[] bArr, long j10, long j11) {
        this.f50073c = str;
        this.d = bArr;
        this.f50071a = j10;
        this.f50072b = j11;
    }
}
