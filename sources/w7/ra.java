package w7;
public final class ra extends sa {
    public final transient int f43783c;
    public final transient int d;
    public final sa e;

    public ra(sa saVar, int i10, int i11) {
        this.e = saVar;
        this.f43783c = i10;
        this.d = i11;
    }

    @Override
    public final Object get(int i10) {
        b8.a(i10, this.d);
        return this.e.get(i10 + this.f43783c);
    }

    @Override
    public final int n() {
        return this.e.o() + this.f43783c + this.d;
    }

    @Override
    public final int o() {
        return this.e.o() + this.f43783c;
    }

    @Override
    public final Object[] p() {
        return this.e.p();
    }

    @Override
    public final sa subList(int i10, int i11) {
        b8.b(i10, i11, this.d);
        int i12 = this.f43783c;
        return this.e.subList(i10 + i12, i11 + i12);
    }

    @Override
    public final int size() {
        return this.d;
    }
}
