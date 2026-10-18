package v3;

import c3.k;
public final class a extends k implements h {
    public final long f47954i;
    public final int f47955j;
    public final int f47956k;
    public final boolean f47957l;
    public final long f47958m;

    public a(long j10, long j11, int i10, int i11, boolean z10, boolean z11) {
        super(j10, j11, i10, i11, z10, z11);
        long j12 = j10;
        this.f47954i = j11;
        this.f47955j = i10;
        this.f47956k = i11;
        this.f47957l = z10;
        this.f47958m = j12 == -1 ? -1L : j12;
    }

    @Override
    public final long a(long j10) {
        return (Math.max(0L, j10 - this.f4637b) * 8000000) / this.e;
    }

    @Override
    public final long b() {
        return this.f47958m;
    }

    @Override
    public final long c() {
        return this.f47954i;
    }

    @Override
    public final int g() {
        return this.f47955j;
    }
}
