package u2;
public final class y0 implements x3.g {
    public long f47462a;
    public long f47463b;
    public Object f47464c;
    public Object d;

    public y0(long j3, int i10) {
        e2.d.g(((y2.a) this.f47464c) == null);
        this.f47462a = j3;
        this.f47463b = j3 + i10;
    }

    @Override
    public void C(long j3) {
        long[] jArr = (long[]) ((of.b) this.d).f17167b;
        this.f47463b = jArr[e2.d0.e(jArr, j3, true)];
    }

    @Override
    public long b(c3.p pVar) {
        long j3 = this.f47463b;
        if (j3 < 0) {
            return -1L;
        }
        long j10 = -(j3 + 2);
        this.f47463b = -1L;
        return j10;
    }

    @Override
    public c3.b0 d() {
        boolean z10;
        if (this.f47462a != -1) {
            z10 = true;
        } else {
            z10 = false;
        }
        e2.d.g(z10);
        return new c3.t((c3.u) this.f47464c, this.f47462a, 0);
    }

    public y0(String str, byte[] bArr, long j3, long j10) {
        this.f47464c = str;
        this.d = bArr;
        this.f47462a = j3;
        this.f47463b = j10;
    }
}
