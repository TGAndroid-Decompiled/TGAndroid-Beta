package u2;
public final class x0 implements x3.g {
    public long f48758a;
    public long f48759b;
    public Object f48760c;
    public Object d;

    public x0(long j3, int i10) {
        e2.d.g(((y2.a) this.f48760c) == null);
        this.f48758a = j3;
        this.f48759b = j3 + i10;
    }

    @Override
    public long c(c3.p pVar) {
        long j3 = this.f48759b;
        if (j3 < 0) {
            return -1L;
        }
        long j10 = -(j3 + 2);
        this.f48759b = -1L;
        return j10;
    }

    @Override
    public c3.b0 d() {
        boolean z10;
        if (this.f48758a != -1) {
            z10 = true;
        } else {
            z10 = false;
        }
        e2.d.g(z10);
        return new c3.t((c3.u) this.f48760c, this.f48758a, 0);
    }

    @Override
    public void l(long j3) {
        long[] jArr = (long[]) ((pf.b) this.d).f45558b;
        this.f48759b = jArr[e2.d0.e(jArr, j3, true)];
    }

    public x0(String str, byte[] bArr, long j3, long j10) {
        this.f48760c = str;
        this.d = bArr;
        this.f48758a = j3;
        this.f48759b = j10;
    }
}
