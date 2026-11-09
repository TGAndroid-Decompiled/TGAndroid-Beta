package z7;

import c8.ie;
public final class sa extends ta {
    public final transient int f59956c;
    public final transient int d;
    public final ta f59957e;

    public sa(ta taVar, int i7, int i10) {
        this.f59957e = taVar;
        this.f59956c = i7;
        this.d = i10;
    }

    @Override
    public final Object get(int i7) {
        ie.a(i7, this.d);
        return this.f59957e.get(i7 + this.f59956c);
    }

    @Override
    public final int i() {
        return this.f59957e.j() + this.f59956c + this.d;
    }

    @Override
    public final int j() {
        return this.f59957e.j() + this.f59956c;
    }

    @Override
    public final Object[] k() {
        return this.f59957e.k();
    }

    @Override
    public final ta subList(int i7, int i10) {
        ie.b(i7, i10, this.d);
        int i11 = this.f59956c;
        return this.f59957e.subList(i7 + i11, i10 + i11);
    }

    @Override
    public final int size() {
        return this.d;
    }
}
