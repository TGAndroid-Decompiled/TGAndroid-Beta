package w7;

import c8.ed;
public final class c extends d {
    public final transient int f57495c;
    public final transient int d;
    public final d f57496e;

    public c(d dVar, int i7, int i10) {
        this.f57496e = dVar;
        this.f57495c = i7;
        this.d = i10;
    }

    @Override
    public final Object get(int i7) {
        ed.a(i7, this.d);
        return this.f57496e.get(i7 + this.f57495c);
    }

    @Override
    public final int i() {
        return this.f57496e.j() + this.f57495c + this.d;
    }

    @Override
    public final int j() {
        return this.f57496e.j() + this.f57495c;
    }

    @Override
    public final Object[] k() {
        return this.f57496e.k();
    }

    @Override
    public final d subList(int i7, int i10) {
        ed.c(i7, i10, this.d);
        int i11 = this.f57495c;
        return this.f57496e.subList(i7 + i11, i10 + i11);
    }

    @Override
    public final int size() {
        return this.d;
    }
}
