package p7;

import c8.hb;
public final class d extends e {
    public final transient int f53498c;
    public final transient int d;
    public final e f53499e;

    public d(e eVar, int i7, int i10) {
        this.f53499e = eVar;
        this.f53498c = i7;
        this.d = i10;
    }

    @Override
    public final Object[] f() {
        return this.f53499e.f();
    }

    @Override
    public final Object get(int i7) {
        hb.a(i7, this.d);
        return this.f53499e.get(i7 + this.f53498c);
    }

    @Override
    public final int i() {
        return this.f53499e.i() + this.f53498c;
    }

    @Override
    public final int j() {
        return this.f53499e.i() + this.f53498c + this.d;
    }

    @Override
    public final e subList(int i7, int i10) {
        hb.b(i7, i10, this.d);
        int i11 = this.f53498c;
        return this.f53499e.subList(i7 + i11, i10 + i11);
    }

    @Override
    public final int size() {
        return this.d;
    }
}
