package r8;

import h7.f0;
import h7.u6;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

public final class a extends AbstractList implements RandomAccess, Serializable {

    public final int[] f46874a;

    public final int f46875b;

    public final int f46876c;

    public a(int i10, int i11, int[] iArr) {
        this.f46874a = iArr;
        this.f46875b = i10;
        this.f46876c = i11;
    }

    @Override
    public final boolean contains(Object obj) {
        return (obj instanceof Integer) && u6.c(((Integer) obj).intValue(), this.f46875b, this.f46876c, this.f46874a) != -1;
    }

    @Override
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return super.equals(obj);
        }
        a aVar = (a) obj;
        int size = size();
        if (aVar.size() != size) {
            return false;
        }
        for (int i10 = 0; i10 < size; i10++) {
            if (this.f46874a[this.f46875b + i10] != aVar.f46874a[aVar.f46875b + i10]) {
                return false;
            }
        }
        return true;
    }

    @Override
    public final Object get(int i10) {
        f0.b(i10, size());
        return Integer.valueOf(this.f46874a[this.f46875b + i10]);
    }

    @Override
    public final int hashCode() {
        int i10 = 1;
        for (int i11 = this.f46875b; i11 < this.f46876c; i11++) {
            i10 = (i10 * 31) + this.f46874a[i11];
        }
        return i10;
    }

    @Override
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj).intValue();
        int i10 = this.f46876c;
        int i11 = this.f46875b;
        int iC = u6.c(iIntValue, i11, i10, this.f46874a);
        if (iC >= 0) {
            return iC - i11;
        }
        return -1;
    }

    @Override
    public final boolean isEmpty() {
        return false;
    }

    @Override
    public final int lastIndexOf(Object obj) {
        int i10;
        if (obj instanceof Integer) {
            int iIntValue = ((Integer) obj).intValue();
            int i11 = this.f46876c;
            do {
                i11--;
                i10 = this.f46875b;
                if (i11 < i10) {
                    i11 = -1;
                    break;
                }
            } while (this.f46874a[i11] != iIntValue);
            if (i11 >= 0) {
                return i11 - i10;
            }
        }
        return -1;
    }

    @Override
    public final Object set(int i10, Object obj) {
        Integer num = (Integer) obj;
        f0.b(i10, size());
        int i11 = this.f46875b + i10;
        int[] iArr = this.f46874a;
        int i12 = iArr[i11];
        num.getClass();
        iArr[i11] = num.intValue();
        return Integer.valueOf(i12);
    }

    @Override
    public final int size() {
        return this.f46876c - this.f46875b;
    }

    @Override
    public final List subList(int i10, int i11) {
        f0.d(i10, i11, size());
        if (i10 == i11) {
            return Collections.EMPTY_LIST;
        }
        int i12 = this.f46875b;
        return new a(i10 + i12, i12 + i11, this.f46874a);
    }

    @Override
    public final String toString() {
        StringBuilder sb2 = new StringBuilder(size() * 5);
        sb2.append('[');
        int[] iArr = this.f46874a;
        int i10 = this.f46875b;
        sb2.append(iArr[i10]);
        while (true) {
            i10++;
            if (i10 >= this.f46876c) {
                sb2.append(']');
                return sb2.toString();
            }
            sb2.append(", ");
            sb2.append(iArr[i10]);
        }
    }
}
