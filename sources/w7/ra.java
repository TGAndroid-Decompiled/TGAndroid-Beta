package w7;
public final class ra extends sa {
    public final transient int f48833c;
    public final transient int d;
    public final sa e;

    public ra(sa saVar, int i10, int i11) {
        this.e = saVar;
        this.f48833c = i10;
        this.d = i11;
    }

    @Override
    public final Object get(int i10) {
        f8.a(i10, this.d);
        return this.e.get(i10 + this.f48833c);
    }

    @Override
    public final int m() {
        return this.e.n() + this.f48833c + this.d;
    }

    @Override
    public final int n() {
        return this.e.n() + this.f48833c;
    }

    @Override
    public final Object[] o() {
        return this.e.o();
    }

    @Override
    public final sa subList(int i10, int i11) {
        f8.b(i10, i11, this.d);
        int i12 = this.f48833c;
        return this.e.subList(i10 + i12, i11 + i12);
    }

    @Override
    public final int size() {
        return this.d;
    }
}
