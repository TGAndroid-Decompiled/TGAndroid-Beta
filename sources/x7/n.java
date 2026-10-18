package x7;
public final class n extends o {
    public final transient int f49510c;
    public final transient int d;
    public final o e;

    public n(o oVar, int i10, int i11) {
        this.e = oVar;
        this.f49510c = i10;
        this.d = i11;
    }

    @Override
    public final Object get(int i10) {
        w7.o8.a(i10, this.d);
        return this.e.get(i10 + this.f49510c);
    }

    @Override
    public final int m() {
        return this.e.n() + this.f49510c + this.d;
    }

    @Override
    public final int n() {
        return this.e.n() + this.f49510c;
    }

    @Override
    public final Object[] o() {
        return this.e.o();
    }

    @Override
    public final o subList(int i10, int i11) {
        w7.o8.b(i10, i11, this.d);
        int i12 = this.f49510c;
        return this.e.subList(i10 + i12, i11 + i12);
    }

    @Override
    public final int size() {
        return this.d;
    }
}
