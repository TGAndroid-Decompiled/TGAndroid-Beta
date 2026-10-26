package w7;
public final class j9 extends k9 {
    public final transient int f50901c;
    public final transient int d;
    public final k9 e;

    public j9(k9 k9Var, int i10, int i11) {
        this.e = k9Var;
        this.f50901c = i10;
        this.d = i11;
    }

    @Override
    public final Object get(int i10) {
        y.a(i10, this.d);
        return this.e.get(i10 + this.f50901c);
    }

    @Override
    public final int m() {
        return this.e.n() + this.f50901c + this.d;
    }

    @Override
    public final int n() {
        return this.e.n() + this.f50901c;
    }

    @Override
    public final Object[] o() {
        return this.e.o();
    }

    @Override
    public final k9 subList(int i10, int i11) {
        y.b(i10, i11, this.d);
        int i12 = this.f50901c;
        return this.e.subList(i10 + i12, i11 + i12);
    }

    @Override
    public final int size() {
        return this.d;
    }
}
