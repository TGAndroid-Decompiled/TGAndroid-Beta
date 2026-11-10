package u7;

import c8.qc;
public final class s extends r {
    public static final s f56399e = new s(0, new Object[0]);
    public final transient Object[] f56400c;
    public final transient int d;

    public s(int i7, Object[] objArr) {
        this.f56400c = objArr;
        this.d = i7;
    }

    @Override
    public final int f(Object[] objArr) {
        Object[] objArr2 = this.f56400c;
        int i7 = this.d;
        System.arraycopy(objArr2, 0, objArr, 0, i7);
        return i7;
    }

    @Override
    public final Object get(int i7) {
        qc.a(i7, this.d);
        Object obj = this.f56400c[i7];
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
    public final boolean k() {
        return false;
    }

    @Override
    public final Object[] l() {
        return this.f56400c;
    }

    @Override
    public final int size() {
        return this.d;
    }
}
