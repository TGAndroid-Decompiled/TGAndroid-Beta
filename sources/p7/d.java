package p7;

import c8.mb;
public final class d extends e {
    public final transient int f55525c;
    public final transient int d;
    public final e f55526e;

    public d(e eVar, int i7, int i10) {
        this.f55526e = eVar;
        this.f55525c = i7;
        this.d = i10;
    }

    @Override
    public final Object[] f() {
        return this.f55526e.f();
    }

    @Override
    public final Object get(int i7) {
        mb.a(i7, this.d);
        return this.f55526e.get(i7 + this.f55525c);
    }

    @Override
    public final int i() {
        return this.f55526e.i() + this.f55525c;
    }

    @Override
    public final int j() {
        return this.f55526e.i() + this.f55525c + this.d;
    }

    @Override
    public final e subList(int i7, int i10) {
        mb.b(i7, i10, this.d);
        int i11 = this.f55525c;
        return this.f55526e.subList(i7 + i11, i10 + i11);
    }

    @Override
    public final int size() {
        return this.d;
    }
}
