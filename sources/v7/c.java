package v7;
public final class c extends i9 {
    public final transient Object[] f44248c;
    public final transient int d;
    public final transient int e = 1;

    public c(int i10, Object[] objArr) {
        this.f44248c = objArr;
        this.d = i10;
    }

    @Override
    public final Object get(int i10) {
        w7.x7.a(i10, this.e);
        Object obj = this.f44248c[i10 + i10 + this.d];
        obj.getClass();
        return obj;
    }

    @Override
    public final int size() {
        return this.e;
    }
}
