package v7;
public final class g9 extends h9 {
    public final transient int f48035c;
    public final transient int d;
    public final h9 e;

    public g9(h9 h9Var, int i10, int i11) {
        this.e = h9Var;
        this.f48035c = i10;
        this.d = i11;
    }

    @Override
    public final Object get(int i10) {
        w7.b8.a(i10, this.d);
        return this.e.get(i10 + this.f48035c);
    }

    @Override
    public final int m() {
        return this.e.n() + this.f48035c + this.d;
    }

    @Override
    public final int n() {
        return this.e.n() + this.f48035c;
    }

    @Override
    public final Object[] o() {
        return this.e.o();
    }

    @Override
    public final h9 subList(int i10, int i11) {
        w7.b8.b(i10, i11, this.d);
        int i12 = this.f48035c;
        return this.e.subList(i10 + i12, i11 + i12);
    }

    @Override
    public final int size() {
        return this.d;
    }
}
