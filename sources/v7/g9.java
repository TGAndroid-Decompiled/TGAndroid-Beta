package v7;
public final class g9 extends h9 {
    public final transient int f43010c;
    public final transient int d;
    public final h9 e;

    public g9(h9 h9Var, int i10, int i11) {
        this.e = h9Var;
        this.f43010c = i10;
        this.d = i11;
    }

    @Override
    public final Object get(int i10) {
        w7.w7.a(i10, this.d);
        return this.e.get(i10 + this.f43010c);
    }

    @Override
    public final int n() {
        return this.e.o() + this.f43010c + this.d;
    }

    @Override
    public final int o() {
        return this.e.o() + this.f43010c;
    }

    @Override
    public final Object[] p() {
        return this.e.p();
    }

    @Override
    public final h9 subList(int i10, int i11) {
        w7.w7.b(i10, i11, this.d);
        int i12 = this.f43010c;
        return this.e.subList(i10 + i12, i11 + i12);
    }

    @Override
    public final int size() {
        return this.d;
    }
}
