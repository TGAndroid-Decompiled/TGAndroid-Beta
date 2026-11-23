package y7;

import c8.ge;
public final class c extends l9 {
    public final transient Object[] f60903c;
    public final transient int d;
    public final transient int f60904e = 1;

    public c(int i7, Object[] objArr) {
        this.f60903c = objArr;
        this.d = i7;
    }

    @Override
    public final Object get(int i7) {
        ge.a(i7, this.f60904e);
        Object obj = this.f60903c[i7 + i7 + this.d];
        obj.getClass();
        return obj;
    }

    @Override
    public final int size() {
        return this.f60904e;
    }
}
