package q7;
public final class l extends m {
    public final transient int f53998c;
    public final transient int d;
    public final m f53999e;

    public l(m mVar, int i7, int i10) {
        this.f53999e = mVar;
        this.f53998c = i7;
        this.d = i10;
    }

    @Override
    public final Object get(int i7) {
        a.e(i7, this.d);
        return this.f53999e.get(i7 + this.f53998c);
    }

    @Override
    public final int i() {
        return this.f53999e.j() + this.f53998c + this.d;
    }

    @Override
    public final int j() {
        return this.f53999e.j() + this.f53998c;
    }

    @Override
    public final Object[] l() {
        return this.f53999e.l();
    }

    @Override
    public final m subList(int i7, int i10) {
        a.m(i7, i10, this.d);
        int i11 = this.f53998c;
        return this.f53999e.subList(i7 + i11, i10 + i11);
    }

    @Override
    public final int size() {
        return this.d;
    }
}
