package u7;

import c8.pc;
public final class q extends r {
    public final transient int f56296c;
    public final transient int d;
    public final r f56297e;

    public q(r rVar, int i7, int i10) {
        this.f56297e = rVar;
        this.f56296c = i7;
        this.d = i10;
    }

    @Override
    public final Object get(int i7) {
        pc.a(i7, this.d);
        return this.f56297e.get(i7 + this.f56296c);
    }

    @Override
    public final int i() {
        return this.f56297e.j() + this.f56296c + this.d;
    }

    @Override
    public final int j() {
        return this.f56297e.j() + this.f56296c;
    }

    @Override
    public final boolean k() {
        return true;
    }

    @Override
    public final Object[] l() {
        return this.f56297e.l();
    }

    @Override
    public final r subList(int i7, int i10) {
        pc.b(i7, i10, this.d);
        int i11 = this.f56296c;
        return this.f56297e.subList(i7 + i11, i10 + i11);
    }

    @Override
    public final int size() {
        return this.d;
    }
}
