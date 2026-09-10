package w7;
public final class ya extends sa {
    public final transient Object[] f43836c;
    public final transient int d;
    public final transient int e = 1;

    public ya(int i10, Object[] objArr) {
        this.f43836c = objArr;
        this.d = i10;
    }

    @Override
    public final Object get(int i10) {
        b8.a(i10, this.e);
        Object obj = this.f43836c[i10 + i10 + this.d];
        obj.getClass();
        return obj;
    }

    @Override
    public final int size() {
        return this.e;
    }
}
