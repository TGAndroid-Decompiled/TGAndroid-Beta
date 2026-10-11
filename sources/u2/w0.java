package u2;
public final class w0 implements x3.g {
    public long f48851a;
    public long f48852b;
    public Object f48853c;
    public Object d;

    public w0(long j3, int i10) {
        e2.d.g(((y2.a) this.f48853c) == null);
        this.f48851a = j3;
        this.f48852b = j3 + i10;
    }

    @Override
    public long c(c3.p pVar) {
        long j3 = this.f48852b;
        if (j3 < 0) {
            return -1L;
        }
        long j10 = -(j3 + 2);
        this.f48852b = -1L;
        return j10;
    }

    @Override
    public c3.b0 d() {
        boolean z10;
        if (this.f48851a != -1) {
            z10 = true;
        } else {
            z10 = false;
        }
        e2.d.g(z10);
        return new c3.t((c3.u) this.f48853c, this.f48851a, 0);
    }

    @Override
    public void h(long j3) {
        long[] jArr = (long[]) ((pf.b) this.d).f45626b;
        this.f48852b = jArr[e2.d0.e(jArr, j3, true)];
    }

    public w0(String str, byte[] bArr, long j3, long j10) {
        this.f48853c = str;
        this.d = bArr;
        this.f48851a = j3;
        this.f48852b = j10;
    }
}
