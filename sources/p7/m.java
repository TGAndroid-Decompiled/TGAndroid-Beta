package p7;
public final class m extends n {
    public final transient int f53381c;
    public final transient int d;
    public final n f53382e;

    public m(n nVar, int i3, int i10) {
        this.f53382e = nVar;
        this.f53381c = i3;
        this.d = i10;
    }

    @Override
    public final Object get(int i3) {
        a.e(i3, this.d);
        return this.f53382e.get(i3 + this.f53381c);
    }

    @Override
    public final int i() {
        return this.f53382e.j() + this.f53381c + this.d;
    }

    @Override
    public final int j() {
        return this.f53382e.j() + this.f53381c;
    }

    @Override
    public final Object[] l() {
        return this.f53382e.l();
    }

    @Override
    public final n subList(int i3, int i10) {
        a.m(i3, i10, this.d);
        int i11 = this.f53381c;
        return this.f53382e.subList(i3 + i11, i10 + i11);
    }

    @Override
    public final int size() {
        return this.d;
    }
}
