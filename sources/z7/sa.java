package z7;

import c8.le;
public final class sa extends ta {
    public final transient int f61719c;
    public final transient int d;
    public final ta f61720e;

    public sa(ta taVar, int i7, int i10) {
        this.f61720e = taVar;
        this.f61719c = i7;
        this.d = i10;
    }

    @Override
    public final Object get(int i7) {
        le.a(i7, this.d);
        return this.f61720e.get(i7 + this.f61719c);
    }

    @Override
    public final int i() {
        return this.f61720e.j() + this.f61719c + this.d;
    }

    @Override
    public final int j() {
        return this.f61720e.j() + this.f61719c;
    }

    @Override
    public final Object[] k() {
        return this.f61720e.k();
    }

    @Override
    public final ta subList(int i7, int i10) {
        le.b(i7, i10, this.d);
        int i11 = this.f61719c;
        return this.f61720e.subList(i7 + i11, i10 + i11);
    }

    @Override
    public final int size() {
        return this.d;
    }
}
