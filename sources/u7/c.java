package u7;

import w7.t7;
public final class c extends d {
    public final transient int f47557c;
    public final transient int d;
    public final d f47558e;

    public c(d dVar, int i10, int i11) {
        this.f47558e = dVar;
        this.f47557c = i10;
        this.d = i11;
    }

    @Override
    public final Object get(int i10) {
        t7.a(i10, this.d);
        return this.f47558e.get(i10 + this.f47557c);
    }

    @Override
    public final int n() {
        return this.f47558e.o() + this.f47557c + this.d;
    }

    @Override
    public final int o() {
        return this.f47558e.o() + this.f47557c;
    }

    @Override
    public final Object[] p() {
        return this.f47558e.p();
    }

    @Override
    public final d subList(int i10, int i11) {
        t7.b(i10, i11, this.d);
        int i12 = this.f47557c;
        return this.f47558e.subList(i10 + i12, i11 + i12);
    }

    @Override
    public final int size() {
        return this.d;
    }
}
