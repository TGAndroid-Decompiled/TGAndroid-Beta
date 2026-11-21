package p7;

import c8.mb;
public final class d extends e {
    public final transient int f55521c;
    public final transient int d;
    public final e f55522e;

    public d(e eVar, int i7, int i10) {
        this.f55522e = eVar;
        this.f55521c = i7;
        this.d = i10;
    }

    @Override
    public final Object[] f() {
        return this.f55522e.f();
    }

    @Override
    public final Object get(int i7) {
        mb.a(i7, this.d);
        return this.f55522e.get(i7 + this.f55521c);
    }

    @Override
    public final int i() {
        return this.f55522e.i() + this.f55521c;
    }

    @Override
    public final int j() {
        return this.f55522e.i() + this.f55521c + this.d;
    }

    @Override
    public final e subList(int i7, int i10) {
        mb.b(i7, i10, this.d);
        int i11 = this.f55521c;
        return this.f55522e.subList(i7 + i11, i10 + i11);
    }

    @Override
    public final int size() {
        return this.d;
    }
}
