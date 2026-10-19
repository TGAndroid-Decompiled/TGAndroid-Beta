package r7;

import w7.w6;
public final class u extends t {
    public static final u e = new u(0, new Object[0]);
    public final transient Object[] f45060c;
    public final transient int d;

    public u(int i10, Object[] objArr) {
        this.f45060c = objArr;
        this.d = i10;
    }

    @Override
    public final Object get(int i10) {
        w6.a(i10, this.d);
        Object obj = this.f45060c[i10];
        obj.getClass();
        return obj;
    }

    @Override
    public final int h(Object[] objArr) {
        Object[] objArr2 = this.f45060c;
        int i10 = this.d;
        System.arraycopy(objArr2, 0, objArr, 0, i10);
        return i10;
    }

    @Override
    public final int m() {
        return this.d;
    }

    @Override
    public final int n() {
        return 0;
    }

    @Override
    public final boolean o() {
        return false;
    }

    @Override
    public final Object[] p() {
        return this.f45060c;
    }

    @Override
    public final int size() {
        return this.d;
    }
}
