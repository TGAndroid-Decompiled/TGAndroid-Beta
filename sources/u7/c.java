package u7;

import w7.t7;
public final class c extends d {
    public final transient int f48912c;
    public final transient int d;
    public final d f48913e;

    public c(d dVar, int i10, int i11) {
        this.f48913e = dVar;
        this.f48912c = i10;
        this.d = i11;
    }

    @Override
    public final Object get(int i10) {
        t7.a(i10, this.d);
        return this.f48913e.get(i10 + this.f48912c);
    }

    @Override
    public final int n() {
        return this.f48913e.o() + this.f48912c + this.d;
    }

    @Override
    public final int o() {
        return this.f48913e.o() + this.f48912c;
    }

    @Override
    public final Object[] p() {
        return this.f48913e.p();
    }

    @Override
    public final d subList(int i10, int i11) {
        t7.b(i10, i11, this.d);
        int i12 = this.f48912c;
        return this.f48913e.subList(i10 + i12, i11 + i12);
    }

    @Override
    public final int size() {
        return this.d;
    }
}
