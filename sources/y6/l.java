package y6;

public final class l extends m {

    public final transient int f49751c;
    public final transient int d;

    public final m f49752e;

    public l(m mVar, int i10, int i11) {
        this.f49752e = mVar;
        this.f49751c = i10;
        this.d = i11;
    }

    @Override
    public final Object get(int i10) {
        a.e(i10, this.d);
        return this.f49752e.get(i10 + this.f49751c);
    }

    @Override
    public final int n() {
        return this.f49752e.o() + this.f49751c + this.d;
    }

    @Override
    public final int o() {
        return this.f49752e.o() + this.f49751c;
    }

    @Override
    public final Object[] q() {
        return this.f49752e.q();
    }

    @Override
    public final m subList(int i10, int i11) {
        a.m(i10, i11, this.d);
        int i12 = this.f49751c;
        return this.f49752e.subList(i10 + i12, i11 + i12);
    }

    @Override
    public final int size() {
        return this.d;
    }
}
