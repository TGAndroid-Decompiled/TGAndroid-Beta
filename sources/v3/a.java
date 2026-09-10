package v3;

import c3.k;
public final class a extends k implements f {
    public final long h;
    public final int f42885i;
    public final int f42886j;
    public final boolean f42887k;
    public final long f42888l;

    public a(long j3, int i10, int i11, boolean z10, long j10) {
        super(j3, i10, i11, z10, j10);
        long j11 = j3;
        this.h = j10;
        this.f42885i = i10;
        this.f42886j = i11;
        this.f42887k = z10;
        this.f42888l = j11 == -1 ? -1L : j11;
    }

    @Override
    public final long a(long j3) {
        return (Math.max(0L, j3 - this.f4196b) * 8000000) / this.e;
    }

    @Override
    public final long d() {
        return this.f42888l;
    }

    @Override
    public final long e() {
        return this.h;
    }

    @Override
    public final int k() {
        return this.f42885i;
    }
}
