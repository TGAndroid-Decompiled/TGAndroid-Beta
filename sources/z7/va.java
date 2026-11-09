package z7;

import c8.ie;
public final class va extends ta {
    public static final va f59978e = new va(0, new Object[0]);
    public final transient Object[] f59979c;
    public final transient int d;

    public va(int i7, Object[] objArr) {
        this.f59979c = objArr;
        this.d = i7;
    }

    @Override
    public final int f(Object[] objArr) {
        Object[] objArr2 = this.f59979c;
        int i7 = this.d;
        System.arraycopy(objArr2, 0, objArr, 0, i7);
        return i7;
    }

    @Override
    public final Object get(int i7) {
        ie.a(i7, this.d);
        Object obj = this.f59979c[i7];
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
        return this.f59979c;
    }

    @Override
    public final int size() {
        return this.d;
    }
}
