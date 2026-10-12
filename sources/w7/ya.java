package w7;
public final class ya extends sa {
    public final transient Object[] f50416c;
    public final transient int d;
    public final transient int f50417e = 1;

    public ya(int i10, Object[] objArr) {
        this.f50416c = objArr;
        this.d = i10;
    }

    @Override
    public final Object get(int i10) {
        b8.a(i10, this.f50417e);
        Object obj = this.f50416c[i10 + i10 + this.d];
        obj.getClass();
        return obj;
    }

    @Override
    public final int size() {
        return this.f50417e;
    }
}
