package z7;
public final class m extends n {
    public final transient int f59945c;
    public final transient int d;
    public final n f59946e;

    public m(n nVar, int i3, int i10) {
        this.f59946e = nVar;
        this.f59945c = i3;
        this.d = i10;
    }

    @Override
    public final Object get(int i3) {
        x7.x6.a(i3, this.d);
        return this.f59946e.get(i3 + this.f59945c);
    }

    @Override
    public final int i() {
        return this.f59946e.j() + this.f59945c + this.d;
    }

    @Override
    public final int j() {
        return this.f59946e.j() + this.f59945c;
    }

    @Override
    public final Object[] k() {
        return this.f59946e.k();
    }

    @Override
    public final n subList(int i3, int i10) {
        x7.x6.b(i3, i10, this.d);
        int i11 = this.f59945c;
        return this.f59946e.subList(i3 + i11, i10 + i11);
    }

    @Override
    public final int size() {
        return this.d;
    }
}
