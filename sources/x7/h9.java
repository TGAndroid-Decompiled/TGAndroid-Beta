package x7;
public final class h9 extends i9 {
    public final transient int f58310c;
    public final transient int d;
    public final i9 f58311e;

    public h9(i9 i9Var, int i3, int i10) {
        this.f58311e = i9Var;
        this.f58310c = i3;
        this.d = i10;
    }

    @Override
    public final Object get(int i3) {
        w5.a(i3, this.d);
        return this.f58311e.get(i3 + this.f58310c);
    }

    @Override
    public final int i() {
        return this.f58311e.j() + this.f58310c + this.d;
    }

    @Override
    public final int j() {
        return this.f58311e.j() + this.f58310c;
    }

    @Override
    public final Object[] k() {
        return this.f58311e.k();
    }

    @Override
    public final i9 subList(int i3, int i10) {
        w5.b(i3, i10, this.d);
        int i11 = this.f58310c;
        return this.f58311e.subList(i3 + i11, i10 + i11);
    }

    @Override
    public final int size() {
        return this.d;
    }
}
