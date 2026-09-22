package v3;

import c3.k;
public final class a extends k implements f {
    public final long h;
    public final int f44185i;
    public final int f44186j;
    public final boolean f44187k;
    public final long f44188l;

    public a(long j3, int i10, int i11, boolean z10, long j10) {
        super(j3, i10, i11, z10, j10);
        long j11 = j3;
        this.h = j10;
        this.f44185i = i10;
        this.f44186j = i11;
        this.f44187k = z10;
        this.f44188l = j11 == -1 ? -1L : j11;
    }

    @Override
    public final long b(long j3) {
        return (Math.max(0L, j3 - this.f3781b) * 8000000) / this.e;
    }

    @Override
    public final long d() {
        return this.f44188l;
    }

    @Override
    public final long e() {
        return this.h;
    }

    @Override
    public final int k() {
        return this.f44185i;
    }
}
