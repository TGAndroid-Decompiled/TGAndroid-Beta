package r7;

import w7.b7;
public final class s extends t {
    public final transient int f44993c;
    public final transient int d;
    public final t f44994e;

    public s(t tVar, int i10, int i11) {
        this.f44994e = tVar;
        this.f44993c = i10;
        this.d = i11;
    }

    @Override
    public final Object get(int i10) {
        b7.a(i10, this.d);
        return this.f44994e.get(i10 + this.f44993c);
    }

    @Override
    public final int n() {
        return this.f44994e.o() + this.f44993c + this.d;
    }

    @Override
    public final int o() {
        return this.f44994e.o() + this.f44993c;
    }

    @Override
    public final boolean p() {
        return true;
    }

    @Override
    public final Object[] q() {
        return this.f44994e.q();
    }

    @Override
    public final t subList(int i10, int i11) {
        b7.b(i10, i11, this.d);
        int i12 = this.f44993c;
        return this.f44994e.subList(i10 + i12, i11 + i12);
    }

    @Override
    public final int size() {
        return this.d;
    }
}
