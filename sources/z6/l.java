package z6;
public final class l extends m {
    public final transient int f50734c;
    public final transient int d;
    public final m f50735e;

    public l(m mVar, int i10, int i11) {
        this.f50735e = mVar;
        this.f50734c = i10;
        this.d = i11;
    }

    @Override
    public final Object get(int i10) {
        a.e(i10, this.d);
        return this.f50735e.get(i10 + this.f50734c);
    }

    @Override
    public final int n() {
        return this.f50735e.o() + this.f50734c + this.d;
    }

    @Override
    public final int o() {
        return this.f50735e.o() + this.f50734c;
    }

    @Override
    public final Object[] q() {
        return this.f50735e.q();
    }

    @Override
    public final m subList(int i10, int i11) {
        a.m(i10, i11, this.d);
        int i12 = this.f50734c;
        return this.f50735e.subList(i10 + i12, i11 + i12);
    }

    @Override
    public final int size() {
        return this.d;
    }
}
