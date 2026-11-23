package y7;

import c8.fe;
public final class c extends k9 {
    public final transient Object[] f60821c;
    public final transient int d;
    public final transient int f60822e = 1;

    public c(int i7, Object[] objArr) {
        this.f60821c = objArr;
        this.d = i7;
    }

    @Override
    public final Object get(int i7) {
        fe.a(i7, this.f60822e);
        Object obj = this.f60821c[i7 + i7 + this.d];
        obj.getClass();
        return obj;
    }

    @Override
    public final int size() {
        return this.f60822e;
    }
}
