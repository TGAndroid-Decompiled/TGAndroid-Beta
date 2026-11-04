package x7;
public final class k9 extends i9 {
    public static final k9 f58354e = new k9(0, new Object[0]);
    public final transient Object[] f58355c;
    public final transient int d;

    public k9(int i3, Object[] objArr) {
        this.f58355c = objArr;
        this.d = i3;
    }

    @Override
    public final Object get(int i3) {
        w5.a(i3, this.d);
        Object obj = this.f58355c[i3];
        obj.getClass();
        return obj;
    }

    @Override
    public final int h(Object[] objArr) {
        Object[] objArr2 = this.f58355c;
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
        return this.f58355c;
    }

    @Override
    public final int size() {
        return this.d;
    }
}
