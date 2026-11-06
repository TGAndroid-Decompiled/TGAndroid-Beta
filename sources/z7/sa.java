package z7;

import c8.ie;
public final class sa extends ta {
    public final transient int f59847c;
    public final transient int d;
    public final ta f59848e;

    public sa(ta taVar, int i7, int i10) {
        this.f59848e = taVar;
        this.f59847c = i7;
        this.d = i10;
    }

    @Override
    public final Object get(int i7) {
        ie.a(i7, this.d);
        return this.f59848e.get(i7 + this.f59847c);
    }

    @Override
    public final int i() {
        return this.f59848e.j() + this.f59847c + this.d;
    }

    @Override
    public final int j() {
        return this.f59848e.j() + this.f59847c;
    }

    @Override
    public final Object[] k() {
        return this.f59848e.k();
    }

    @Override
    public final ta subList(int i7, int i10) {
        ie.b(i7, i10, this.d);
        int i11 = this.f59847c;
        return this.f59848e.subList(i7 + i11, i10 + i11);
    }

    @Override
    public final int size() {
        return this.d;
    }
}
