package p7;

import c8.nb;
public final class d extends e {
    public final transient int f55490c;
    public final transient int d;
    public final e f55491e;

    public d(e eVar, int i7, int i10) {
        this.f55491e = eVar;
        this.f55490c = i7;
        this.d = i10;
    }

    @Override
    public final Object[] f() {
        return this.f55491e.f();
    }

    @Override
    public final Object get(int i7) {
        nb.a(i7, this.d);
        return this.f55491e.get(i7 + this.f55490c);
    }

    @Override
    public final int i() {
        return this.f55491e.i() + this.f55490c;
    }

    @Override
    public final int j() {
        return this.f55491e.i() + this.f55490c + this.d;
    }

    @Override
    public final e subList(int i7, int i10) {
        nb.b(i7, i10, this.d);
        int i11 = this.f55490c;
        return this.f55491e.subList(i7 + i11, i10 + i11);
    }

    @Override
    public final int size() {
        return this.d;
    }
}
