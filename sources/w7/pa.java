package w7;
public final class pa extends qa {
    public final transient int f52693c;
    public final transient int d;
    public final qa e;

    public pa(qa qaVar, int i10, int i11) {
        this.e = qaVar;
        this.f52693c = i10;
        this.d = i11;
    }

    @Override
    public final Object get(int i10) {
        n8.a(i10, this.d);
        return this.e.get(i10 + this.f52693c);
    }

    @Override
    public final int m() {
        return this.e.n() + this.f52693c + this.d;
    }

    @Override
    public final int n() {
        return this.e.n() + this.f52693c;
    }

    @Override
    public final Object[] o() {
        return this.e.o();
    }

    @Override
    public final qa subList(int i10, int i11) {
        n8.b(i10, i11, this.d);
        int i12 = this.f52693c;
        return this.e.subList(i10 + i12, i11 + i12);
    }

    @Override
    public final int size() {
        return this.d;
    }
}
