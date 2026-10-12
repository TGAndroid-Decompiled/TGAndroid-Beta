package v3;

import c3.k;
public final class a extends k implements h {
    public final long f46521i;
    public final int f46522j;
    public final int f46523k;
    public final boolean f46524l;
    public final long f46525m;

    public a(long j10, long j11, int i10, int i11, boolean z10, boolean z11) {
        super(j10, j11, i10, i11, z10, z11);
        long j12 = j10;
        this.f46521i = j11;
        this.f46522j = i10;
        this.f46523k = i11;
        this.f46524l = z10;
        this.f46525m = j12 == -1 ? -1L : j12;
    }

    @Override
    public final long a() {
        return this.f46525m;
    }

    @Override
    public final long b(long j10) {
        return (Math.max(0L, j10 - this.f4262b) * 8000000) / this.e;
    }

    @Override
    public final long c() {
        return this.f46521i;
    }

    @Override
    public final int g() {
        return this.f46522j;
    }
}
