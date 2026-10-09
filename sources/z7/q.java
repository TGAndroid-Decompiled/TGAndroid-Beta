package z7;
public final class q extends i {
    public final transient Object[] f54004c;
    public final transient int d;
    public final transient int f54005e = 1;

    public q(int i10, Object[] objArr) {
        this.f54004c = objArr;
        this.d = i10;
    }

    @Override
    public final Object get(int i10) {
        w7.j9.a(i10, this.f54005e);
        Object obj = this.f54004c[i10 + i10 + this.d];
        obj.getClass();
        return obj;
    }

    @Override
    public final int size() {
        return this.f54005e;
    }
}
