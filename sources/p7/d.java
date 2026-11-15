package p7;

import c8.jb;
public final class d extends e {
    public final transient int f54904c;
    public final transient int d;
    public final e f54905e;

    public d(e eVar, int i7, int i10) {
        this.f54905e = eVar;
        this.f54904c = i7;
        this.d = i10;
    }

    @Override
    public final Object[] f() {
        return this.f54905e.f();
    }

    @Override
    public final Object get(int i7) {
        jb.a(i7, this.d);
        return this.f54905e.get(i7 + this.f54904c);
    }

    @Override
    public final int i() {
        return this.f54905e.i() + this.f54904c;
    }

    @Override
    public final int j() {
        return this.f54905e.i() + this.f54904c + this.d;
    }

    @Override
    public final e subList(int i7, int i10) {
        jb.b(i7, i10, this.d);
        int i11 = this.f54904c;
        return this.f54905e.subList(i7 + i11, i10 + i11);
    }

    @Override
    public final int size() {
        return this.d;
    }
}
