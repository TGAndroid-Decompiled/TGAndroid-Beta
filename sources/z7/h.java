package z7;
public final class h extends i {
    public final transient int f50887c;
    public final transient int d;
    public final i e;

    public h(i iVar, int i10, int i11) {
        this.e = iVar;
        this.f50887c = i10;
        this.d = i11;
    }

    @Override
    public final Object get(int i10) {
        w7.i9.a(i10, this.d);
        return this.e.get(i10 + this.f50887c);
    }

    @Override
    public final int m() {
        return this.e.n() + this.f50887c + this.d;
    }

    @Override
    public final int n() {
        return this.e.n() + this.f50887c;
    }

    @Override
    public final Object[] o() {
        return this.e.o();
    }

    @Override
    public final i subList(int i10, int i11) {
        w7.i9.b(i10, i11, this.d);
        int i12 = this.f50887c;
        return this.e.subList(i10 + i12, i11 + i12);
    }

    @Override
    public final int size() {
        return this.d;
    }
}
