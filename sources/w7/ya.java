package w7;
public final class ya extends sa {
    public final transient Object[] f48365c;
    public final transient int d;
    public final transient int f48366e = 1;

    public ya(int i10, Object[] objArr) {
        this.f48365c = objArr;
        this.d = i10;
    }

    @Override
    public final Object get(int i10) {
        a8.a(i10, this.f48366e);
        Object obj = this.f48365c[i10 + i10 + this.d];
        obj.getClass();
        return obj;
    }

    @Override
    public final int size() {
        return this.f48366e;
    }
}
