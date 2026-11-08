package w7;

import c8.fd;
public final class c extends d {
    public final transient int f57587c;
    public final transient int d;
    public final d f57588e;

    public c(d dVar, int i7, int i10) {
        this.f57588e = dVar;
        this.f57587c = i7;
        this.d = i10;
    }

    @Override
    public final Object get(int i7) {
        fd.a(i7, this.d);
        return this.f57588e.get(i7 + this.f57587c);
    }

    @Override
    public final int i() {
        return this.f57588e.j() + this.f57587c + this.d;
    }

    @Override
    public final int j() {
        return this.f57588e.j() + this.f57587c;
    }

    @Override
    public final Object[] k() {
        return this.f57588e.k();
    }

    @Override
    public final d subList(int i7, int i10) {
        fd.c(i7, i10, this.d);
        int i11 = this.f57587c;
        return this.f57588e.subList(i7 + i11, i10 + i11);
    }

    @Override
    public final int size() {
        return this.d;
    }
}
