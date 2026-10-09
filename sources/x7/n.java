package x7;
public final class n extends o {
    public final transient int f50858c;
    public final transient int d;
    public final o f50859e;

    public n(o oVar, int i10, int i11) {
        this.f50859e = oVar;
        this.f50858c = i10;
        this.d = i11;
    }

    @Override
    public final Object get(int i10) {
        w7.m8.a(i10, this.d);
        return this.f50859e.get(i10 + this.f50858c);
    }

    @Override
    public final int n() {
        return this.f50859e.o() + this.f50858c + this.d;
    }

    @Override
    public final int o() {
        return this.f50859e.o() + this.f50858c;
    }

    @Override
    public final Object[] p() {
        return this.f50859e.p();
    }

    @Override
    public final o subList(int i10, int i11) {
        w7.m8.b(i10, i11, this.d);
        int i12 = this.f50858c;
        return this.f50859e.subList(i10 + i12, i11 + i12);
    }

    @Override
    public final int size() {
        return this.d;
    }
}
