package u7;

import c8.tc;
public final class q extends r {
    public final transient int f58506c;
    public final transient int d;
    public final r f58507e;

    public q(r rVar, int i7, int i10) {
        this.f58507e = rVar;
        this.f58506c = i7;
        this.d = i10;
    }

    @Override
    public final Object get(int i7) {
        tc.a(i7, this.d);
        return this.f58507e.get(i7 + this.f58506c);
    }

    @Override
    public final int i() {
        return this.f58507e.j() + this.f58506c + this.d;
    }

    @Override
    public final int j() {
        return this.f58507e.j() + this.f58506c;
    }

    @Override
    public final boolean k() {
        return true;
    }

    @Override
    public final Object[] l() {
        return this.f58507e.l();
    }

    @Override
    public final r subList(int i7, int i10) {
        tc.b(i7, i10, this.d);
        int i11 = this.f58506c;
        return this.f58507e.subList(i7 + i11, i10 + i11);
    }

    @Override
    public final int size() {
        return this.d;
    }
}
