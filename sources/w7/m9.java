package w7;
public final class m9 extends k9 {
    public static final m9 e = new m9(0, new Object[0]);
    public final transient Object[] f50928c;
    public final transient int d;

    public m9(int i10, Object[] objArr) {
        this.f50928c = objArr;
        this.d = i10;
    }

    @Override
    public final Object get(int i10) {
        y.a(i10, this.d);
        Object obj = this.f50928c[i10];
        obj.getClass();
        return obj;
    }

    @Override
    public final int h(Object[] objArr) {
        Object[] objArr2 = this.f50928c;
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
    public final Object[] o() {
        return this.f50928c;
    }

    @Override
    public final int size() {
        return this.d;
    }
}
