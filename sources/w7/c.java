package w7;

import c8.fd;
public final class c extends d {
    public final transient int f57599c;
    public final transient int d;
    public final d f57600e;

    public c(d dVar, int i7, int i10) {
        this.f57600e = dVar;
        this.f57599c = i7;
        this.d = i10;
    }

    @Override
    public final Object get(int i7) {
        fd.a(i7, this.d);
        return this.f57600e.get(i7 + this.f57599c);
    }

    @Override
    public final int i() {
        return this.f57600e.j() + this.f57599c + this.d;
    }

    @Override
    public final int j() {
        return this.f57600e.j() + this.f57599c;
    }

    @Override
    public final Object[] k() {
        return this.f57600e.k();
    }

    @Override
    public final d subList(int i7, int i10) {
        fd.c(i7, i10, this.d);
        int i11 = this.f57599c;
        return this.f57600e.subList(i7 + i11, i10 + i11);
    }

    @Override
    public final int size() {
        return this.d;
    }
}
