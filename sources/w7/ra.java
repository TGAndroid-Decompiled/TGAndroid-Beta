package w7;
public final class ra extends sa {
    public final transient int f48826c;
    public final transient int d;
    public final sa f48827e;

    public ra(sa saVar, int i10, int i11) {
        this.f48827e = saVar;
        this.f48826c = i10;
        this.d = i11;
    }

    @Override
    public final Object get(int i10) {
        c8.a(i10, this.d);
        return this.f48827e.get(i10 + this.f48826c);
    }

    @Override
    public final int n() {
        return this.f48827e.o() + this.f48826c + this.d;
    }

    @Override
    public final int o() {
        return this.f48827e.o() + this.f48826c;
    }

    @Override
    public final Object[] p() {
        return this.f48827e.p();
    }

    @Override
    public final sa subList(int i10, int i11) {
        c8.b(i10, i11, this.d);
        int i12 = this.f48826c;
        return this.f48827e.subList(i10 + i12, i11 + i12);
    }

    @Override
    public final int size() {
        return this.d;
    }
}
