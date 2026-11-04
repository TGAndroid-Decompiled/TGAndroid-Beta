package t7;

import x7.y;
public final class q extends r {
    public final transient int f54975c;
    public final transient int d;
    public final r f54976e;

    public q(r rVar, int i3, int i10) {
        this.f54976e = rVar;
        this.f54975c = i3;
        this.d = i10;
    }

    @Override
    public final Object get(int i3) {
        y.a(i3, this.d);
        return this.f54976e.get(i3 + this.f54975c);
    }

    @Override
    public final int i() {
        return this.f54976e.j() + this.f54975c + this.d;
    }

    @Override
    public final int j() {
        return this.f54976e.j() + this.f54975c;
    }

    @Override
    public final boolean k() {
        return true;
    }

    @Override
    public final Object[] l() {
        return this.f54976e.l();
    }

    @Override
    public final r subList(int i3, int i10) {
        y.b(i3, i10, this.d);
        int i11 = this.f54975c;
        return this.f54976e.subList(i3 + i11, i10 + i11);
    }

    @Override
    public final int size() {
        return this.d;
    }
}
