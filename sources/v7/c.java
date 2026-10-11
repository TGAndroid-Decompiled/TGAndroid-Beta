package v7;
public final class c extends h9 {
    public final transient Object[] f49260c;
    public final transient int d;
    public final transient int f49261e = 1;

    public c(int i10, Object[] objArr) {
        this.f49260c = objArr;
        this.d = i10;
    }

    @Override
    public final Object get(int i10) {
        w7.x7.a(i10, this.f49261e);
        Object obj = this.f49260c[i10 + i10 + this.d];
        obj.getClass();
        return obj;
    }

    @Override
    public final int size() {
        return this.f49261e;
    }
}
