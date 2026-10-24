package u7;

import w7.x7;
public final class c extends d {
    public final transient int f48059c;
    public final transient int d;
    public final d e;

    public c(d dVar, int i10, int i11) {
        this.e = dVar;
        this.f48059c = i10;
        this.d = i11;
    }

    @Override
    public final Object get(int i10) {
        x7.a(i10, this.d);
        return this.e.get(i10 + this.f48059c);
    }

    @Override
    public final int m() {
        return this.e.n() + this.f48059c + this.d;
    }

    @Override
    public final int n() {
        return this.e.n() + this.f48059c;
    }

    @Override
    public final Object[] o() {
        return this.e.o();
    }

    @Override
    public final d subList(int i10, int i11) {
        x7.b(i10, i11, this.d);
        int i12 = this.f48059c;
        return this.e.subList(i10 + i12, i11 + i12);
    }

    @Override
    public final int size() {
        return this.d;
    }
}
