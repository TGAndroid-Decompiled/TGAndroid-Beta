package w7;
public final class ua extends sa {
    public static final ua f48302e = new ua(0, new Object[0]);
    public final transient Object[] f48303c;
    public final transient int d;

    public ua(int i10, Object[] objArr) {
        this.f48303c = objArr;
        this.d = i10;
    }

    @Override
    public final Object get(int i10) {
        a8.a(i10, this.d);
        Object obj = this.f48303c[i10];
        obj.getClass();
        return obj;
    }

    @Override
    public final int i(Object[] objArr) {
        Object[] objArr2 = this.f48303c;
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
    public final Object[] p() {
        return this.f48303c;
    }

    @Override
    public final int size() {
        return this.d;
    }
}
