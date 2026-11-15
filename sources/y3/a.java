package y3;

import f3.k;
public final class a extends k implements h {
    public final long f60142i;
    public final int f60143j;
    public final int f60144k;
    public final boolean f60145l;
    public final long f60146m;

    public a(long j3, long j10, int i7, int i10, boolean z10, boolean z11) {
        super(j3, j10, i7, i10, z10, z11);
        long j11 = j3;
        this.f60142i = j10;
        this.f60143j = i7;
        this.f60144k = i10;
        this.f60145l = z10;
        this.f60146m = j11 == -1 ? -1L : j11;
    }

    @Override
    public final long a() {
        return this.f60146m;
    }

    @Override
    public final long b(long j3) {
        return (Math.max(0L, j3 - this.f10857b) * 8000000) / this.f10859e;
    }

    @Override
    public final long c() {
        return this.f60142i;
    }

    @Override
    public final int g() {
        return this.f60143j;
    }
}
