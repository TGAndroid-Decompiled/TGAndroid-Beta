package q7;
public final class l extends m {
    public final transient int f56021c;
    public final transient int d;
    public final m f56022e;

    public l(m mVar, int i7, int i10) {
        this.f56022e = mVar;
        this.f56021c = i7;
        this.d = i10;
    }

    @Override
    public final Object get(int i7) {
        a.e(i7, this.d);
        return this.f56022e.get(i7 + this.f56021c);
    }

    @Override
    public final int i() {
        return this.f56022e.j() + this.f56021c + this.d;
    }

    @Override
    public final int j() {
        return this.f56022e.j() + this.f56021c;
    }

    @Override
    public final Object[] l() {
        return this.f56022e.l();
    }

    @Override
    public final m subList(int i7, int i10) {
        a.m(i7, i10, this.d);
        int i11 = this.f56021c;
        return this.f56022e.subList(i7 + i11, i10 + i11);
    }

    @Override
    public final int size() {
        return this.d;
    }
}
