package y7;

import c8.ge;
public final class m9 extends k9 {
    public static final m9 f60908e = new m9(0, new Object[0]);
    public final transient Object[] f60909c;
    public final transient int d;

    public m9(int i7, Object[] objArr) {
        this.f60909c = objArr;
        this.d = i7;
    }

    @Override
    public final int f(Object[] objArr) {
        Object[] objArr2 = this.f60909c;
        int i7 = this.d;
        System.arraycopy(objArr2, 0, objArr, 0, i7);
        return i7;
    }

    @Override
    public final Object get(int i7) {
        ge.a(i7, this.d);
        Object obj = this.f60909c[i7];
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
        return this.f60909c;
    }

    @Override
    public final int size() {
        return this.d;
    }
}
