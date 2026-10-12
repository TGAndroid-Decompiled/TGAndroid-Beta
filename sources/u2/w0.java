package u2;
public final class w0 implements x3.g {
    public long f48966a;
    public long f48967b;
    public Object f48968c;
    public Object d;

    public w0(long j3, int i10) {
        e2.d.g(((y2.a) this.f48968c) == null);
        this.f48966a = j3;
        this.f48967b = j3 + i10;
    }

    @Override
    public c3.b0 A1() {
        boolean z10;
        if (this.f48966a != -1) {
            z10 = true;
        } else {
            z10 = false;
        }
        e2.d.g(z10);
        return new c3.t((c3.u) this.f48968c, this.f48966a, 0);
    }

    @Override
    public void A2(long j3) {
        long[] jArr = (long[]) ((pf.b) this.d).f45448b;
        this.f48967b = jArr[e2.d0.e(jArr, j3, true)];
    }

    @Override
    public long L0(c3.p pVar) {
        long j3 = this.f48967b;
        if (j3 < 0) {
            return -1L;
        }
        long j10 = -(j3 + 2);
        this.f48967b = -1L;
        return j10;
    }

    public w0(String str, byte[] bArr, long j3, long j10) {
        this.f48968c = str;
        this.d = bArr;
        this.f48966a = j3;
        this.f48967b = j10;
    }
}
