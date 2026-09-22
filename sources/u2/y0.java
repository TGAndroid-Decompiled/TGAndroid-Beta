package u2;
public final class y0 implements x3.g {
    public long f43856a;
    public long f43857b;
    public Object f43858c;
    public Object d;

    public y0(long j3, int i10) {
        e2.d.g(((y2.a) this.f43858c) == null);
        this.f43856a = j3;
        this.f43857b = j3 + i10;
    }

    @Override
    public void B(long j3) {
        long[] jArr = (long[]) ((of.b) this.d).f15697b;
        this.f43857b = jArr[e2.d0.e(jArr, j3, true)];
    }

    @Override
    public long c(c3.p pVar) {
        long j3 = this.f43857b;
        if (j3 < 0) {
            return -1L;
        }
        long j10 = -(j3 + 2);
        this.f43857b = -1L;
        return j10;
    }

    @Override
    public c3.b0 l() {
        boolean z10;
        if (this.f43856a != -1) {
            z10 = true;
        } else {
            z10 = false;
        }
        e2.d.g(z10);
        return new c3.t((c3.u) this.f43858c, this.f43856a, 0);
    }

    public y0(String str, byte[] bArr, long j3, long j10) {
        this.f43858c = str;
        this.d = bArr;
        this.f43856a = j3;
        this.f43857b = j10;
    }
}
