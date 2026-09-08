package u7;

import w7.r7;
public final class c extends d {
    public final transient int f46995c;
    public final transient int d;
    public final d f46996e;

    public c(d dVar, int i10, int i11) {
        this.f46996e = dVar;
        this.f46995c = i10;
        this.d = i11;
    }

    @Override
    public final Object get(int i10) {
        r7.a(i10, this.d);
        return this.f46996e.get(i10 + this.f46995c);
    }

    @Override
    public final int n() {
        return this.f46996e.o() + this.f46995c + this.d;
    }

    @Override
    public final int o() {
        return this.f46996e.o() + this.f46995c;
    }

    @Override
    public final Object[] p() {
        return this.f46996e.p();
    }

    @Override
    public final d subList(int i10, int i11) {
        r7.b(i10, i11, this.d);
        int i12 = this.f46995c;
        return this.f46996e.subList(i10 + i12, i11 + i12);
    }

    @Override
    public final int size() {
        return this.d;
    }
}
