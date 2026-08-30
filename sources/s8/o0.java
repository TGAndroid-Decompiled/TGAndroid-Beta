package s8;
public final class o0 extends z {
    public static final Object[] f44138r;
    public static final o0 f44139s;
    public final transient Object[] d;
    public final transient int e;
    public final transient Object[] f44140f;
    public final transient int h;
    public final transient int f44141n;

    static {
        Object[] objArr = new Object[0];
        f44138r = objArr;
        f44139s = new o0(0, 0, 0, objArr, objArr);
    }

    public o0(int i10, int i11, int i12, Object[] objArr, Object[] objArr2) {
        this.d = objArr;
        this.e = i10;
        this.f44140f = objArr2;
        this.h = i11;
        this.f44141n = i12;
    }

    @Override
    public final boolean contains(Object obj) {
        int hashCode;
        if (obj != null) {
            Object[] objArr = this.f44140f;
            if (objArr.length != 0) {
                if (obj == null) {
                    hashCode = 0;
                } else {
                    hashCode = obj.hashCode();
                }
                int m9 = l.m(hashCode);
                while (true) {
                    int i10 = m9 & this.h;
                    Object obj2 = objArr[i10];
                    if (obj2 == null) {
                        return false;
                    }
                    if (obj2.equals(obj)) {
                        return true;
                    }
                    m9 = i10 + 1;
                }
            }
        }
        return false;
    }

    @Override
    public final int hashCode() {
        return this.e;
    }

    @Override
    public final int n(int i10, Object[] objArr) {
        Object[] objArr2 = this.d;
        int i11 = this.f44141n;
        System.arraycopy(objArr2, 0, objArr, i10, i11);
        return i10 + i11;
    }

    @Override
    public final Object[] o() {
        return this.d;
    }

    @Override
    public final int p() {
        return this.f44141n;
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
        return this.f44141n;
    }

    @Override
    public final v v() {
        return v.s(this.f44141n, this.d);
    }

    @Override
    public final u0 w() {
        return i().listIterator(0);
    }
}
