package u7;

import w7.t7;
public final class c extends d {
    public final transient int f47566c;
    public final transient int d;
    public final d f47567e;

    public c(d dVar, int i10, int i11) {
        this.f47567e = dVar;
        this.f47566c = i10;
        this.d = i11;
    }

    @Override
    public final Object get(int i10) {
        t7.a(i10, this.d);
        return this.f47567e.get(i10 + this.f47566c);
    }

    @Override
    public final int n() {
        return this.f47567e.o() + this.f47566c + this.d;
    }

    @Override
    public final int o() {
        return this.f47567e.o() + this.f47566c;
    }

    @Override
    public final Object[] p() {
        return this.f47567e.p();
    }

    @Override
    public final d subList(int i10, int i11) {
        t7.b(i10, i11, this.d);
        int i12 = this.f47566c;
        return this.f47567e.subList(i10 + i12, i11 + i12);
    }

    @Override
    public final int size() {
        return this.d;
    }
}
