package y7;

import c8.yd;
public final class k9 extends l9 {
    public final transient int f59084c;
    public final transient int d;
    public final l9 f59085e;

    public k9(l9 l9Var, int i7, int i10) {
        this.f59085e = l9Var;
        this.f59084c = i7;
        this.d = i10;
    }

    @Override
    public final Object get(int i7) {
        yd.a(i7, this.d);
        return this.f59085e.get(i7 + this.f59084c);
    }

    @Override
    public final int i() {
        return this.f59085e.j() + this.f59084c + this.d;
    }

    @Override
    public final int j() {
        return this.f59085e.j() + this.f59084c;
    }

    @Override
    public final Object[] k() {
        return this.f59085e.k();
    }

    @Override
    public final l9 subList(int i7, int i10) {
        yd.b(i7, i10, this.d);
        int i11 = this.f59084c;
        return this.f59085e.subList(i7 + i11, i10 + i11);
    }

    @Override
    public final int size() {
        return this.d;
    }
}
