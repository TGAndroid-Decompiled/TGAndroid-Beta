package v7;
public final class g9 extends h9 {
    public final transient int f47952c;
    public final transient int d;
    public final h9 f47953e;

    public g9(h9 h9Var, int i10, int i11) {
        this.f47953e = h9Var;
        this.f47952c = i10;
        this.d = i11;
    }

    @Override
    public final Object get(int i10) {
        w7.y7.a(i10, this.d);
        return this.f47953e.get(i10 + this.f47952c);
    }

    @Override
    public final int n() {
        return this.f47953e.o() + this.f47952c + this.d;
    }

    @Override
    public final int o() {
        return this.f47953e.o() + this.f47952c;
    }

    @Override
    public final Object[] p() {
        return this.f47953e.p();
    }

    @Override
    public final h9 subList(int i10, int i11) {
        w7.y7.b(i10, i11, this.d);
        int i12 = this.f47952c;
        return this.f47953e.subList(i10 + i12, i11 + i12);
    }

    @Override
    public final int size() {
        return this.d;
    }
}
