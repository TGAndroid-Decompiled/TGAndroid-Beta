package q7;
public final class l extends m {
    public final transient int f54011c;
    public final transient int d;
    public final m f54012e;

    public l(m mVar, int i7, int i10) {
        this.f54012e = mVar;
        this.f54011c = i7;
        this.d = i10;
    }

    @Override
    public final Object get(int i7) {
        a.e(i7, this.d);
        return this.f54012e.get(i7 + this.f54011c);
    }

    @Override
    public final int i() {
        return this.f54012e.j() + this.f54011c + this.d;
    }

    @Override
    public final int j() {
        return this.f54012e.j() + this.f54011c;
    }

    @Override
    public final Object[] l() {
        return this.f54012e.l();
    }

    @Override
    public final m subList(int i7, int i10) {
        a.m(i7, i10, this.d);
        int i11 = this.f54011c;
        return this.f54012e.subList(i7 + i11, i10 + i11);
    }

    @Override
    public final int size() {
        return this.d;
    }
}
