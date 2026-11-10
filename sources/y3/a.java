package y3;

import f3.k;
public final class a extends k implements h {
    public final long f58929i;
    public final int f58930j;
    public final int f58931k;
    public final boolean f58932l;
    public final long f58933m;

    public a(long j3, long j10, int i7, int i10, boolean z9, boolean z10) {
        super(j3, j10, i7, i10, z9, z10);
        long j11 = j3;
        this.f58929i = j10;
        this.f58930j = i7;
        this.f58931k = i10;
        this.f58932l = z9;
        this.f58933m = j11 == -1 ? -1L : j11;
    }

    @Override
    public final long a(long j3) {
        return (Math.max(0L, j3 - this.f11049b) * 8000000) / this.f11051e;
    }

    @Override
    public final long b() {
        return this.f58933m;
    }

    @Override
    public final long c() {
        return this.f58929i;
    }

    @Override
    public final int g() {
        return this.f58930j;
    }
}
