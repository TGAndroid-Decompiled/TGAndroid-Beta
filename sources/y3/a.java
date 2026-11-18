package y3;

import f3.k;
public final class a extends k implements h {
    public final long f60707i;
    public final int f60708j;
    public final int f60709k;
    public final boolean f60710l;
    public final long f60711m;

    public a(long j3, long j10, int i7, int i10, boolean z10, boolean z11) {
        super(j3, j10, i7, i10, z10, z11);
        long j11 = j3;
        this.f60707i = j10;
        this.f60708j = i7;
        this.f60709k = i10;
        this.f60710l = z10;
        this.f60711m = j11 == -1 ? -1L : j11;
    }

    @Override
    public final long a(long j3) {
        return (Math.max(0L, j3 - this.f11179b) * 8000000) / this.f11181e;
    }

    @Override
    public final long b() {
        return this.f60711m;
    }

    @Override
    public final long c() {
        return this.f60707i;
    }

    @Override
    public final int g() {
        return this.f60708j;
    }
}
