package v3;

import c3.k;
public final class a extends k implements h {
    public final long f48356i;
    public final int f48357j;
    public final int f48358k;
    public final boolean f48359l;
    public final long f48360m;

    public a(long j10, long j11, int i10, int i11, boolean z10, boolean z11) {
        super(j10, j11, i10, i11, z10, z11);
        long j12 = j10;
        this.f48356i = j11;
        this.f48357j = i10;
        this.f48358k = i11;
        this.f48359l = z10;
        this.f48360m = j12 == -1 ? -1L : j12;
    }

    @Override
    public final long a() {
        return this.f48360m;
    }

    @Override
    public final long b(long j10) {
        return (Math.max(0L, j10 - this.f4638b) * 8000000) / this.e;
    }

    @Override
    public final long c() {
        return this.f48356i;
    }

    @Override
    public final int g() {
        return this.f48357j;
    }
}
