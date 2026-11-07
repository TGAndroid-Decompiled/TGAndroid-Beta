package y7;

import c8.yd;
public final class n9 extends l9 {
    public static final n9 f59026e = new n9(0, new Object[0]);
    public final transient Object[] f59027c;
    public final transient int d;

    public n9(int i7, Object[] objArr) {
        this.f59027c = objArr;
        this.d = i7;
    }

    @Override
    public final int f(Object[] objArr) {
        Object[] objArr2 = this.f59027c;
        int i7 = this.d;
        System.arraycopy(objArr2, 0, objArr, 0, i7);
        return i7;
    }

    @Override
    public final Object get(int i7) {
        yd.a(i7, this.d);
        Object obj = this.f59027c[i7];
        obj.getClass();
        return obj;
    }

    @Override
    public final int i() {
        return this.d;
    }

    @Override
    public final int j() {
        return 0;
    }

    @Override
    public final Object[] k() {
        return this.f59027c;
    }

    @Override
    public final int size() {
        return this.d;
    }
}
