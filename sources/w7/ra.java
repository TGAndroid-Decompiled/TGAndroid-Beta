package w7;
public final class ra extends sa {
    public final transient int f48842c;
    public final transient int d;
    public final sa f48843e;

    public ra(sa saVar, int i10, int i11) {
        this.f48843e = saVar;
        this.f48842c = i10;
        this.d = i11;
    }

    @Override
    public final Object get(int i10) {
        c8.a(i10, this.d);
        return this.f48843e.get(i10 + this.f48842c);
    }

    @Override
    public final int n() {
        return this.f48843e.o() + this.f48842c + this.d;
    }

    @Override
    public final int o() {
        return this.f48843e.o() + this.f48842c;
    }

    @Override
    public final Object[] p() {
        return this.f48843e.p();
    }

    @Override
    public final sa subList(int i10, int i11) {
        c8.b(i10, i11, this.d);
        int i12 = this.f48842c;
        return this.f48843e.subList(i10 + i12, i11 + i12);
    }

    @Override
    public final int size() {
        return this.d;
    }
}
