package y7;

import c8.ge;
public final class k9 extends l9 {
    public final transient int f60998c;
    public final transient int d;
    public final l9 f60999e;

    public k9(l9 l9Var, int i7, int i10) {
        this.f60999e = l9Var;
        this.f60998c = i7;
        this.d = i10;
    }

    @Override
    public final Object get(int i7) {
        ge.a(i7, this.d);
        return this.f60999e.get(i7 + this.f60998c);
    }

    @Override
    public final int i() {
        return this.f60999e.j() + this.f60998c + this.d;
    }

    @Override
    public final int j() {
        return this.f60999e.j() + this.f60998c;
    }

    @Override
    public final Object[] k() {
        return this.f60999e.k();
    }

    @Override
    public final l9 subList(int i7, int i10) {
        ge.b(i7, i10, this.d);
        int i11 = this.f60998c;
        return this.f60999e.subList(i7 + i11, i10 + i11);
    }

    @Override
    public final int size() {
        return this.d;
    }
}
