package y3;

import f3.k;
public final class a extends k implements h {
    public final long f58931i;
    public final int f58932j;
    public final int f58933k;
    public final boolean f58934l;
    public final long f58935m;

    public a(long j3, long j10, int i7, int i10, boolean z9, boolean z10) {
        super(j3, j10, i7, i10, z9, z10);
        long j11 = j3;
        this.f58931i = j10;
        this.f58932j = i7;
        this.f58933k = i10;
        this.f58934l = z9;
        this.f58935m = j11 == -1 ? -1L : j11;
    }

    @Override
    public final long a(long j3) {
        return (Math.max(0L, j3 - this.f11044b) * 8000000) / this.f11046e;
    }

    @Override
    public final long b() {
        return this.f58935m;
    }

    @Override
    public final long c() {
        return this.f58931i;
    }

    @Override
    public final int g() {
        return this.f58932j;
    }
}
