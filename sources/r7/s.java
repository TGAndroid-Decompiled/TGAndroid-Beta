package r7;

import w7.f7;
public final class s extends t {
    public final transient int f47076c;
    public final transient int d;
    public final t f47077e;

    public s(t tVar, int i10, int i11) {
        this.f47077e = tVar;
        this.f47076c = i10;
        this.d = i11;
    }

    @Override
    public final Object get(int i10) {
        f7.a(i10, this.d);
        return this.f47077e.get(i10 + this.f47076c);
    }

    @Override
    public final int n() {
        return this.f47077e.o() + this.f47076c + this.d;
    }

    @Override
    public final int o() {
        return this.f47077e.o() + this.f47076c;
    }

    @Override
    public final boolean p() {
        return true;
    }

    @Override
    public final Object[] q() {
        return this.f47077e.q();
    }

    @Override
    public final t subList(int i10, int i11) {
        f7.b(i10, i11, this.d);
        int i12 = this.f47076c;
        return this.f47077e.subList(i10 + i12, i11 + i12);
    }

    @Override
    public final int size() {
        return this.d;
    }
}
