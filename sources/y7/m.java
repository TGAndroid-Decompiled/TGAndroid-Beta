package y7;
public final class m extends n {
    public final transient int f52275c;
    public final transient int d;
    public final n e;

    public m(n nVar, int i10, int i11) {
        this.e = nVar;
        this.f52275c = i10;
        this.d = i11;
    }

    @Override
    public final Object get(int i10) {
        w7.i5.a(i10, this.d);
        return this.e.get(i10 + this.f52275c);
    }

    @Override
    public final int m() {
        return this.e.n() + this.f52275c + this.d;
    }

    @Override
    public final int n() {
        return this.e.n() + this.f52275c;
    }

    @Override
    public final Object[] o() {
        return this.e.o();
    }

    @Override
    public final n subList(int i10, int i11) {
        w7.i5.b(i10, i11, this.d);
        int i12 = this.f52275c;
        return this.e.subList(i10 + i12, i11 + i12);
    }

    @Override
    public final int size() {
        return this.d;
    }
}
