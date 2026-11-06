package p7;

import c8.cb;
public final class d extends e {
    public final transient int f53369c;
    public final transient int d;
    public final e f53370e;

    public d(e eVar, int i7, int i10) {
        this.f53370e = eVar;
        this.f53369c = i7;
        this.d = i10;
    }

    @Override
    public final Object[] f() {
        return this.f53370e.f();
    }

    @Override
    public final Object get(int i7) {
        cb.a(i7, this.d);
        return this.f53370e.get(i7 + this.f53369c);
    }

    @Override
    public final int i() {
        return this.f53370e.i() + this.f53369c;
    }

    @Override
    public final int j() {
        return this.f53370e.i() + this.f53369c + this.d;
    }

    @Override
    public final e subList(int i7, int i10) {
        cb.b(i7, i10, this.d);
        int i11 = this.f53369c;
        return this.f53370e.subList(i7 + i11, i10 + i11);
    }

    @Override
    public final int size() {
        return this.d;
    }
}
