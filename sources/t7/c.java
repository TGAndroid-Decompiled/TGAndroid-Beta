package t7;

import w7.o7;
public final class c extends d {
    public final transient int f48444c;
    public final transient int d;
    public final d f48445e;

    public c(d dVar, int i10, int i11) {
        this.f48445e = dVar;
        this.f48444c = i10;
        this.d = i11;
    }

    @Override
    public final Object get(int i10) {
        o7.a(i10, this.d);
        return this.f48445e.get(i10 + this.f48444c);
    }

    @Override
    public final int n() {
        return this.f48445e.o() + this.f48444c + this.d;
    }

    @Override
    public final int o() {
        return this.f48445e.o() + this.f48444c;
    }

    @Override
    public final Object[] p() {
        return this.f48445e.p();
    }

    @Override
    public final d subList(int i10, int i11) {
        o7.c(i10, i11, this.d);
        int i12 = this.f48444c;
        return this.f48445e.subList(i10 + i12, i11 + i12);
    }

    @Override
    public final int size() {
        return this.d;
    }
}
