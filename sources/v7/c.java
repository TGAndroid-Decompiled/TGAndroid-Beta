package v7;
public final class c extends h9 {
    public final transient Object[] f47428c;
    public final transient int d;
    public final transient int f47429e = 1;

    public c(int i10, Object[] objArr) {
        this.f47428c = objArr;
        this.d = i10;
    }

    @Override
    public final Object get(int i10) {
        w7.w7.a(i10, this.f47429e);
        Object obj = this.f47428c[i10 + i10 + this.d];
        obj.getClass();
        return obj;
    }

    @Override
    public final int size() {
        return this.f47429e;
    }
}
