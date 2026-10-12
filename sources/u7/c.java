package u7;

import w7.t7;
public final class c extends d {
    public final transient int f49096c;
    public final transient int d;
    public final d f49097e;

    public c(d dVar, int i10, int i11) {
        this.f49097e = dVar;
        this.f49096c = i10;
        this.d = i11;
    }

    @Override
    public final Object get(int i10) {
        t7.a(i10, this.d);
        return this.f49097e.get(i10 + this.f49096c);
    }

    @Override
    public final int n() {
        return this.f49097e.o() + this.f49096c + this.d;
    }

    @Override
    public final int o() {
        return this.f49097e.o() + this.f49096c;
    }

    @Override
    public final Object[] p() {
        return this.f49097e.p();
    }

    @Override
    public final d subList(int i10, int i11) {
        t7.b(i10, i11, this.d);
        int i12 = this.f49096c;
        return this.f49097e.subList(i10 + i12, i11 + i12);
    }

    @Override
    public final int size() {
        return this.d;
    }
}
