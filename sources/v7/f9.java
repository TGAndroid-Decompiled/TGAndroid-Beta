package v7;
public final class f9 extends g9 {
    public final transient int f50445c;
    public final transient int d;
    public final g9 e;

    public f9(g9 g9Var, int i10, int i11) {
        this.e = g9Var;
        this.f50445c = i10;
        this.d = i11;
    }

    @Override
    public final Object get(int i10) {
        w7.h8.a(i10, this.d);
        return this.e.get(i10 + this.f50445c);
    }

    @Override
    public final int m() {
        return this.e.n() + this.f50445c + this.d;
    }

    @Override
    public final int n() {
        return this.e.n() + this.f50445c;
    }

    @Override
    public final Object[] o() {
        return this.e.o();
    }

    @Override
    public final g9 subList(int i10, int i11) {
        w7.h8.b(i10, i11, this.d);
        int i12 = this.f50445c;
        return this.e.subList(i10 + i12, i11 + i12);
    }

    @Override
    public final int size() {
        return this.d;
    }
}
