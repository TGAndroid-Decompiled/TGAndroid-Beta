package z7;
public final class h extends i {
    public final transient int f52629c;
    public final transient int d;
    public final i f52630e;

    public h(i iVar, int i10, int i11) {
        this.f52630e = iVar;
        this.f52629c = i10;
        this.d = i11;
    }

    @Override
    public final Object get(int i10) {
        w7.p9.a(i10, this.d);
        return this.f52630e.get(i10 + this.f52629c);
    }

    @Override
    public final int n() {
        return this.f52630e.o() + this.f52629c + this.d;
    }

    @Override
    public final int o() {
        return this.f52630e.o() + this.f52629c;
    }

    @Override
    public final Object[] p() {
        return this.f52630e.p();
    }

    @Override
    public final i subList(int i10, int i11) {
        w7.p9.b(i10, i11, this.d);
        int i12 = this.f52629c;
        return this.f52630e.subList(i10 + i12, i11 + i12);
    }

    @Override
    public final int size() {
        return this.d;
    }
}
