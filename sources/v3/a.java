package v3;

import c3.k;
public final class a extends k implements h {
    public final long f47918i;
    public final int f47919j;
    public final int f47920k;
    public final boolean f47921l;
    public final long f47922m;

    public a(long j10, long j11, int i10, int i11, boolean z10, boolean z11) {
        super(j10, j11, i10, i11, z10, z11);
        long j12 = j10;
        this.f47918i = j11;
        this.f47919j = i10;
        this.f47920k = i11;
        this.f47921l = z10;
        this.f47922m = j12 == -1 ? -1L : j12;
    }

    @Override
    public final long a(long j10) {
        return (Math.max(0L, j10 - this.f4633b) * 8000000) / this.e;
    }

    @Override
    public final long b() {
        return this.f47922m;
    }

    @Override
    public final long c() {
        return this.f47918i;
    }

    @Override
    public final int g() {
        return this.f47919j;
    }
}
