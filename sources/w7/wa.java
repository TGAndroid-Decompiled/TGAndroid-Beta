package w7;
public final class wa extends qa {
    public final transient Object[] f52745c;
    public final transient int d;
    public final transient int e = 1;

    public wa(int i10, Object[] objArr) {
        this.f52745c = objArr;
        this.d = i10;
    }

    @Override
    public final Object get(int i10) {
        n8.a(i10, this.e);
        Object obj = this.f52745c[i10 + i10 + this.d];
        obj.getClass();
        return obj;
    }

    @Override
    public final int size() {
        return this.e;
    }
}
