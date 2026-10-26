package w7;
public final class c extends k9 {
    public final transient Object[] f50822c;
    public final transient int d;
    public final transient int e = 1;

    public c(int i10, Object[] objArr) {
        this.f50822c = objArr;
        this.d = i10;
    }

    @Override
    public final Object get(int i10) {
        y.a(i10, this.e);
        Object obj = this.f50822c[i10 + i10 + this.d];
        obj.getClass();
        return obj;
    }

    @Override
    public final int size() {
        return this.e;
    }
}
