package v3;

import c3.k;
public final class a extends k implements f {
    public final long h;
    public final int f49076i;
    public final int f49077j;
    public final boolean f49078k;
    public final long f49079l;

    public a(long j3, int i10, int i11, boolean z10, long j10) {
        super(j3, i10, i11, z10, j10);
        long j11 = j3;
        this.h = j10;
        this.f49076i = i10;
        this.f49077j = i11;
        this.f49078k = z10;
        this.f49079l = j11 == -1 ? -1L : j11;
    }

    @Override
    public final long b(long j3) {
        return (Math.max(0L, j3 - this.f4133b) * 8000000) / this.f4135e;
    }

    @Override
    public final long d() {
        return this.f49079l;
    }

    @Override
    public final long e() {
        return this.h;
    }

    @Override
    public final int k() {
        return this.f49076i;
    }
}
