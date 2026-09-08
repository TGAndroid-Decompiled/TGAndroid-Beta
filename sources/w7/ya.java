package w7;
public final class ya extends sa {
    public final transient Object[] f48364c;
    public final transient int d;
    public final transient int f48365e = 1;

    public ya(int i10, Object[] objArr) {
        this.f48364c = objArr;
        this.d = i10;
    }

    @Override
    public final Object get(int i10) {
        a8.a(i10, this.f48365e);
        Object obj = this.f48364c[i10 + i10 + this.d];
        obj.getClass();
        return obj;
    }

    @Override
    public final int size() {
        return this.f48365e;
    }
}
