package y7;
public final class va extends ta {
    public static final va f59293e = new va(0, new Object[0]);
    public final transient Object[] f59294c;
    public final transient int d;

    public va(int i3, Object[] objArr) {
        this.f59294c = objArr;
        this.d = i3;
    }

    @Override
    public final Object get(int i3) {
        x7.h6.a(i3, this.d);
        Object obj = this.f59294c[i3];
        obj.getClass();
        return obj;
    }

    @Override
    public final int h(Object[] objArr) {
        Object[] objArr2 = this.f59294c;
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
        return this.f59294c;
    }

    @Override
    public final int size() {
        return this.d;
    }
}
