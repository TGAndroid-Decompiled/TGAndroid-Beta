package r7;

import w7.b7;
public final class u extends t {
    public static final u e = new u(0, new Object[0]);
    public final transient Object[] f41310c;
    public final transient int d;

    public u(int i10, Object[] objArr) {
        this.f41310c = objArr;
        this.d = i10;
    }

    @Override
    public final Object get(int i10) {
        b7.a(i10, this.d);
        Object obj = this.f41310c[i10];
        obj.getClass();
        return obj;
    }

    @Override
    public final int i(Object[] objArr) {
        Object[] objArr2 = this.f41310c;
        int i10 = this.d;
        System.arraycopy(objArr2, 0, objArr, 0, i10);
        return i10;
    }

    @Override
    public final int n() {
        return this.d;
    }

    @Override
    public final int o() {
        return 0;
    }

    @Override
    public final boolean p() {
        return false;
    }

    @Override
    public final Object[] q() {
        return this.f41310c;
    }

    @Override
    public final int size() {
        return this.d;
    }
}
