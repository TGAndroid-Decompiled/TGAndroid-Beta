package u8;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;
import k7.b7;
import k7.y7;
public final class a extends AbstractList implements RandomAccess, Serializable {
    public final int[] f45196a;
    public final int f45197b;
    public final int f45198c;

    public a(int i10, int i11, int[] iArr) {
        this.f45196a = iArr;
        this.f45197b = i10;
        this.f45198c = i11;
    }

    @Override
    public final boolean contains(Object obj) {
        if ((obj instanceof Integer) && y7.b(((Integer) obj).intValue(), this.f45197b, this.f45198c, this.f45196a) != -1) {
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
                if (this.f45196a[this.f45197b + i10] != aVar.f45196a[aVar.f45197b + i10]) {
                    return false;
                }
            }
            return true;
        }
        return super.equals(obj);
    }

    @Override
    public final Object get(int i10) {
        b7.c(i10, size());
        return Integer.valueOf(this.f45196a[this.f45197b + i10]);
    }

    @Override
    public final int hashCode() {
        int i10 = 1;
        for (int i11 = this.f45197b; i11 < this.f45198c; i11++) {
            i10 = (i10 * 31) + this.f45196a[i11];
        }
        return i10;
    }

    @Override
    public final int indexOf(Object obj) {
        if (obj instanceof Integer) {
            int intValue = ((Integer) obj).intValue();
            int i10 = this.f45198c;
            int i11 = this.f45197b;
            int b10 = y7.b(intValue, i11, i10, this.f45196a);
            if (b10 >= 0) {
                return b10 - i11;
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
            int i11 = this.f45198c;
            while (true) {
                i11--;
                i10 = this.f45197b;
                if (i11 >= i10) {
                    if (this.f45196a[i11] == intValue) {
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
        b7.c(i10, size());
        int i11 = this.f45197b + i10;
        int[] iArr = this.f45196a;
        int i12 = iArr[i11];
        num.getClass();
        iArr[i11] = num.intValue();
        return Integer.valueOf(i12);
    }

    @Override
    public final int size() {
        return this.f45198c - this.f45197b;
    }

    @Override
    public final List subList(int i10, int i11) {
        b7.e(i10, i11, size());
        if (i10 == i11) {
            return Collections.EMPTY_LIST;
        }
        int i12 = this.f45197b;
        return new a(i10 + i12, i12 + i11, this.f45196a);
    }

    @Override
    public final String toString() {
        StringBuilder sb = new StringBuilder(size() * 5);
        sb.append('[');
        int[] iArr = this.f45196a;
        int i10 = this.f45197b;
        sb.append(iArr[i10]);
        while (true) {
            i10++;
            if (i10 < this.f45198c) {
                sb.append(", ");
                sb.append(iArr[i10]);
            } else {
                sb.append(']');
                return sb.toString();
            }
        }
    }
}
