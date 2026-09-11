package u2;
public final class x0 implements x3.g {
    public long f46854a;
    public long f46855b;
    public Object f46856c;
    public Object d;

    public x0(long j3, int i10) {
        e2.d.g(((y2.a) this.f46856c) == null);
        this.f46854a = j3;
        this.f46855b = j3 + i10;
    }

    @Override
    public long a(c3.p pVar) {
        long j3 = this.f46855b;
        if (j3 < 0) {
            return -1L;
        }
        long j10 = -(j3 + 2);
        this.f46855b = -1L;
        return j10;
    }

    @Override
    public c3.b0 d() {
        boolean z10;
        if (this.f46854a != -1) {
            z10 = true;
        } else {
            z10 = false;
        }
        e2.d.g(z10);
        return new c3.t((c3.u) this.f46856c, this.f46854a, 0);
    }

    @Override
    public void h(long j3) {
        long[] jArr = (long[]) ((pf.b) this.d).f44046b;
        this.f46855b = jArr[e2.d0.e(jArr, j3, true)];
    }

    public x0(String str, byte[] bArr, long j3, long j10) {
        this.f46856c = str;
        this.d = bArr;
        this.f46854a = j3;
        this.f46855b = j10;
    }
}
