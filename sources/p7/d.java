package p7;

import c8.hb;
public final class d extends e {
    public final transient int f53486c;
    public final transient int d;
    public final e f53487e;

    public d(e eVar, int i7, int i10) {
        this.f53487e = eVar;
        this.f53486c = i7;
        this.d = i10;
    }

    @Override
    public final Object[] f() {
        return this.f53487e.f();
    }

    @Override
    public final Object get(int i7) {
        hb.a(i7, this.d);
        return this.f53487e.get(i7 + this.f53486c);
    }

    @Override
    public final int i() {
        return this.f53487e.i() + this.f53486c;
    }

    @Override
    public final int j() {
        return this.f53487e.i() + this.f53486c + this.d;
    }

    @Override
    public final e subList(int i7, int i10) {
        hb.b(i7, i10, this.d);
        int i11 = this.f53486c;
        return this.f53487e.subList(i7 + i11, i10 + i11);
    }

    @Override
    public final int size() {
        return this.d;
    }
}
