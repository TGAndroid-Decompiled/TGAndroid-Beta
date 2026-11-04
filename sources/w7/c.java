package w7;

import x7.o5;
public final class c extends d {
    public final transient int f57406c;
    public final transient int d;
    public final d f57407e;

    public c(d dVar, int i3, int i10) {
        this.f57407e = dVar;
        this.f57406c = i3;
        this.d = i10;
    }

    @Override
    public final Object get(int i3) {
        o5.a(i3, this.d);
        return this.f57407e.get(i3 + this.f57406c);
    }

    @Override
    public final int i() {
        return this.f57407e.j() + this.f57406c + this.d;
    }

    @Override
    public final int j() {
        return this.f57407e.j() + this.f57406c;
    }

    @Override
    public final Object[] k() {
        return this.f57407e.k();
    }

    @Override
    public final d subList(int i3, int i10) {
        o5.b(i3, i10, this.d);
        int i11 = this.f57406c;
        return this.f57407e.subList(i3 + i11, i10 + i11);
    }

    @Override
    public final int size() {
        return this.d;
    }
}
