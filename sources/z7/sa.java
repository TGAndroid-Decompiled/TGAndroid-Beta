package z7;

import c8.he;
public final class sa extends ta {
    public final transient int f59848c;
    public final transient int d;
    public final ta f59849e;

    public sa(ta taVar, int i7, int i10) {
        this.f59849e = taVar;
        this.f59848c = i7;
        this.d = i10;
    }

    @Override
    public final Object get(int i7) {
        he.a(i7, this.d);
        return this.f59849e.get(i7 + this.f59848c);
    }

    @Override
    public final int i() {
        return this.f59849e.j() + this.f59848c + this.d;
    }

    @Override
    public final int j() {
        return this.f59849e.j() + this.f59848c;
    }

    @Override
    public final Object[] k() {
        return this.f59849e.k();
    }

    @Override
    public final ta subList(int i7, int i10) {
        he.b(i7, i10, this.d);
        int i11 = this.f59848c;
        return this.f59849e.subList(i7 + i11, i10 + i11);
    }

    @Override
    public final int size() {
        return this.d;
    }
}
