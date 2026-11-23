package z7;

import c8.me;
public final class sa extends ta {
    public final transient int f61729c;
    public final transient int d;
    public final ta f61730e;

    public sa(ta taVar, int i7, int i10) {
        this.f61730e = taVar;
        this.f61729c = i7;
        this.d = i10;
    }

    @Override
    public final Object get(int i7) {
        me.a(i7, this.d);
        return this.f61730e.get(i7 + this.f61729c);
    }

    @Override
    public final int i() {
        return this.f61730e.j() + this.f61729c + this.d;
    }

    @Override
    public final int j() {
        return this.f61730e.j() + this.f61729c;
    }

    @Override
    public final Object[] k() {
        return this.f61730e.k();
    }

    @Override
    public final ta subList(int i7, int i10) {
        me.b(i7, i10, this.d);
        int i11 = this.f61729c;
        return this.f61730e.subList(i7 + i11, i10 + i11);
    }

    @Override
    public final int size() {
        return this.d;
    }
}
