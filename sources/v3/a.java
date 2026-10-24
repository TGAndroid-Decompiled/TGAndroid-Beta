package v3;

import c3.k;
public final class a extends k implements h {
    public final long f48355i;
    public final int f48356j;
    public final int f48357k;
    public final boolean f48358l;
    public final long f48359m;

    public a(long j10, long j11, int i10, int i11, boolean z10, boolean z11) {
        super(j10, j11, i10, i11, z10, z11);
        long j12 = j10;
        this.f48355i = j11;
        this.f48356j = i10;
        this.f48357k = i11;
        this.f48358l = z10;
        this.f48359m = j12 == -1 ? -1L : j12;
    }

    @Override
    public final long a() {
        return this.f48359m;
    }

    @Override
    public final long b(long j10) {
        return (Math.max(0L, j10 - this.f4638b) * 8000000) / this.e;
    }

    @Override
    public final long c() {
        return this.f48355i;
    }

    @Override
    public final int g() {
        return this.f48356j;
    }
}
