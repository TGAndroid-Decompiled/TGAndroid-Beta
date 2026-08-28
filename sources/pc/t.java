package pc;

import j3.r0;
import java.util.Arrays;
import java.util.Iterator;
import java.util.RandomAccess;
public final class t extends c implements RandomAccess {
    public final Object[] f45547a;
    public final int f45548b;
    public int f45549c;
    public int d;

    public t(int i9, Object[] objArr) {
        this.f45547a = objArr;
        if (i9 >= 0) {
            if (i9 <= objArr.length) {
                this.f45548b = objArr.length;
                this.d = i9;
                return;
            }
            StringBuilder p6 = r0.p(i9, "ring buffer filled size: ", " cannot be larger than the buffer size: ");
            p6.append(objArr.length);
            throw new IllegalArgumentException(p6.toString().toString());
        }
        throw new IllegalArgumentException(r0.l(i9, "ring buffer filled size should not be negative but it is ").toString());
    }

    @Override
    public final Object get(int i9) {
        int i10 = i();
        if (i9 >= 0 && i9 < i10) {
            return this.f45547a[(this.f45549c + i9) % this.f45548b];
        }
        throw new IndexOutOfBoundsException(aa.d.k(i9, i10, "index: ", ", size: "));
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
            int i9 = this.f45549c;
            int i10 = this.f45548b;
            int i11 = (i9 + 20) % i10;
            Object[] objArr = this.f45547a;
            if (i9 > i11) {
                f.e(i9, i10, objArr);
                f.e(0, i11, objArr);
            } else {
                f.e(i9, i11, objArr);
            }
            this.f45549c = i11;
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
        kotlin.jvm.internal.i.e(array, "array");
        int length = array.length;
        int i9 = this.d;
        if (length < i9) {
            array = Arrays.copyOf(array, i9);
            kotlin.jvm.internal.i.d(array, "copyOf(...)");
        }
        int i10 = this.d;
        int i11 = this.f45549c;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            objArr = this.f45547a;
            if (i13 >= i10 || i11 >= this.f45548b) {
                break;
            }
            array[i13] = objArr[i11];
            i13++;
            i11++;
        }
        while (i13 < i10) {
            array[i13] = objArr[i12];
            i13++;
            i12++;
        }
        if (i10 < array.length) {
            array[i10] = null;
        }
        return array;
    }
}
