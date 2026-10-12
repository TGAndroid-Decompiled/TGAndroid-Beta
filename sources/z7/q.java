package z7;
public final class q extends i {
    public final transient Object[] f54234c;
    public final transient int d;
    public final transient int f54235e = 1;

    public q(int i10, Object[] objArr) {
        this.f54234c = objArr;
        this.d = i10;
    }

    @Override
    public final Object get(int i10) {
        w7.j9.a(i10, this.f54235e);
        Object obj = this.f54234c[i10 + i10 + this.d];
        obj.getClass();
        return obj;
    }

    @Override
    public final int size() {
        return this.f54235e;
    }
}
