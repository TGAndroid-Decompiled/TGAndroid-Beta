package v7;
public final class c extends g9 {
    public final transient Object[] f50410c;
    public final transient int d;
    public final transient int e = 1;

    public c(int i10, Object[] objArr) {
        this.f50410c = objArr;
        this.d = i10;
    }

    @Override
    public final Object get(int i10) {
        w7.h8.a(i10, this.e);
        Object obj = this.f50410c[i10 + i10 + this.d];
        obj.getClass();
        return obj;
    }

    @Override
    public final int size() {
        return this.e;
    }
}
