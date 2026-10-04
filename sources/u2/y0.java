package u2;
public final class y0 implements x3.g {
    public long f47455a;
    public long f47456b;
    public Object f47457c;
    public Object d;

    public y0(long j3, int i10) {
        e2.d.g(((y2.a) this.f47457c) == null);
        this.f47455a = j3;
        this.f47456b = j3 + i10;
    }

    @Override
    public long b(c3.p pVar) {
        long j3 = this.f47456b;
        if (j3 < 0) {
            return -1L;
        }
        long j10 = -(j3 + 2);
        this.f47456b = -1L;
        return j10;
    }

    @Override
    public c3.b0 d() {
        boolean z10;
        if (this.f47455a != -1) {
            z10 = true;
        } else {
            z10 = false;
        }
        e2.d.g(z10);
        return new c3.t((c3.u) this.f47457c, this.f47455a, 0);
    }

    @Override
    public void y(long j3) {
        long[] jArr = (long[]) ((of.b) this.d).f17162b;
        this.f47456b = jArr[e2.d0.e(jArr, j3, true)];
    }

    public y0(String str, byte[] bArr, long j3, long j10) {
        this.f47457c = str;
        this.d = bArr;
        this.f47455a = j3;
        this.f47456b = j10;
    }
}
