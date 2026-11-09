package q7;

import java.util.Iterator;
public final class y extends o {
    public static final Object[] f54049r;
    public static final y f54050s;
    public final transient Object[] d;
    public final transient int f54051e;
    public final transient Object[] f54052f;
    public final transient int h;
    public final transient int f54053n;

    static {
        Object[] objArr = new Object[0];
        f54049r = objArr;
        f54050s = new y(0, 0, 0, objArr, objArr);
    }

    public y(int i7, int i10, int i11, Object[] objArr, Object[] objArr2) {
        this.d = objArr;
        this.f54051e = i7;
        this.f54052f = objArr2;
        this.h = i10;
        this.f54053n = i11;
    }

    @Override
    public final boolean contains(Object obj) {
        if (obj != null) {
            Object[] objArr = this.f54052f;
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
        int i7 = this.f54053n;
        System.arraycopy(objArr2, 0, objArr, 0, i7);
        return i7;
    }

    @Override
    public final int hashCode() {
        return this.f54051e;
    }

    @Override
    public final int i() {
        return this.f54053n;
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
        return m.o(this.f54053n, this.d);
    }

    @Override
    public final int size() {
        return this.f54053n;
    }
}
