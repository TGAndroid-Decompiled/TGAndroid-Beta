package y7;

import c8.ge;
public final class n9 extends l9 {
    public static final n9 f61030e = new n9(0, new Object[0]);
    public final transient Object[] f61031c;
    public final transient int d;

    public n9(int i7, Object[] objArr) {
        this.f61031c = objArr;
        this.d = i7;
    }

    @Override
    public final int f(Object[] objArr) {
        Object[] objArr2 = this.f61031c;
        int i7 = this.d;
        System.arraycopy(objArr2, 0, objArr, 0, i7);
        return i7;
    }

    @Override
    public final Object get(int i7) {
        ge.a(i7, this.d);
        Object obj = this.f61031c[i7];
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
        return this.f61031c;
    }

    @Override
    public final int size() {
        return this.d;
    }
}
