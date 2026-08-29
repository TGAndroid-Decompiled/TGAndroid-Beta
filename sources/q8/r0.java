package q8;
public final class r0 extends c0 {
    public static final Object[] f46487r;
    public static final r0 f46488s;
    public final transient Object[] d;
    public final transient int f46489e;
    public final transient Object[] f46490f;
    public final transient int h;
    public final transient int f46491n;

    static {
        Object[] objArr = new Object[0];
        f46487r = objArr;
        f46488s = new r0(0, 0, 0, objArr, objArr);
    }

    public r0(int i10, int i11, int i12, Object[] objArr, Object[] objArr2) {
        this.d = objArr;
        this.f46489e = i10;
        this.f46490f = objArr2;
        this.h = i11;
        this.f46491n = i12;
    }

    @Override
    public final boolean contains(Object obj) {
        if (obj != null) {
            Object[] objArr = this.f46490f;
            if (objArr.length != 0) {
                int p10 = l.p(obj);
                while (true) {
                    int i10 = p10 & this.h;
                    Object obj2 = objArr[i10];
                    if (obj2 == null) {
                        return false;
                    }
                    if (obj2.equals(obj)) {
                        return true;
                    }
                    p10 = i10 + 1;
                }
            }
        }
        return false;
    }

    @Override
    public final int hashCode() {
        return this.f46489e;
    }

    @Override
    public final int n(int i10, Object[] objArr) {
        Object[] objArr2 = this.d;
        int i11 = this.f46491n;
        System.arraycopy(objArr2, 0, objArr, i10, i11);
        return i10 + i11;
    }

    @Override
    public final Object[] o() {
        return this.d;
    }

    @Override
    public final int p() {
        return this.f46491n;
    }

    @Override
    public final int q() {
        return 0;
    }

    @Override
    public final boolean r() {
        return false;
    }

    @Override
    public final int size() {
        return this.f46491n;
    }

    @Override
    public final z v() {
        return z.s(this.f46491n, this.d);
    }

    @Override
    public final x0 w() {
        return i().listIterator(0);
    }
}
