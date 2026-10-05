package t7;

import w7.m7;
public final class c extends d {
    public final transient int f46909c;
    public final transient int d;
    public final d f46910e;

    public c(d dVar, int i10, int i11) {
        this.f46910e = dVar;
        this.f46909c = i10;
        this.d = i11;
    }

    @Override
    public final Object get(int i10) {
        m7.a(i10, this.d);
        return this.f46910e.get(i10 + this.f46909c);
    }

    @Override
    public final int n() {
        return this.f46910e.o() + this.f46909c + this.d;
    }

    @Override
    public final int o() {
        return this.f46910e.o() + this.f46909c;
    }

    @Override
    public final Object[] p() {
        return this.f46910e.p();
    }

    @Override
    public final d subList(int i10, int i11) {
        m7.c(i10, i11, this.d);
        int i12 = this.f46909c;
        return this.f46910e.subList(i10 + i12, i11 + i12);
    }

    @Override
    public final int size() {
        return this.d;
    }
}
