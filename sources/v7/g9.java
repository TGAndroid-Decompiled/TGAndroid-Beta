package v7;
public final class g9 extends h9 {
    public final transient int f47945c;
    public final transient int d;
    public final h9 f47946e;

    public g9(h9 h9Var, int i10, int i11) {
        this.f47946e = h9Var;
        this.f47945c = i10;
        this.d = i11;
    }

    @Override
    public final Object get(int i10) {
        w7.y7.a(i10, this.d);
        return this.f47946e.get(i10 + this.f47945c);
    }

    @Override
    public final int n() {
        return this.f47946e.o() + this.f47945c + this.d;
    }

    @Override
    public final int o() {
        return this.f47946e.o() + this.f47945c;
    }

    @Override
    public final Object[] p() {
        return this.f47946e.p();
    }

    @Override
    public final h9 subList(int i10, int i11) {
        w7.y7.b(i10, i11, this.d);
        int i12 = this.f47945c;
        return this.f47946e.subList(i10 + i12, i11 + i12);
    }

    @Override
    public final int size() {
        return this.d;
    }
}
