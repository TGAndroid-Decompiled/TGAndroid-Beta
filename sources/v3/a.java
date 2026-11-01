package v3;

import c3.k;
public final class a extends k implements h {
    public final long f50343i;
    public final int f50344j;
    public final int f50345k;
    public final boolean f50346l;
    public final long f50347m;

    public a(long j10, long j11, int i10, int i11, boolean z10, boolean z11) {
        super(j10, j11, i10, i11, z10, z11);
        long j12 = j10;
        this.f50343i = j11;
        this.f50344j = i10;
        this.f50345k = i11;
        this.f50346l = z10;
        this.f50347m = j12 == -1 ? -1L : j12;
    }

    @Override
    public final long a(long j10) {
        return (Math.max(0L, j10 - this.f3665b) * 8000000) / this.e;
    }

    @Override
    public final long b() {
        return this.f50347m;
    }

    @Override
    public final long c() {
        return this.f50343i;
    }

    @Override
    public final int g() {
        return this.f50344j;
    }
}
