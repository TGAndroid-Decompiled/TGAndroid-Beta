package z7;

import c8.le;
public final class sa extends ta {
    public final transient int f61764c;
    public final transient int d;
    public final ta f61765e;

    public sa(ta taVar, int i7, int i10) {
        this.f61765e = taVar;
        this.f61764c = i7;
        this.d = i10;
    }

    @Override
    public final Object get(int i7) {
        le.a(i7, this.d);
        return this.f61765e.get(i7 + this.f61764c);
    }

    @Override
    public final int i() {
        return this.f61765e.j() + this.f61764c + this.d;
    }

    @Override
    public final int j() {
        return this.f61765e.j() + this.f61764c;
    }

    @Override
    public final Object[] k() {
        return this.f61765e.k();
    }

    @Override
    public final ta subList(int i7, int i10) {
        le.b(i7, i10, this.d);
        int i11 = this.f61764c;
        return this.f61765e.subList(i7 + i11, i10 + i11);
    }

    @Override
    public final int size() {
        return this.d;
    }
}
