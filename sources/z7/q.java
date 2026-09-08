package z7;
public final class q extends i {
    public final transient Object[] f51230c;
    public final transient int d;
    public final transient int f51231e = 1;

    public q(int i10, Object[] objArr) {
        this.f51230c = objArr;
        this.d = i10;
    }

    @Override
    public final Object get(int i10) {
        w7.j9.a(i10, this.f51231e);
        Object obj = this.f51230c[i10 + i10 + this.d];
        obj.getClass();
        return obj;
    }

    @Override
    public final int size() {
        return this.f51231e;
    }
}
