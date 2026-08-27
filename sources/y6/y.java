package y6;

import java.util.Iterator;

public final class y extends o {

    public static final Object[] f49789r;

    public static final y f49790s;
    public final transient Object[] d;

    public final transient int f49791e;

    public final transient Object[] f49792f;
    public final transient int h;

    public final transient int f49793n;

    static {
        Object[] objArr = new Object[0];
        f49789r = objArr;
        f49790s = new y(0, 0, 0, objArr, objArr);
    }

    public y(int i10, int i11, int i12, Object[] objArr, Object[] objArr2) {
        this.d = objArr;
        this.f49791e = i10;
        this.f49792f = objArr2;
        this.h = i11;
        this.f49793n = i12;
    }

    @Override
    public final boolean contains(Object obj) {
        if (obj == null) {
            return false;
        }
        Object[] objArr = this.f49792f;
        if (objArr.length == 0) {
            return false;
        }
        int iRotateLeft = (int) (((long) Integer.rotateLeft((int) (((long) obj.hashCode()) * (-862048943)), 15)) * 461845907);
        while (true) {
            int i10 = this.h & iRotateLeft;
            Object obj2 = objArr[i10];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            iRotateLeft = i10 + 1;
        }
    }

    @Override
    public final int hashCode() {
        return this.f49791e;
    }

    @Override
    public final int i(Object[] objArr) {
        Object[] objArr2 = this.d;
        int i10 = this.f49793n;
        System.arraycopy(objArr2, 0, objArr, 0, i10);
        return i10;
    }

    @Override
    public final Iterator iterator() {
        return t().listIterator(0);
    }

    @Override
    public final int n() {
        return this.f49793n;
    }

    @Override
    public final int o() {
        return 0;
    }

    @Override
    public final d0 p() {
        return t().listIterator(0);
    }

    @Override
    public final Object[] q() {
        return this.d;
    }

    @Override
    public final int size() {
        return this.f49793n;
    }

    @Override
    public final m u() {
        return m.t(this.f49793n, this.d);
    }
}
