package u2;
public final class w0 implements x3.g {
    public long f48958a;
    public long f48959b;
    public Object f48960c;
    public Object d;

    public w0(long j3, int i10) {
        e2.d.g(((y2.a) this.f48960c) == null);
        this.f48958a = j3;
        this.f48959b = j3 + i10;
    }

    @Override
    public c3.b0 A1() {
        boolean z10;
        if (this.f48958a != -1) {
            z10 = true;
        } else {
            z10 = false;
        }
        e2.d.g(z10);
        return new c3.t((c3.u) this.f48960c, this.f48958a, 0);
    }

    @Override
    public void A2(long j3) {
        long[] jArr = (long[]) ((pf.b) this.d).f45443b;
        this.f48959b = jArr[e2.d0.e(jArr, j3, true)];
    }

    @Override
    public long L0(c3.p pVar) {
        long j3 = this.f48959b;
        if (j3 < 0) {
            return -1L;
        }
        long j10 = -(j3 + 2);
        this.f48959b = -1L;
        return j10;
    }

    public w0(String str, byte[] bArr, long j3, long j10) {
        this.f48960c = str;
        this.d = bArr;
        this.f48958a = j3;
        this.f48959b = j10;
    }
}
