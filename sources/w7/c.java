package w7;

import c8.fd;
public final class c extends d {
    public final transient int f59038c;
    public final transient int d;
    public final d f59039e;

    public c(d dVar, int i7, int i10) {
        this.f59039e = dVar;
        this.f59038c = i7;
        this.d = i10;
    }

    @Override
    public final Object get(int i7) {
        fd.a(i7, this.d);
        return this.f59039e.get(i7 + this.f59038c);
    }

    @Override
    public final int i() {
        return this.f59039e.j() + this.f59038c + this.d;
    }

    @Override
    public final int j() {
        return this.f59039e.j() + this.f59038c;
    }

    @Override
    public final Object[] k() {
        return this.f59039e.k();
    }

    @Override
    public final d subList(int i7, int i10) {
        fd.c(i7, i10, this.d);
        int i11 = this.f59038c;
        return this.f59039e.subList(i7 + i11, i10 + i11);
    }

    @Override
    public final int size() {
        return this.d;
    }
}
