package x7;
public final class n extends o {
    public final transient int f49113c;
    public final transient int d;
    public final o f49114e;

    public n(o oVar, int i10, int i11) {
        this.f49114e = oVar;
        this.f49113c = i10;
        this.d = i11;
    }

    @Override
    public final Object get(int i10) {
        w7.m8.a(i10, this.d);
        return this.f49114e.get(i10 + this.f49113c);
    }

    @Override
    public final int n() {
        return this.f49114e.o() + this.f49113c + this.d;
    }

    @Override
    public final int o() {
        return this.f49114e.o() + this.f49113c;
    }

    @Override
    public final Object[] p() {
        return this.f49114e.p();
    }

    @Override
    public final o subList(int i10, int i11) {
        w7.m8.b(i10, i11, this.d);
        int i12 = this.f49113c;
        return this.f49114e.subList(i10 + i12, i11 + i12);
    }

    @Override
    public final int size() {
        return this.d;
    }
}
