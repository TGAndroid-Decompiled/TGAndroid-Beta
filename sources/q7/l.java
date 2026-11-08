package q7;
public final class l extends m {
    public final transient int f53999c;
    public final transient int d;
    public final m f54000e;

    public l(m mVar, int i7, int i10) {
        this.f54000e = mVar;
        this.f53999c = i7;
        this.d = i10;
    }

    @Override
    public final Object get(int i7) {
        a.e(i7, this.d);
        return this.f54000e.get(i7 + this.f53999c);
    }

    @Override
    public final int i() {
        return this.f54000e.j() + this.f53999c + this.d;
    }

    @Override
    public final int j() {
        return this.f54000e.j() + this.f53999c;
    }

    @Override
    public final Object[] l() {
        return this.f54000e.l();
    }

    @Override
    public final m subList(int i7, int i10) {
        a.m(i7, i10, this.d);
        int i11 = this.f53999c;
        return this.f54000e.subList(i7 + i11, i10 + i11);
    }

    @Override
    public final int size() {
        return this.d;
    }
}
