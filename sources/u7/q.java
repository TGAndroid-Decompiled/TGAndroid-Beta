package u7;

import c8.tc;
public final class q extends r {
    public final transient int f58461c;
    public final transient int d;
    public final r f58462e;

    public q(r rVar, int i7, int i10) {
        this.f58462e = rVar;
        this.f58461c = i7;
        this.d = i10;
    }

    @Override
    public final Object get(int i7) {
        tc.a(i7, this.d);
        return this.f58462e.get(i7 + this.f58461c);
    }

    @Override
    public final int i() {
        return this.f58462e.j() + this.f58461c + this.d;
    }

    @Override
    public final int j() {
        return this.f58462e.j() + this.f58461c;
    }

    @Override
    public final boolean k() {
        return true;
    }

    @Override
    public final Object[] l() {
        return this.f58462e.l();
    }

    @Override
    public final r subList(int i7, int i10) {
        tc.b(i7, i10, this.d);
        int i11 = this.f58461c;
        return this.f58462e.subList(i7 + i11, i10 + i11);
    }

    @Override
    public final int size() {
        return this.d;
    }
}
