package q8;

import g7.d0;
import g7.r6;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;
public final class a extends AbstractList implements RandomAccess, Serializable {
    public final int[] f46115a;
    public final int f46116b;
    public final int f46117c;

    public a(int i9, int i10, int[] iArr) {
        this.f46115a = iArr;
        this.f46116b = i9;
        this.f46117c = i10;
    }

    @Override
    public final boolean contains(Object obj) {
        if ((obj instanceof Integer) && r6.c(((Integer) obj).intValue(), this.f46116b, this.f46117c, this.f46115a) != -1) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            int size = size();
            if (aVar.size() != size) {
                return false;
            }
            for (int i9 = 0; i9 < size; i9++) {
                if (this.f46115a[this.f46116b + i9] != aVar.f46115a[aVar.f46116b + i9]) {
                    return false;
                }
            }
            return true;
        }
        return super.equals(obj);
    }

    @Override
    public final Object get(int i9) {
        d0.b(i9, size());
        return Integer.valueOf(this.f46115a[this.f46116b + i9]);
    }

    @Override
    public final int hashCode() {
        int i9 = 1;
        for (int i10 = this.f46116b; i10 < this.f46117c; i10++) {
            i9 = (i9 * 31) + this.f46115a[i10];
        }
        return i9;
    }

    @Override
    public final int indexOf(Object obj) {
        if (obj instanceof Integer) {
            int intValue = ((Integer) obj).intValue();
            int i9 = this.f46117c;
            int i10 = this.f46116b;
            int c10 = r6.c(intValue, i10, i9, this.f46115a);
            if (c10 >= 0) {
                return c10 - i10;
            }
            return -1;
        }
        return -1;
    }

    @Override
    public final boolean isEmpty() {
        return false;
    }

    @Override
    public final int lastIndexOf(Object obj) {
        int i9;
        if (obj instanceof Integer) {
            int intValue = ((Integer) obj).intValue();
            int i10 = this.f46117c;
            while (true) {
                i10--;
                i9 = this.f46116b;
                if (i10 >= i9) {
                    if (this.f46115a[i10] == intValue) {
                        break;
                    }
                } else {
                    i10 = -1;
                    break;
                }
            }
            if (i10 >= 0) {
                return i10 - i9;
            }
        }
        return -1;
    }

    @Override
    public final Object set(int i9, Object obj) {
        Integer num = (Integer) obj;
        d0.b(i9, size());
        int i10 = this.f46116b + i9;
        int[] iArr = this.f46115a;
        int i11 = iArr[i10];
        num.getClass();
        iArr[i10] = num.intValue();
        return Integer.valueOf(i11);
    }

    @Override
    public final int size() {
        return this.f46117c - this.f46116b;
    }

    @Override
    public final List subList(int i9, int i10) {
        d0.d(i9, i10, size());
        if (i9 == i10) {
            return Collections.EMPTY_LIST;
        }
        int i11 = this.f46116b;
        return new a(i9 + i11, i11 + i10, this.f46115a);
    }

    @Override
    public final String toString() {
        StringBuilder sb2 = new StringBuilder(size() * 5);
        sb2.append('[');
        int[] iArr = this.f46115a;
        int i9 = this.f46116b;
        sb2.append(iArr[i9]);
        while (true) {
            i9++;
            if (i9 < this.f46117c) {
                sb2.append(", ");
                sb2.append(iArr[i9]);
            } else {
                sb2.append(']');
                return sb2.toString();
            }
        }
    }
}
