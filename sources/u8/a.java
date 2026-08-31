package u8;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;
import k7.c7;
import k7.y7;
public final class a extends AbstractList implements RandomAccess, Serializable {
    public final int[] f48455a;
    public final int f48456b;
    public final int f48457c;

    public a(int i10, int i11, int[] iArr) {
        this.f48455a = iArr;
        this.f48456b = i10;
        this.f48457c = i11;
    }

    @Override
    public final boolean contains(Object obj) {
        if ((obj instanceof Integer) && y7.b(((Integer) obj).intValue(), this.f48456b, this.f48457c, this.f48455a) != -1) {
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
                if (this.f48455a[this.f48456b + i10] != aVar.f48455a[aVar.f48456b + i10]) {
                    return false;
                }
            }
            return true;
        }
        return super.equals(obj);
    }

    @Override
    public final Object get(int i10) {
        c7.c(i10, size());
        return Integer.valueOf(this.f48455a[this.f48456b + i10]);
    }

    @Override
    public final int hashCode() {
        int i10 = 1;
        for (int i11 = this.f48456b; i11 < this.f48457c; i11++) {
            i10 = (i10 * 31) + this.f48455a[i11];
        }
        return i10;
    }

    @Override
    public final int indexOf(Object obj) {
        if (obj instanceof Integer) {
            int intValue = ((Integer) obj).intValue();
            int i10 = this.f48457c;
            int i11 = this.f48456b;
            int b10 = y7.b(intValue, i11, i10, this.f48455a);
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
            int i11 = this.f48457c;
            while (true) {
                i11--;
                i10 = this.f48456b;
                if (i11 >= i10) {
                    if (this.f48455a[i11] == intValue) {
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
        c7.c(i10, size());
        int i11 = this.f48456b + i10;
        int[] iArr = this.f48455a;
        int i12 = iArr[i11];
        num.getClass();
        iArr[i11] = num.intValue();
        return Integer.valueOf(i12);
    }

    @Override
    public final int size() {
        return this.f48457c - this.f48456b;
    }

    @Override
    public final List subList(int i10, int i11) {
        c7.e(i10, i11, size());
        if (i10 == i11) {
            return Collections.EMPTY_LIST;
        }
        int i12 = this.f48456b;
        return new a(i10 + i12, i12 + i11, this.f48455a);
    }

    @Override
    public final String toString() {
        StringBuilder sb = new StringBuilder(size() * 5);
        sb.append('[');
        int[] iArr = this.f48455a;
        int i10 = this.f48456b;
        sb.append(iArr[i10]);
        while (true) {
            i10++;
            if (i10 < this.f48457c) {
                sb.append(", ");
                sb.append(iArr[i10]);
            } else {
                sb.append(']');
                return sb.toString();
            }
        }
    }
}
