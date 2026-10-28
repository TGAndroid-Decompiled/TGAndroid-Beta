package u7;
public final class c extends d {
    public final transient int f49631c;
    public final transient int d;
    public final d e;

    public c(d dVar, int i10, int i11) {
        this.e = dVar;
        this.f49631c = i10;
        this.d = i11;
    }

    @Override
    public final Object get(int i10) {
        w7.m.a(i10, this.d);
        return this.e.get(i10 + this.f49631c);
    }

    @Override
    public final int m() {
        return this.e.n() + this.f49631c + this.d;
    }

    @Override
    public final int n() {
        return this.e.n() + this.f49631c;
    }

    @Override
    public final Object[] o() {
        return this.e.o();
    }

    @Override
    public final d subList(int i10, int i11) {
        w7.m.c(i10, i11, this.d);
        int i12 = this.f49631c;
        return this.e.subList(i10 + i12, i11 + i12);
    }

    @Override
    public final int size() {
        return this.d;
    }
}
