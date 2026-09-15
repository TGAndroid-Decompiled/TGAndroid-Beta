package u2;
public final class x0 implements x3.g {
    public long f43531a;
    public long f43532b;
    public Object f43533c;
    public Object d;

    public x0(long j3, int i10) {
        e2.d.g(((y2.a) this.f43533c) == null);
        this.f43531a = j3;
        this.f43532b = j3 + i10;
    }

    @Override
    public void B(long j3) {
        long[] jArr = (long[]) ((of.b) this.d).f15511b;
        this.f43532b = jArr[e2.d0.e(jArr, j3, true)];
    }

    @Override
    public long b(c3.p pVar) {
        long j3 = this.f43532b;
        if (j3 < 0) {
            return -1L;
        }
        long j10 = -(j3 + 2);
        this.f43532b = -1L;
        return j10;
    }

    @Override
    public c3.b0 g() {
        boolean z10;
        if (this.f43531a != -1) {
            z10 = true;
        } else {
            z10 = false;
        }
        e2.d.g(z10);
        return new c3.t((c3.u) this.f43533c, this.f43531a, 0);
    }

    public x0(String str, byte[] bArr, long j3, long j10) {
        this.f43533c = str;
        this.d = bArr;
        this.f43531a = j3;
        this.f43532b = j10;
    }
}
