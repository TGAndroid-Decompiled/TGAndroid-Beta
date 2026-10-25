package v3;

import c3.k;
public final class a extends k implements h {
    public final long f50026i;
    public final int f50027j;
    public final int f50028k;
    public final boolean f50029l;
    public final long f50030m;

    public a(long j10, long j11, int i10, int i11, boolean z10, boolean z11) {
        super(j10, j11, i10, i11, z10, z11);
        long j12 = j10;
        this.f50026i = j11;
        this.f50027j = i10;
        this.f50028k = i11;
        this.f50029l = z10;
        this.f50030m = j12 == -1 ? -1L : j12;
    }

    @Override
    public final long a(long j10) {
        return (Math.max(0L, j10 - this.f6069b) * 8000000) / this.e;
    }

    @Override
    public final long b() {
        return this.f50030m;
    }

    @Override
    public final long c() {
        return this.f50026i;
    }

    @Override
    public final int g() {
        return this.f50027j;
    }
}
