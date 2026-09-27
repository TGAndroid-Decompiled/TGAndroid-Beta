package u2;
public final class w0 implements x3.g {
    public long f43854a;
    public long f43855b;
    public Object f43856c;
    public Object d;

    public w0(long j3, int i10) {
        e2.d.g(((y2.a) this.f43856c) == null);
        this.f43854a = j3;
        this.f43855b = j3 + i10;
    }

    @Override
    public long b(c3.p pVar) {
        long j3 = this.f43855b;
        if (j3 < 0) {
            return -1L;
        }
        long j10 = -(j3 + 2);
        this.f43855b = -1L;
        return j10;
    }

    @Override
    public c3.b0 g() {
        boolean z10;
        if (this.f43854a != -1) {
            z10 = true;
        } else {
            z10 = false;
        }
        e2.d.g(z10);
        return new c3.t((c3.u) this.f43856c, this.f43854a, 0);
    }

    @Override
    public void y(long j3) {
        long[] jArr = (long[]) ((of.b) this.d).f15732b;
        this.f43855b = jArr[e2.d0.e(jArr, j3, true)];
    }

    public w0(String str, byte[] bArr, long j3, long j10) {
        this.f43856c = str;
        this.d = bArr;
        this.f43854a = j3;
        this.f43855b = j10;
    }
}
