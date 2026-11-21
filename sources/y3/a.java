package y3;

import f3.k;
public final class a extends k implements h {
    public final long f60749i;
    public final int f60750j;
    public final int f60751k;
    public final boolean f60752l;
    public final long f60753m;

    public a(long j3, long j10, int i7, int i10, boolean z10, boolean z11) {
        super(j3, j10, i7, i10, z10, z11);
        long j11 = j3;
        this.f60749i = j10;
        this.f60750j = i7;
        this.f60751k = i10;
        this.f60752l = z10;
        this.f60753m = j11 == -1 ? -1L : j11;
    }

    @Override
    public final long a(long j3) {
        return (Math.max(0L, j3 - this.f11205b) * 8000000) / this.f11207e;
    }

    @Override
    public final long b() {
        return this.f60753m;
    }

    @Override
    public final long c() {
        return this.f60749i;
    }

    @Override
    public final int g() {
        return this.f60750j;
    }
}
