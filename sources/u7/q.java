package u7;

import c8.qc;
public final class q extends r {
    public final transient int f56384c;
    public final transient int d;
    public final r f56385e;

    public q(r rVar, int i7, int i10) {
        this.f56385e = rVar;
        this.f56384c = i7;
        this.d = i10;
    }

    @Override
    public final Object get(int i7) {
        qc.a(i7, this.d);
        return this.f56385e.get(i7 + this.f56384c);
    }

    @Override
    public final int i() {
        return this.f56385e.j() + this.f56384c + this.d;
    }

    @Override
    public final int j() {
        return this.f56385e.j() + this.f56384c;
    }

    @Override
    public final boolean k() {
        return true;
    }

    @Override
    public final Object[] l() {
        return this.f56385e.l();
    }

    @Override
    public final r subList(int i7, int i10) {
        qc.b(i7, i10, this.d);
        int i11 = this.f56384c;
        return this.f56385e.subList(i7 + i11, i10 + i11);
    }

    @Override
    public final int size() {
        return this.d;
    }
}
