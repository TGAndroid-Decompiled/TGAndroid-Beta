package y3;

import f3.k;
public final class a extends k implements h {
    public final long f58922i;
    public final int f58923j;
    public final int f58924k;
    public final boolean f58925l;
    public final long f58926m;

    public a(long j3, long j10, int i7, int i10, boolean z9, boolean z10) {
        super(j3, j10, i7, i10, z9, z10);
        long j11 = j3;
        this.f58922i = j10;
        this.f58923j = i7;
        this.f58924k = i10;
        this.f58925l = z9;
        this.f58926m = j11 == -1 ? -1L : j11;
    }

    @Override
    public final long a(long j3) {
        return (Math.max(0L, j3 - this.f11044b) * 8000000) / this.f11046e;
    }

    @Override
    public final long b() {
        return this.f58926m;
    }

    @Override
    public final long c() {
        return this.f58922i;
    }

    @Override
    public final int g() {
        return this.f58923j;
    }
}
