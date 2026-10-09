package v7;
public final class g9 extends h9 {
    public final transient int f49200c;
    public final transient int d;
    public final h9 f49201e;

    public g9(h9 h9Var, int i10, int i11) {
        this.f49201e = h9Var;
        this.f49200c = i10;
        this.d = i11;
    }

    @Override
    public final Object get(int i10) {
        w7.x7.a(i10, this.d);
        return this.f49201e.get(i10 + this.f49200c);
    }

    @Override
    public final int n() {
        return this.f49201e.o() + this.f49200c + this.d;
    }

    @Override
    public final int o() {
        return this.f49201e.o() + this.f49200c;
    }

    @Override
    public final Object[] p() {
        return this.f49201e.p();
    }

    @Override
    public final h9 subList(int i10, int i11) {
        w7.x7.b(i10, i11, this.d);
        int i12 = this.f49200c;
        return this.f49201e.subList(i10 + i12, i11 + i12);
    }

    @Override
    public final int size() {
        return this.d;
    }
}
