package z7;
public final class h extends i {
    public final transient int f53849c;
    public final transient int d;
    public final i f53850e;

    public h(i iVar, int i10, int i11) {
        this.f53850e = iVar;
        this.f53849c = i10;
        this.d = i11;
    }

    @Override
    public final Object get(int i10) {
        w7.j9.a(i10, this.d);
        return this.f53850e.get(i10 + this.f53849c);
    }

    @Override
    public final int n() {
        return this.f53850e.o() + this.f53849c + this.d;
    }

    @Override
    public final int o() {
        return this.f53850e.o() + this.f53849c;
    }

    @Override
    public final Object[] p() {
        return this.f53850e.p();
    }

    @Override
    public final i subList(int i10, int i11) {
        w7.j9.b(i10, i11, this.d);
        int i12 = this.f53849c;
        return this.f53850e.subList(i10 + i12, i11 + i12);
    }

    @Override
    public final int size() {
        return this.d;
    }
}
