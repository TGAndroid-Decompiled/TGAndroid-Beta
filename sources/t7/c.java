package t7;

import w7.i7;
public final class c extends d {
    public final transient int f42084c;
    public final transient int d;
    public final d e;

    public c(d dVar, int i10, int i11) {
        this.e = dVar;
        this.f42084c = i10;
        this.d = i11;
    }

    @Override
    public final Object get(int i10) {
        i7.a(i10, this.d);
        return this.e.get(i10 + this.f42084c);
    }

    @Override
    public final int n() {
        return this.e.o() + this.f42084c + this.d;
    }

    @Override
    public final int o() {
        return this.e.o() + this.f42084c;
    }

    @Override
    public final Object[] p() {
        return this.e.p();
    }

    @Override
    public final d subList(int i10, int i11) {
        i7.c(i10, i11, this.d);
        int i12 = this.f42084c;
        return this.e.subList(i10 + i12, i11 + i12);
    }

    @Override
    public final int size() {
        return this.d;
    }
}
