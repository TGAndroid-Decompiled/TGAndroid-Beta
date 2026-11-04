package v7;

import x7.j5;
public final class c extends d {
    public final transient int f56450c;
    public final transient int d;
    public final d f56451e;

    public c(d dVar, int i3, int i10) {
        this.f56451e = dVar;
        this.f56450c = i3;
        this.d = i10;
    }

    @Override
    public final Object get(int i3) {
        j5.a(i3, this.d);
        return this.f56451e.get(i3 + this.f56450c);
    }

    @Override
    public final int i() {
        return this.f56451e.j() + this.f56450c + this.d;
    }

    @Override
    public final int j() {
        return this.f56451e.j() + this.f56450c;
    }

    @Override
    public final Object[] k() {
        return this.f56451e.k();
    }

    @Override
    public final d subList(int i3, int i10) {
        j5.c(i3, i10, this.d);
        int i11 = this.f56450c;
        return this.f56451e.subList(i3 + i11, i10 + i11);
    }

    @Override
    public final int size() {
        return this.d;
    }
}
