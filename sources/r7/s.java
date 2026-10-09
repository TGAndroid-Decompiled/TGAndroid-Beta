package r7;

import w7.f7;
public final class s extends t {
    public final transient int f47032c;
    public final transient int d;
    public final t f47033e;

    public s(t tVar, int i10, int i11) {
        this.f47033e = tVar;
        this.f47032c = i10;
        this.d = i11;
    }

    @Override
    public final Object get(int i10) {
        f7.a(i10, this.d);
        return this.f47033e.get(i10 + this.f47032c);
    }

    @Override
    public final int n() {
        return this.f47033e.o() + this.f47032c + this.d;
    }

    @Override
    public final int o() {
        return this.f47033e.o() + this.f47032c;
    }

    @Override
    public final boolean p() {
        return true;
    }

    @Override
    public final Object[] q() {
        return this.f47033e.q();
    }

    @Override
    public final t subList(int i10, int i11) {
        f7.b(i10, i11, this.d);
        int i12 = this.f47032c;
        return this.f47033e.subList(i10 + i12, i11 + i12);
    }

    @Override
    public final int size() {
        return this.d;
    }
}
