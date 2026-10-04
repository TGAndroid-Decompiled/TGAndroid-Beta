package w7;
public final class ua extends sa {
    public static final ua f48857e = new ua(0, new Object[0]);
    public final transient Object[] f48858c;
    public final transient int d;

    public ua(int i10, Object[] objArr) {
        this.f48858c = objArr;
        this.d = i10;
    }

    @Override
    public final Object get(int i10) {
        c8.a(i10, this.d);
        Object obj = this.f48858c[i10];
        obj.getClass();
        return obj;
    }

    @Override
    public final int i(Object[] objArr) {
        Object[] objArr2 = this.f48858c;
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
        return this.f48858c;
    }

    @Override
    public final int size() {
        return this.d;
    }
}
