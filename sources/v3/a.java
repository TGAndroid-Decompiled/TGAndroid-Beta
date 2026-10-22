package v3;

import c3.k;
public final class a extends k implements h {
    public final long f47917i;
    public final int f47918j;
    public final int f47919k;
    public final boolean f47920l;
    public final long f47921m;

    public a(long j10, long j11, int i10, int i11, boolean z10, boolean z11) {
        super(j10, j11, i10, i11, z10, z11);
        long j12 = j10;
        this.f47917i = j11;
        this.f47918j = i10;
        this.f47919k = i11;
        this.f47920l = z10;
        this.f47921m = j12 == -1 ? -1L : j12;
    }

    @Override
    public final long a(long j10) {
        return (Math.max(0L, j10 - this.f4633b) * 8000000) / this.e;
    }

    @Override
    public final long b() {
        return this.f47921m;
    }

    @Override
    public final long c() {
        return this.f47917i;
    }

    @Override
    public final int g() {
        return this.f47918j;
    }
}
