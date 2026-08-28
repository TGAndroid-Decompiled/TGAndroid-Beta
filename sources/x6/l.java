package x6;
public final class l extends m {
    public final transient int f49034c;
    public final transient int d;
    public final m f49035e;

    public l(m mVar, int i9, int i10) {
        this.f49035e = mVar;
        this.f49034c = i9;
        this.d = i10;
    }

    @Override
    public final Object get(int i9) {
        a.e(i9, this.d);
        return this.f49035e.get(i9 + this.f49034c);
    }

    @Override
    public final int n() {
        return this.f49035e.o() + this.f49034c + this.d;
    }

    @Override
    public final int o() {
        return this.f49035e.o() + this.f49034c;
    }

    @Override
    public final Object[] q() {
        return this.f49035e.q();
    }

    @Override
    public final m subList(int i9, int i10) {
        a.m(i9, i10, this.d);
        int i11 = this.f49034c;
        return this.f49035e.subList(i9 + i11, i10 + i11);
    }

    @Override
    public final int size() {
        return this.d;
    }
}
