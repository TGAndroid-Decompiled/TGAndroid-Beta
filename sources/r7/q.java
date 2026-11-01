package r7;

import w7.b7;
public final class q extends r {
    public final transient int f46373c;
    public final transient int d;
    public final r e;

    public q(r rVar, int i10, int i11) {
        this.e = rVar;
        this.f46373c = i10;
        this.d = i11;
    }

    @Override
    public final Object get(int i10) {
        b7.a(i10, this.d);
        return this.e.get(i10 + this.f46373c);
    }

    @Override
    public final int m() {
        return this.e.n() + this.f46373c + this.d;
    }

    @Override
    public final int n() {
        return this.e.n() + this.f46373c;
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
    public final r subList(int i10, int i11) {
        b7.b(i10, i11, this.d);
        int i12 = this.f46373c;
        return this.e.subList(i10 + i12, i11 + i12);
    }

    @Override
    public final int size() {
        return this.d;
    }
}
