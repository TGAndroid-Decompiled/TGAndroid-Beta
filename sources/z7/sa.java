package z7;

import c8.ie;
public final class sa extends ta {
    public final transient int f61154c;
    public final transient int d;
    public final ta f61155e;

    public sa(ta taVar, int i7, int i10) {
        this.f61155e = taVar;
        this.f61154c = i7;
        this.d = i10;
    }

    @Override
    public final Object get(int i7) {
        ie.a(i7, this.d);
        return this.f61155e.get(i7 + this.f61154c);
    }

    @Override
    public final int i() {
        return this.f61155e.j() + this.f61154c + this.d;
    }

    @Override
    public final int j() {
        return this.f61155e.j() + this.f61154c;
    }

    @Override
    public final Object[] k() {
        return this.f61155e.k();
    }

    @Override
    public final ta subList(int i7, int i10) {
        ie.b(i7, i10, this.d);
        int i11 = this.f61154c;
        return this.f61155e.subList(i7 + i11, i10 + i11);
    }

    @Override
    public final int size() {
        return this.d;
    }
}
