package u7;

import c8.pc;
public final class s extends r {
    public static final s f56299e = new s(0, new Object[0]);
    public final transient Object[] f56300c;
    public final transient int d;

    public s(int i7, Object[] objArr) {
        this.f56300c = objArr;
        this.d = i7;
    }

    @Override
    public final int f(Object[] objArr) {
        Object[] objArr2 = this.f56300c;
        int i7 = this.d;
        System.arraycopy(objArr2, 0, objArr, 0, i7);
        return i7;
    }

    @Override
    public final Object get(int i7) {
        pc.a(i7, this.d);
        Object obj = this.f56300c[i7];
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
        return this.f56300c;
    }

    @Override
    public final int size() {
        return this.d;
    }
}
