package q7;
public final class l extends m {
    public final transient int f55447c;
    public final transient int d;
    public final m f55448e;

    public l(m mVar, int i7, int i10) {
        this.f55448e = mVar;
        this.f55447c = i7;
        this.d = i10;
    }

    @Override
    public final Object get(int i7) {
        a.e(i7, this.d);
        return this.f55448e.get(i7 + this.f55447c);
    }

    @Override
    public final int i() {
        return this.f55448e.j() + this.f55447c + this.d;
    }

    @Override
    public final int j() {
        return this.f55448e.j() + this.f55447c;
    }

    @Override
    public final Object[] l() {
        return this.f55448e.l();
    }

    @Override
    public final m subList(int i7, int i10) {
        a.m(i7, i10, this.d);
        int i11 = this.f55447c;
        return this.f55448e.subList(i7 + i11, i10 + i11);
    }

    @Override
    public final int size() {
        return this.d;
    }
}
