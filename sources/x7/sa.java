package x7;
public final class sa extends ta {
    public final transient int f51631c;
    public final transient int d;
    public final ta e;

    public sa(ta taVar, int i10, int i11) {
        this.e = taVar;
        this.f51631c = i10;
        this.d = i11;
    }

    @Override
    public final Object get(int i10) {
        w7.b0.a(i10, this.d);
        return this.e.get(i10 + this.f51631c);
    }

    @Override
    public final int m() {
        return this.e.n() + this.f51631c + this.d;
    }

    @Override
    public final int n() {
        return this.e.n() + this.f51631c;
    }

    @Override
    public final Object[] o() {
        return this.e.o();
    }

    @Override
    public final ta subList(int i10, int i11) {
        w7.b0.b(i10, i11, this.d);
        int i12 = this.f51631c;
        return this.e.subList(i10 + i12, i11 + i12);
    }

    @Override
    public final int size() {
        return this.d;
    }
}
