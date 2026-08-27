package p8;

public final class r0 extends c0 {

    public static final Object[] f45580r;

    public static final r0 f45581s;
    public final transient Object[] d;

    public final transient int f45582e;

    public final transient Object[] f45583f;
    public final transient int h;

    public final transient int f45584n;

    static {
        Object[] objArr = new Object[0];
        f45580r = objArr;
        f45581s = new r0(0, 0, 0, objArr, objArr);
    }

    public r0(int i10, int i11, int i12, Object[] objArr, Object[] objArr2) {
        this.d = objArr;
        this.f45582e = i10;
        this.f45583f = objArr2;
        this.h = i11;
        this.f45584n = i12;
    }

    @Override
    public final boolean contains(Object obj) {
        if (obj != null) {
            Object[] objArr = this.f45583f;
            if (objArr.length != 0) {
                int iP = l.p(obj);
                while (true) {
                    int i10 = iP & this.h;
                    Object obj2 = objArr[i10];
                    if (obj2 == null) {
                        return false;
                    }
                    if (obj2.equals(obj)) {
                        return true;
                    }
                    iP = i10 + 1;
                }
            }
        }
        return false;
    }

    @Override
    public final int hashCode() {
        return this.f45582e;
    }

    @Override
    public final int n(int i10, Object[] objArr) {
        Object[] objArr2 = this.d;
        int i11 = this.f45584n;
        System.arraycopy(objArr2, 0, objArr, i10, i11);
        return i10 + i11;
    }

    @Override
    public final Object[] o() {
        return this.d;
    }

    @Override
    public final int p() {
        return this.f45584n;
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
        return this.f45584n;
    }

    @Override
    public final z v() {
        return z.s(this.f45584n, this.d);
    }

    @Override
    public final x0 iterator() {
        return i().listIterator(0);
    }
}
