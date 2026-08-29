package s8;

import i7.p6;
import i7.p7;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;
public final class a extends AbstractList implements RandomAccess, Serializable {
    public final int[] f47686a;
    public final int f47687b;
    public final int f47688c;

    public a(int i10, int i11, int[] iArr) {
        this.f47686a = iArr;
        this.f47687b = i10;
        this.f47688c = i11;
    }

    @Override
    public final boolean contains(Object obj) {
        if ((obj instanceof Integer) && p7.c(((Integer) obj).intValue(), this.f47687b, this.f47688c, this.f47686a) != -1) {
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
            for (int i10 = 0; i10 < size; i10++) {
                if (this.f47686a[this.f47687b + i10] != aVar.f47686a[aVar.f47687b + i10]) {
                    return false;
                }
            }
            return true;
        }
        return super.equals(obj);
    }

    @Override
    public final Object get(int i10) {
        p6.b(i10, size());
        return Integer.valueOf(this.f47686a[this.f47687b + i10]);
    }

    @Override
    public final int hashCode() {
        int i10 = 1;
        for (int i11 = this.f47687b; i11 < this.f47688c; i11++) {
            i10 = (i10 * 31) + this.f47686a[i11];
        }
        return i10;
    }

    @Override
    public final int indexOf(Object obj) {
        if (obj instanceof Integer) {
            int intValue = ((Integer) obj).intValue();
            int i10 = this.f47688c;
            int i11 = this.f47687b;
            int c3 = p7.c(intValue, i11, i10, this.f47686a);
            if (c3 >= 0) {
                return c3 - i11;
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
        int i10;
        if (obj instanceof Integer) {
            int intValue = ((Integer) obj).intValue();
            int i11 = this.f47688c;
            while (true) {
                i11--;
                i10 = this.f47687b;
                if (i11 >= i10) {
                    if (this.f47686a[i11] == intValue) {
                        break;
                    }
                } else {
                    i11 = -1;
                    break;
                }
            }
            if (i11 >= 0) {
                return i11 - i10;
            }
        }
        return -1;
    }

    @Override
    public final Object set(int i10, Object obj) {
        Integer num = (Integer) obj;
        p6.b(i10, size());
        int i11 = this.f47687b + i10;
        int[] iArr = this.f47686a;
        int i12 = iArr[i11];
        num.getClass();
        iArr[i11] = num.intValue();
        return Integer.valueOf(i12);
    }

    @Override
    public final int size() {
        return this.f47688c - this.f47687b;
    }

    @Override
    public final List subList(int i10, int i11) {
        p6.d(i10, i11, size());
        if (i10 == i11) {
            return Collections.EMPTY_LIST;
        }
        int i12 = this.f47687b;
        return new a(i10 + i12, i12 + i11, this.f47686a);
    }

    @Override
    public final String toString() {
        StringBuilder sb2 = new StringBuilder(size() * 5);
        sb2.append('[');
        int[] iArr = this.f47686a;
        int i10 = this.f47687b;
        sb2.append(iArr[i10]);
        while (true) {
            i10++;
            if (i10 < this.f47688c) {
                sb2.append(", ");
                sb2.append(iArr[i10]);
            } else {
                sb2.append(']');
                return sb2.toString();
            }
        }
    }
}
