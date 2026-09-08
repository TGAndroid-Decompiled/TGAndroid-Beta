package v7;
public final class c extends h9 {
    public final transient Object[] f47427c;
    public final transient int d;
    public final transient int f47428e = 1;

    public c(int i10, Object[] objArr) {
        this.f47427c = objArr;
        this.d = i10;
    }

    @Override
    public final Object get(int i10) {
        w7.w7.a(i10, this.f47428e);
        Object obj = this.f47427c[i10 + i10 + this.d];
        obj.getClass();
        return obj;
    }

    @Override
    public final int size() {
        return this.f47428e;
    }
}
