package x6;

import java.util.Iterator;
public final class y extends o {
    public static final Object[] f49072r;
    public static final y f49073s;
    public final transient Object[] d;
    public final transient int f49074e;
    public final transient Object[] f49075f;
    public final transient int h;
    public final transient int f49076n;

    static {
        Object[] objArr = new Object[0];
        f49072r = objArr;
        f49073s = new y(0, 0, 0, objArr, objArr);
    }

    public y(int i9, int i10, int i11, Object[] objArr, Object[] objArr2) {
        this.d = objArr;
        this.f49074e = i9;
        this.f49075f = objArr2;
        this.h = i10;
        this.f49076n = i11;
    }

    @Override
    public final boolean contains(Object obj) {
        if (obj != null) {
            Object[] objArr = this.f49075f;
            if (objArr.length != 0) {
                int rotateLeft = (int) (Integer.rotateLeft((int) (obj.hashCode() * (-862048943)), 15) * 461845907);
                while (true) {
                    int i9 = this.h & rotateLeft;
                    Object obj2 = objArr[i9];
                    if (obj2 != null) {
                        if (obj2.equals(obj)) {
                            return true;
                        }
                        rotateLeft = i9 + 1;
                    } else {
                        return false;
                    }
                }
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    @Override
    public final int hashCode() {
        return this.f49074e;
    }

    @Override
    public final int i(Object[] objArr) {
        Object[] objArr2 = this.d;
        int i9 = this.f49076n;
        System.arraycopy(objArr2, 0, objArr, 0, i9);
        return i9;
    }

    @Override
    public final Iterator iterator() {
        return t().listIterator(0);
    }

    @Override
    public final int n() {
        return this.f49076n;
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
        return this.f49076n;
    }

    @Override
    public final m u() {
        return m.t(this.f49076n, this.d);
    }
}
