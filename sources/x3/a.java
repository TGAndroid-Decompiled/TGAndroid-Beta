package x3;

import e3.k;
public final class a extends k implements h {
    public final long f58175i;
    public final int f58176j;
    public final int f58177k;
    public final boolean f58178l;
    public final long f58179m;

    public a(long j10, long j11, int i3, int i10, boolean z10, boolean z11) {
        super(j10, j11, i3, i10, z10, z11);
        long j12 = j10;
        this.f58175i = j11;
        this.f58176j = i3;
        this.f58177k = i10;
        this.f58178l = z10;
        this.f58179m = j12 == -1 ? -1L : j12;
    }

    @Override
    public final long a() {
        return this.f58179m;
    }

    @Override
    public final long b(long j10) {
        return (Math.max(0L, j10 - this.f9486b) * 8000000) / this.f9488e;
    }

    @Override
    public final long c() {
        return this.f58175i;
    }

    @Override
    public final int g() {
        return this.f58176j;
    }
}
