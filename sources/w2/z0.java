package w2;

import b8.zb;
public final class z0 implements z3.g {
    public long f57292a;
    public long f57293b;
    public Object f57294c;
    public Object d;

    public z0(long j10, int i3) {
        zb.p(((a3.a) this.f57294c) == null);
        this.f57292a = j10;
        this.f57293b = j10 + i3;
    }

    @Override
    public long D(e3.p pVar) {
        long j10 = this.f57293b;
        if (j10 < 0) {
            return -1L;
        }
        long j11 = -(j10 + 2);
        this.f57293b = -1L;
        return j11;
    }

    @Override
    public e3.b0 O() {
        boolean z10;
        if (this.f57292a != -1) {
            z10 = true;
        } else {
            z10 = false;
        }
        zb.p(z10);
        return new e3.t((e3.u) this.f57294c, this.f57292a, 0);
    }

    @Override
    public void u0(long j10) {
        long[] jArr = (long[]) ((tf.b) this.d).f55094a;
        this.f57293b = jArr[g2.n0.f(jArr, j10, true)];
    }

    public z0(String str, byte[] bArr, long j10, long j11) {
        this.f57294c = str;
        this.d = bArr;
        this.f57292a = j10;
        this.f57293b = j11;
    }
}
