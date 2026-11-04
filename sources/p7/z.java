package p7;

import java.util.Iterator;
public final class z extends p {
    public static final Object[] f53419r;
    public static final z f53420s;
    public final transient Object[] d;
    public final transient int f53421e;
    public final transient Object[] f53422f;
    public final transient int h;
    public final transient int f53423n;

    static {
        Object[] objArr = new Object[0];
        f53419r = objArr;
        f53420s = new z(0, 0, 0, objArr, objArr);
    }

    public z(int i3, int i10, int i11, Object[] objArr, Object[] objArr2) {
        this.d = objArr;
        this.f53421e = i3;
        this.f53422f = objArr2;
        this.h = i10;
        this.f53423n = i11;
    }

    @Override
    public final boolean contains(Object obj) {
        if (obj != null) {
            Object[] objArr = this.f53422f;
            if (objArr.length != 0) {
                int rotateLeft = (int) (Integer.rotateLeft((int) (obj.hashCode() * (-862048943)), 15) * 461845907);
                while (true) {
                    int i3 = rotateLeft & this.h;
                    Object obj2 = objArr[i3];
                    if (obj2 != null) {
                        if (obj2.equals(obj)) {
                            return true;
                        }
                        rotateLeft = i3 + 1;
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
    public final int h(Object[] objArr) {
        Object[] objArr2 = this.d;
        int i3 = this.f53423n;
        System.arraycopy(objArr2, 0, objArr, 0, i3);
        return i3;
    }

    @Override
    public final int hashCode() {
        return this.f53421e;
    }

    @Override
    public final int i() {
        return this.f53423n;
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
    public final e0 k() {
        return o().listIterator(0);
    }

    @Override
    public final Object[] l() {
        return this.d;
    }

    @Override
    public final n p() {
        return n.o(this.f53423n, this.d);
    }

    @Override
    public final int size() {
        return this.f53423n;
    }
}
