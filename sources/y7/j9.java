package y7;

import c8.yd;
public final class j9 extends k9 {
    public final transient int f60300c;
    public final transient int d;
    public final k9 f60301e;

    public j9(k9 k9Var, int i7, int i10) {
        this.f60301e = k9Var;
        this.f60300c = i7;
        this.d = i10;
    }

    @Override
    public final Object get(int i7) {
        yd.a(i7, this.d);
        return this.f60301e.get(i7 + this.f60300c);
    }

    @Override
    public final int i() {
        return this.f60301e.j() + this.f60300c + this.d;
    }

    @Override
    public final int j() {
        return this.f60301e.j() + this.f60300c;
    }

    @Override
    public final Object[] k() {
        return this.f60301e.k();
    }

    @Override
    public final k9 subList(int i7, int i10) {
        yd.b(i7, i10, this.d);
        int i11 = this.f60300c;
        return this.f60301e.subList(i7 + i11, i10 + i11);
    }

    @Override
    public final int size() {
        return this.d;
    }
}
