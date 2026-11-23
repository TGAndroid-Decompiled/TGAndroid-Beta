package y3;

import f3.k;
public final class a extends k implements h {
    public final long f60718i;
    public final int f60719j;
    public final int f60720k;
    public final boolean f60721l;
    public final long f60722m;

    public a(long j3, long j10, int i7, int i10, boolean z10, boolean z11) {
        super(j3, j10, i7, i10, z10, z11);
        long j11 = j3;
        this.f60718i = j10;
        this.f60719j = i7;
        this.f60720k = i10;
        this.f60721l = z10;
        this.f60722m = j11 == -1 ? -1L : j11;
    }

    @Override
    public final long a(long j3) {
        return (Math.max(0L, j3 - this.f11171b) * 8000000) / this.f11173e;
    }

    @Override
    public final long b() {
        return this.f60722m;
    }

    @Override
    public final long c() {
        return this.f60718i;
    }

    @Override
    public final int g() {
        return this.f60719j;
    }
}
