package z7;
public final class h extends i {
    public final transient int f50951c;
    public final transient int d;
    public final i f50952e;

    public h(i iVar, int i10, int i11) {
        this.f50952e = iVar;
        this.f50951c = i10;
        this.d = i11;
    }

    @Override
    public final Object get(int i10) {
        w7.j9.a(i10, this.d);
        return this.f50952e.get(i10 + this.f50951c);
    }

    @Override
    public final int n() {
        return this.f50952e.o() + this.f50951c + this.d;
    }

    @Override
    public final int o() {
        return this.f50952e.o() + this.f50951c;
    }

    @Override
    public final Object[] p() {
        return this.f50952e.p();
    }

    @Override
    public final i subList(int i10, int i11) {
        w7.j9.b(i10, i11, this.d);
        int i12 = this.f50951c;
        return this.f50952e.subList(i10 + i12, i11 + i12);
    }

    @Override
    public final int size() {
        return this.d;
    }
}
