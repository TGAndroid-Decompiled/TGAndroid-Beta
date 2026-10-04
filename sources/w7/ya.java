package w7;
public final class ya extends sa {
    public final transient Object[] f48883c;
    public final transient int d;
    public final transient int f48884e = 1;

    public ya(int i10, Object[] objArr) {
        this.f48883c = objArr;
        this.d = i10;
    }

    @Override
    public final Object get(int i10) {
        c8.a(i10, this.f48884e);
        Object obj = this.f48883c[i10 + i10 + this.d];
        obj.getClass();
        return obj;
    }

    @Override
    public final int size() {
        return this.f48884e;
    }
}
