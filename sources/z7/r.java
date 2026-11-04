package z7;
public final class r extends n {
    public static final r f60018e = new r(0, new Object[0]);
    public final transient Object[] f60019c;
    public final transient int d;

    public r(int i3, Object[] objArr) {
        this.f60019c = objArr;
        this.d = i3;
    }

    @Override
    public final Object get(int i3) {
        x7.x6.a(i3, this.d);
        Object obj = this.f60019c[i3];
        obj.getClass();
        return obj;
    }

    @Override
    public final int h(Object[] objArr) {
        Object[] objArr2 = this.f60019c;
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
    public final Object[] k() {
        return this.f60019c;
    }

    @Override
    public final int size() {
        return this.d;
    }
}
