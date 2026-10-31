package w7;
public final class sa extends qa {
    public static final sa e = new sa(0, new Object[0]);
    public final transient Object[] f52696c;
    public final transient int d;

    public sa(int i10, Object[] objArr) {
        this.f52696c = objArr;
        this.d = i10;
    }

    @Override
    public final Object get(int i10) {
        n8.a(i10, this.d);
        Object obj = this.f52696c[i10];
        obj.getClass();
        return obj;
    }

    @Override
    public final int l(Object[] objArr) {
        Object[] objArr2 = this.f52696c;
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
        return this.f52696c;
    }

    @Override
    public final int size() {
        return this.d;
    }
}
