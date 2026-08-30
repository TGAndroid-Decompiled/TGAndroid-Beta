package tc;

import java.util.Arrays;
import java.util.Iterator;
import java.util.RandomAccess;
import kh.a2;
public final class t extends c implements RandomAccess {
    public final Object[] f44656a;
    public final int f44657b;
    public int f44658c;
    public int d;

    public t(int i10, Object[] objArr) {
        this.f44656a = objArr;
        if (i10 >= 0) {
            if (i10 <= objArr.length) {
                this.f44657b = objArr.length;
                this.d = i10;
                return;
            }
            StringBuilder m9 = a2.m(i10, "ring buffer filled size: ", " cannot be larger than the buffer size: ");
            m9.append(objArr.length);
            throw new IllegalArgumentException(m9.toString().toString());
        }
        throw new IllegalArgumentException(a2.j(i10, "ring buffer filled size should not be negative but it is ").toString());
    }

    @Override
    public final Object get(int i10) {
        int i11 = i();
        if (i10 >= 0 && i10 < i11) {
            return this.f44656a[(this.f44658c + i10) % this.f44657b];
        }
        throw new IndexOutOfBoundsException(android.support.v4.media.a.k(i10, i11, "index: ", ", size: "));
    }

    @Override
    public final int i() {
        return this.d;
    }

    @Override
    public final Iterator iterator() {
        return new s(this);
    }

    public final void n() {
        if (20 <= this.d) {
            int i10 = this.f44658c;
            int i11 = this.f44657b;
            int i12 = (i10 + 20) % i11;
            Object[] objArr = this.f44656a;
            if (i10 > i12) {
                f.e(i10, i11, objArr);
                f.e(0, i12, objArr);
            } else {
                f.e(i10, i12, objArr);
            }
            this.f44658c = i12;
            this.d -= 20;
            return;
        }
        throw new IllegalArgumentException(("n shouldn't be greater than the buffer size: n = 20, size = " + this.d).toString());
    }

    @Override
    public final Object[] toArray() {
        return toArray(new Object[i()]);
    }

    @Override
    public final Object[] toArray(Object[] array) {
        Object[] objArr;
        kotlin.jvm.internal.j.e(array, "array");
        int length = array.length;
        int i10 = this.d;
        if (length < i10) {
            array = Arrays.copyOf(array, i10);
            kotlin.jvm.internal.j.d(array, "copyOf(...)");
        }
        int i11 = this.d;
        int i12 = this.f44658c;
        int i13 = 0;
        int i14 = 0;
        while (true) {
            objArr = this.f44656a;
            if (i14 >= i11 || i12 >= this.f44657b) {
                break;
            }
            array[i14] = objArr[i12];
            i14++;
            i12++;
        }
        while (i14 < i11) {
            array[i14] = objArr[i13];
            i14++;
            i13++;
        }
        if (i11 < array.length) {
            array[i11] = null;
        }
        return array;
    }
}
