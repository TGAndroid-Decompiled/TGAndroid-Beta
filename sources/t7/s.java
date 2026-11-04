package t7;

import x7.y;
public final class s extends r {
    public static final s f54978e = new s(0, new Object[0]);
    public final transient Object[] f54979c;
    public final transient int d;

    public s(int i3, Object[] objArr) {
        this.f54979c = objArr;
        this.d = i3;
    }

    @Override
    public final Object get(int i3) {
        y.a(i3, this.d);
        Object obj = this.f54979c[i3];
        obj.getClass();
        return obj;
    }

    @Override
    public final int h(Object[] objArr) {
        Object[] objArr2 = this.f54979c;
        int i3 = this.d;
        System.arraycopy(objArr2, 0, objArr, 0, i3);
        return i3;
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
        return this.f54979c;
    }

    @Override
    public final int size() {
        return this.d;
    }
}
