package r7;

import w7.w6;
public final class s extends t {
    public final transient int f45071c;
    public final transient int d;
    public final t e;

    public s(t tVar, int i10, int i11) {
        this.e = tVar;
        this.f45071c = i10;
        this.d = i11;
    }

    @Override
    public final Object get(int i10) {
        w6.a(i10, this.d);
        return this.e.get(i10 + this.f45071c);
    }

    @Override
    public final int m() {
        return this.e.n() + this.f45071c + this.d;
    }

    @Override
    public final int n() {
        return this.e.n() + this.f45071c;
    }

    @Override
    public final boolean o() {
        return true;
    }

    @Override
    public final Object[] p() {
        return this.e.p();
    }

    @Override
    public final t subList(int i10, int i11) {
        w6.b(i10, i11, this.d);
        int i12 = this.f45071c;
        return this.e.subList(i10 + i12, i11 + i12);
    }

    @Override
    public final int size() {
        return this.d;
    }
}
