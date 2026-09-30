package v3;

import c3.k;
public final class a extends k implements f {
    public final long h;
    public final int f44255i;
    public final int f44256j;
    public final boolean f44257k;
    public final long f44258l;

    public a(long j3, int i10, int i11, boolean z10, long j10) {
        super(j3, i10, i11, z10, j10);
        long j11 = j3;
        this.h = j10;
        this.f44255i = i10;
        this.f44256j = i11;
        this.f44257k = z10;
        this.f44258l = j11 == -1 ? -1L : j11;
    }

    @Override
    public final long b(long j3) {
        return (Math.max(0L, j3 - this.f3781b) * 8000000) / this.e;
    }

    @Override
    public final long d() {
        return this.f44258l;
    }

    @Override
    public final long e() {
        return this.h;
    }

    @Override
    public final int k() {
        return this.f44255i;
    }
}
