package p7;

import c8.nb;
public final class d extends e {
    public final transient int f55603c;
    public final transient int d;
    public final e f55604e;

    public d(e eVar, int i7, int i10) {
        this.f55604e = eVar;
        this.f55603c = i7;
        this.d = i10;
    }

    @Override
    public final Object[] f() {
        return this.f55604e.f();
    }

    @Override
    public final Object get(int i7) {
        nb.a(i7, this.d);
        return this.f55604e.get(i7 + this.f55603c);
    }

    @Override
    public final int i() {
        return this.f55604e.i() + this.f55603c;
    }

    @Override
    public final int j() {
        return this.f55604e.i() + this.f55603c + this.d;
    }

    @Override
    public final e subList(int i7, int i10) {
        nb.b(i7, i10, this.d);
        int i11 = this.f55603c;
        return this.f55604e.subList(i7 + i11, i10 + i11);
    }

    @Override
    public final int size() {
        return this.d;
    }
}
