package z7;
public final class h extends i {
    public final transient int f48657c;
    public final transient int d;
    public final i e;

    public h(i iVar, int i10, int i11) {
        this.e = iVar;
        this.f48657c = i10;
        this.d = i11;
    }

    @Override
    public final Object get(int i10) {
        w7.m9.a(i10, this.d);
        return this.e.get(i10 + this.f48657c);
    }

    @Override
    public final int n() {
        return this.e.o() + this.f48657c + this.d;
    }

    @Override
    public final int o() {
        return this.e.o() + this.f48657c;
    }

    @Override
    public final Object[] p() {
        return this.e.p();
    }

    @Override
    public final i subList(int i10, int i11) {
        w7.m9.b(i10, i11, this.d);
        int i12 = this.f48657c;
        return this.e.subList(i10 + i12, i11 + i12);
    }

    @Override
    public final int size() {
        return this.d;
    }
}
