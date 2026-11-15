package y7;

import c8.yd;
public final class c extends k9 {
    public final transient Object[] f60210c;
    public final transient int d;
    public final transient int f60211e = 1;

    public c(int i7, Object[] objArr) {
        this.f60210c = objArr;
        this.d = i7;
    }

    @Override
    public final Object get(int i7) {
        yd.a(i7, this.f60211e);
        Object obj = this.f60210c[i7 + i7 + this.d];
        obj.getClass();
        return obj;
    }

    @Override
    public final int size() {
        return this.f60211e;
    }
}
