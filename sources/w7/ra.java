package w7;
public final class ra extends sa {
    public final transient int f50169c;
    public final transient int d;
    public final sa f50170e;

    public ra(sa saVar, int i10, int i11) {
        this.f50170e = saVar;
        this.f50169c = i10;
        this.d = i11;
    }

    @Override
    public final Object get(int i10) {
        b8.a(i10, this.d);
        return this.f50170e.get(i10 + this.f50169c);
    }

    @Override
    public final int n() {
        return this.f50170e.o() + this.f50169c + this.d;
    }

    @Override
    public final int o() {
        return this.f50170e.o() + this.f50169c;
    }

    @Override
    public final Object[] p() {
        return this.f50170e.p();
    }

    @Override
    public final sa subList(int i10, int i11) {
        b8.b(i10, i11, this.d);
        int i12 = this.f50169c;
        return this.f50170e.subList(i10 + i12, i11 + i12);
    }

    @Override
    public final int size() {
        return this.d;
    }
}
