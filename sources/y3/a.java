package y3;

import f3.k;
public final class a extends k implements h {
    public final long f58826i;
    public final int f58827j;
    public final int f58828k;
    public final boolean f58829l;
    public final long f58830m;

    public a(long j3, long j10, int i7, int i10, boolean z9, boolean z10) {
        super(j3, j10, i7, i10, z9, z10);
        long j11 = j3;
        this.f58826i = j10;
        this.f58827j = i7;
        this.f58828k = i10;
        this.f58829l = z9;
        this.f58830m = j11 == -1 ? -1L : j11;
    }

    @Override
    public final long a(long j3) {
        return (Math.max(0L, j3 - this.f11044b) * 8000000) / this.f11046e;
    }

    @Override
    public final long b() {
        return this.f58830m;
    }

    @Override
    public final long c() {
        return this.f58826i;
    }

    @Override
    public final int g() {
        return this.f58827j;
    }
}
