package y3;

import f3.k;
public final class a extends k implements h {
    public final long f60836i;
    public final int f60837j;
    public final int f60838k;
    public final boolean f60839l;
    public final long f60840m;

    public a(long j3, long j10, int i7, int i10, boolean z10, boolean z11) {
        super(j3, j10, i7, i10, z10, z11);
        long j11 = j3;
        this.f60836i = j10;
        this.f60837j = i7;
        this.f60838k = i10;
        this.f60839l = z10;
        this.f60840m = j11 == -1 ? -1L : j11;
    }

    @Override
    public final long a(long j3) {
        return (Math.max(0L, j3 - this.f11169b) * 8000000) / this.f11171e;
    }

    @Override
    public final long b() {
        return this.f60840m;
    }

    @Override
    public final long c() {
        return this.f60836i;
    }

    @Override
    public final int g() {
        return this.f60837j;
    }
}
