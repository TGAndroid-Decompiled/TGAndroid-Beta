package y7;

import c8.fe;
public final class c extends k9 {
    public final transient Object[] f60775c;
    public final transient int d;
    public final transient int f60776e = 1;

    public c(int i7, Object[] objArr) {
        this.f60775c = objArr;
        this.d = i7;
    }

    @Override
    public final Object get(int i7) {
        fe.a(i7, this.f60776e);
        Object obj = this.f60775c[i7 + i7 + this.d];
        obj.getClass();
        return obj;
    }

    @Override
    public final int size() {
        return this.f60776e;
    }
}
