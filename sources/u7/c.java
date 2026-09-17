package u7;

import w7.r7;
public final class c extends d {
    public final transient int f46968c;
    public final transient int d;
    public final d f46969e;

    public c(d dVar, int i10, int i11) {
        this.f46969e = dVar;
        this.f46968c = i10;
        this.d = i11;
    }

    @Override
    public final Object get(int i10) {
        r7.a(i10, this.d);
        return this.f46969e.get(i10 + this.f46968c);
    }

    @Override
    public final int n() {
        return this.f46969e.o() + this.f46968c + this.d;
    }

    @Override
    public final int o() {
        return this.f46969e.o() + this.f46968c;
    }

    @Override
    public final Object[] p() {
        return this.f46969e.p();
    }

    @Override
    public final d subList(int i10, int i11) {
        r7.b(i10, i11, this.d);
        int i12 = this.f46968c;
        return this.f46969e.subList(i10 + i12, i11 + i12);
    }

    @Override
    public final int size() {
        return this.d;
    }
}
