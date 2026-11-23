package u7;

import c8.uc;
public final class q extends r {
    public final transient int f58471c;
    public final transient int d;
    public final r f58472e;

    public q(r rVar, int i7, int i10) {
        this.f58472e = rVar;
        this.f58471c = i7;
        this.d = i10;
    }

    @Override
    public final Object get(int i7) {
        uc.a(i7, this.d);
        return this.f58472e.get(i7 + this.f58471c);
    }

    @Override
    public final int i() {
        return this.f58472e.j() + this.f58471c + this.d;
    }

    @Override
    public final int j() {
        return this.f58472e.j() + this.f58471c;
    }

    @Override
    public final boolean k() {
        return true;
    }

    @Override
    public final Object[] l() {
        return this.f58472e.l();
    }

    @Override
    public final r subList(int i7, int i10) {
        uc.b(i7, i10, this.d);
        int i11 = this.f58471c;
        return this.f58472e.subList(i7 + i11, i10 + i11);
    }

    @Override
    public final int size() {
        return this.d;
    }
}
