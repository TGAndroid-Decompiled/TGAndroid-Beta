package z7;

import c8.ie;
public final class sa extends ta {
    public final transient int f59853c;
    public final transient int d;
    public final ta f59854e;

    public sa(ta taVar, int i7, int i10) {
        this.f59854e = taVar;
        this.f59853c = i7;
        this.d = i10;
    }

    @Override
    public final Object get(int i7) {
        ie.a(i7, this.d);
        return this.f59854e.get(i7 + this.f59853c);
    }

    @Override
    public final int i() {
        return this.f59854e.j() + this.f59853c + this.d;
    }

    @Override
    public final int j() {
        return this.f59854e.j() + this.f59853c;
    }

    @Override
    public final Object[] k() {
        return this.f59854e.k();
    }

    @Override
    public final ta subList(int i7, int i10) {
        ie.b(i7, i10, this.d);
        int i11 = this.f59853c;
        return this.f59854e.subList(i7 + i11, i10 + i11);
    }

    @Override
    public final int size() {
        return this.d;
    }
}
