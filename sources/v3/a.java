package v3;

import c3.k;
public final class a extends k implements f {
    public final long h;
    public final int f49304i;
    public final int f49305j;
    public final boolean f49306k;
    public final long f49307l;

    public a(long j3, int i10, int i11, boolean z10, long j10) {
        super(j3, i10, i11, z10, j10);
        long j11 = j3;
        this.h = j10;
        this.f49304i = i10;
        this.f49305j = i11;
        this.f49306k = z10;
        this.f49307l = j11 == -1 ? -1L : j11;
    }

    @Override
    public final long a(long j3) {
        return (Math.max(0L, j3 - this.f4132b) * 8000000) / this.f4134e;
    }

    @Override
    public final long d() {
        return this.f49307l;
    }

    @Override
    public final long e() {
        return this.h;
    }

    @Override
    public final int k() {
        return this.f49304i;
    }
}
