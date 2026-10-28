package x7;
public final class sa extends ta {
    public final transient int f51692c;
    public final transient int d;
    public final ta e;

    public sa(ta taVar, int i10, int i11) {
        this.e = taVar;
        this.f51692c = i10;
        this.d = i11;
    }

    @Override
    public final Object get(int i10) {
        w7.c0.a(i10, this.d);
        return this.e.get(i10 + this.f51692c);
    }

    @Override
    public final int m() {
        return this.e.n() + this.f51692c + this.d;
    }

    @Override
    public final int n() {
        return this.e.n() + this.f51692c;
    }

    @Override
    public final Object[] o() {
        return this.e.o();
    }

    @Override
    public final ta subList(int i10, int i11) {
        w7.c0.b(i10, i11, this.d);
        int i12 = this.f51692c;
        return this.e.subList(i10 + i12, i11 + i12);
    }

    @Override
    public final int size() {
        return this.d;
    }
}
