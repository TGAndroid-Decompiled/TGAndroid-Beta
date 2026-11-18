package p7;

import c8.mb;
public final class d extends e {
    public final transient int f55480c;
    public final transient int d;
    public final e f55481e;

    public d(e eVar, int i7, int i10) {
        this.f55481e = eVar;
        this.f55480c = i7;
        this.d = i10;
    }

    @Override
    public final Object[] f() {
        return this.f55481e.f();
    }

    @Override
    public final Object get(int i7) {
        mb.a(i7, this.d);
        return this.f55481e.get(i7 + this.f55480c);
    }

    @Override
    public final int i() {
        return this.f55481e.i() + this.f55480c;
    }

    @Override
    public final int j() {
        return this.f55481e.i() + this.f55480c + this.d;
    }

    @Override
    public final e subList(int i7, int i10) {
        mb.b(i7, i10, this.d);
        int i11 = this.f55480c;
        return this.f55481e.subList(i7 + i11, i10 + i11);
    }

    @Override
    public final int size() {
        return this.d;
    }
}
