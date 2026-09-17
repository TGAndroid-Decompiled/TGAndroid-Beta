package v3;

import c3.k;
public final class a extends k implements f {
    public final long h;
    public final int f43888i;
    public final int f43889j;
    public final boolean f43890k;
    public final long f43891l;

    public a(long j3, int i10, int i11, boolean z10, long j10) {
        super(j3, i10, i11, z10, j10);
        long j11 = j3;
        this.h = j10;
        this.f43888i = i10;
        this.f43889j = i11;
        this.f43890k = z10;
        this.f43891l = j11 == -1 ? -1L : j11;
    }

    @Override
    public final long b(long j3) {
        return (Math.max(0L, j3 - this.f3782b) * 8000000) / this.e;
    }

    @Override
    public final long d() {
        return this.f43891l;
    }

    @Override
    public final long e() {
        return this.h;
    }

    @Override
    public final int k() {
        return this.f43888i;
    }
}
