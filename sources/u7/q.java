package u7;

import c8.pc;
public final class q extends r {
    public final transient int f56271c;
    public final transient int d;
    public final r f56272e;

    public q(r rVar, int i7, int i10) {
        this.f56272e = rVar;
        this.f56271c = i7;
        this.d = i10;
    }

    @Override
    public final Object get(int i7) {
        pc.a(i7, this.d);
        return this.f56272e.get(i7 + this.f56271c);
    }

    @Override
    public final int i() {
        return this.f56272e.j() + this.f56271c + this.d;
    }

    @Override
    public final int j() {
        return this.f56272e.j() + this.f56271c;
    }

    @Override
    public final boolean k() {
        return true;
    }

    @Override
    public final Object[] l() {
        return this.f56272e.l();
    }

    @Override
    public final r subList(int i7, int i10) {
        pc.b(i7, i10, this.d);
        int i11 = this.f56271c;
        return this.f56272e.subList(i7 + i11, i10 + i11);
    }

    @Override
    public final int size() {
        return this.d;
    }
}
