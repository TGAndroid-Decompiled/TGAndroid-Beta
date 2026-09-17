package w7;
public final class ra extends sa {
    public final transient int f48309c;
    public final transient int d;
    public final sa f48310e;

    public ra(sa saVar, int i10, int i11) {
        this.f48310e = saVar;
        this.f48309c = i10;
        this.d = i11;
    }

    @Override
    public final Object get(int i10) {
        a8.a(i10, this.d);
        return this.f48310e.get(i10 + this.f48309c);
    }

    @Override
    public final int n() {
        return this.f48310e.o() + this.f48309c + this.d;
    }

    @Override
    public final int o() {
        return this.f48310e.o() + this.f48309c;
    }

    @Override
    public final Object[] p() {
        return this.f48310e.p();
    }

    @Override
    public final sa subList(int i10, int i11) {
        a8.b(i10, i11, this.d);
        int i12 = this.f48309c;
        return this.f48310e.subList(i10 + i12, i11 + i12);
    }

    @Override
    public final int size() {
        return this.d;
    }
}
