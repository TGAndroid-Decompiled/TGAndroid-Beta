package w7;

import c8.id;
public final class c extends d {
    public final transient int f59604c;
    public final transient int d;
    public final d f59605e;

    public c(d dVar, int i7, int i10) {
        this.f59605e = dVar;
        this.f59604c = i7;
        this.d = i10;
    }

    @Override
    public final Object get(int i7) {
        id.a(i7, this.d);
        return this.f59605e.get(i7 + this.f59604c);
    }

    @Override
    public final int i() {
        return this.f59605e.j() + this.f59604c + this.d;
    }

    @Override
    public final int j() {
        return this.f59605e.j() + this.f59604c;
    }

    @Override
    public final Object[] k() {
        return this.f59605e.k();
    }

    @Override
    public final d subList(int i7, int i10) {
        id.c(i7, i10, this.d);
        int i11 = this.f59604c;
        return this.f59605e.subList(i7 + i11, i10 + i11);
    }

    @Override
    public final int size() {
        return this.d;
    }
}
