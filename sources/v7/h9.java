package v7;
public final class h9 extends i9 {
    public final transient int f44262c;
    public final transient int d;
    public final i9 e;

    public h9(i9 i9Var, int i10, int i11) {
        this.e = i9Var;
        this.f44262c = i10;
        this.d = i11;
    }

    @Override
    public final Object get(int i10) {
        w7.x7.a(i10, this.d);
        return this.e.get(i10 + this.f44262c);
    }

    @Override
    public final int n() {
        return this.e.o() + this.f44262c + this.d;
    }

    @Override
    public final int o() {
        return this.e.o() + this.f44262c;
    }

    @Override
    public final Object[] p() {
        return this.e.p();
    }

    @Override
    public final i9 subList(int i10, int i11) {
        w7.x7.b(i10, i11, this.d);
        int i12 = this.f44262c;
        return this.e.subList(i10 + i12, i11 + i12);
    }

    @Override
    public final int size() {
        return this.d;
    }
}
