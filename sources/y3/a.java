package y3;

import f3.k;
public final class a extends k implements h {
    public final long f60753i;
    public final int f60754j;
    public final int f60755k;
    public final boolean f60756l;
    public final long f60757m;

    public a(long j3, long j10, int i7, int i10, boolean z10, boolean z11) {
        super(j3, j10, i7, i10, z10, z11);
        long j11 = j3;
        this.f60753i = j10;
        this.f60754j = i7;
        this.f60755k = i10;
        this.f60756l = z10;
        this.f60757m = j11 == -1 ? -1L : j11;
    }

    @Override
    public final long a(long j3) {
        return (Math.max(0L, j3 - this.f11208b) * 8000000) / this.f11210e;
    }

    @Override
    public final long b() {
        return this.f60757m;
    }

    @Override
    public final long c() {
        return this.f60753i;
    }

    @Override
    public final int g() {
        return this.f60754j;
    }
}
