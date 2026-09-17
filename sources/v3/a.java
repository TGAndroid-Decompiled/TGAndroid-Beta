package v3;

import c3.k;
public final class a extends k implements f {
    public final long h;
    public final int f47325i;
    public final int f47326j;
    public final boolean f47327k;
    public final long f47328l;

    public a(long j3, int i10, int i11, boolean z10, long j10) {
        super(j3, i10, i11, z10, j10);
        long j11 = j3;
        this.h = j10;
        this.f47325i = i10;
        this.f47326j = i11;
        this.f47327k = z10;
        this.f47328l = j11 == -1 ? -1L : j11;
    }

    @Override
    public final long a(long j3) {
        return (Math.max(0L, j3 - this.f4277b) * 8000000) / this.f4279e;
    }

    @Override
    public final long d() {
        return this.f47328l;
    }

    @Override
    public final long e() {
        return this.h;
    }

    @Override
    public final int k() {
        return this.f47325i;
    }
}
