package u2;
public final class z0 implements x3.g {
    public long f42506a;
    public long f42507b;
    public Object f42508c;
    public Object d;

    public z0(long j3, int i10) {
        e2.d.g(((y2.a) this.f42508c) == null);
        this.f42506a = j3;
        this.f42507b = j3 + i10;
    }

    @Override
    public long c(c3.p pVar) {
        long j3 = this.f42507b;
        if (j3 < 0) {
            return -1L;
        }
        long j10 = -(j3 + 2);
        this.f42507b = -1L;
        return j10;
    }

    @Override
    public c3.b0 h() {
        boolean z10;
        if (this.f42506a != -1) {
            z10 = true;
        } else {
            z10 = false;
        }
        e2.d.g(z10);
        return new c3.t((c3.u) this.f42508c, this.f42506a, 0);
    }

    @Override
    public void y(long j3) {
        long[] jArr = (long[]) ((n4.y) this.d).f13824b;
        this.f42507b = jArr[e2.d0.e(jArr, j3, true)];
    }

    public z0(String str, byte[] bArr, long j3, long j10) {
        this.f42508c = str;
        this.d = bArr;
        this.f42506a = j3;
        this.f42507b = j10;
    }
}
