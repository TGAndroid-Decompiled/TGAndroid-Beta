package y7;

import c8.xd;
public final class k9 extends l9 {
    public final transient int f58964c;
    public final transient int d;
    public final l9 f58965e;

    public k9(l9 l9Var, int i7, int i10) {
        this.f58965e = l9Var;
        this.f58964c = i7;
        this.d = i10;
    }

    @Override
    public final Object get(int i7) {
        xd.a(i7, this.d);
        return this.f58965e.get(i7 + this.f58964c);
    }

    @Override
    public final int i() {
        return this.f58965e.j() + this.f58964c + this.d;
    }

    @Override
    public final int j() {
        return this.f58965e.j() + this.f58964c;
    }

    @Override
    public final Object[] k() {
        return this.f58965e.k();
    }

    @Override
    public final l9 subList(int i7, int i10) {
        xd.b(i7, i10, this.d);
        int i11 = this.f58964c;
        return this.f58965e.subList(i7 + i11, i10 + i11);
    }

    @Override
    public final int size() {
        return this.d;
    }
}
