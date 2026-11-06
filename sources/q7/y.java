package q7;

import java.util.Iterator;
public final class y extends o {
    public static final Object[] f53943r;
    public static final y f53944s;
    public final transient Object[] d;
    public final transient int f53945e;
    public final transient Object[] f53946f;
    public final transient int h;
    public final transient int f53947n;

    static {
        Object[] objArr = new Object[0];
        f53943r = objArr;
        f53944s = new y(0, 0, 0, objArr, objArr);
    }

    public y(int i7, int i10, int i11, Object[] objArr, Object[] objArr2) {
        this.d = objArr;
        this.f53945e = i7;
        this.f53946f = objArr2;
        this.h = i10;
        this.f53947n = i11;
    }

    @Override
    public final boolean contains(Object obj) {
        if (obj != null) {
            Object[] objArr = this.f53946f;
            if (objArr.length != 0) {
                int rotateLeft = (int) (Integer.rotateLeft((int) (obj.hashCode() * (-862048943)), 15) * 461845907);
                while (true) {
                    int i7 = rotateLeft & this.h;
                    Object obj2 = objArr[i7];
                    if (obj2 != null) {
                        if (obj2.equals(obj)) {
                            return true;
                        }
                        rotateLeft = i7 + 1;
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
    public final int f(Object[] objArr) {
        Object[] objArr2 = this.d;
        int i7 = this.f53947n;
        System.arraycopy(objArr2, 0, objArr, 0, i7);
        return i7;
    }

    @Override
    public final int hashCode() {
        return this.f53945e;
    }

    @Override
    public final int i() {
        return this.f53947n;
    }

    @Override
    public final Iterator iterator() {
        return o().listIterator(0);
    }

    @Override
    public final int j() {
        return 0;
    }

    @Override
    public final d0 k() {
        return o().listIterator(0);
    }

    @Override
    public final Object[] l() {
        return this.d;
    }

    @Override
    public final m p() {
        return m.o(this.f53947n, this.d);
    }

    @Override
    public final int size() {
        return this.f53947n;
    }
}
