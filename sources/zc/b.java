package zc;

import java.util.Arrays;
import java.util.Iterator;
public final class b implements Iterable, Cloneable {
    public static final String[] d = new String[0];
    public int f60377a = 0;
    public String[] f60378b;
    public String[] f60379c;

    public b() {
        String[] strArr = d;
        this.f60378b = strArr;
        this.f60379c = strArr;
    }

    public final Object clone() {
        try {
            b bVar = (b) super.clone();
            bVar.f60377a = this.f60377a;
            String[] strArr = this.f60378b;
            int i3 = this.f60377a;
            String[] strArr2 = new String[i3];
            System.arraycopy(strArr, 0, strArr2, 0, Math.min(strArr.length, i3));
            this.f60378b = strArr2;
            String[] strArr3 = this.f60379c;
            int i10 = this.f60377a;
            String[] strArr4 = new String[i10];
            System.arraycopy(strArr3, 0, strArr4, 0, Math.min(strArr3.length, i10));
            this.f60379c = strArr4;
            return bVar;
        } catch (CloneNotSupportedException e10) {
            throw new RuntimeException(e10);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f60377a != bVar.f60377a || !Arrays.equals(this.f60378b, bVar.f60378b)) {
            return false;
        }
        return Arrays.equals(this.f60379c, bVar.f60379c);
    }

    public final int h(String str) {
        if (str != null) {
            for (int i3 = 0; i3 < this.f60377a; i3++) {
                if (str.equals(this.f60378b[i3])) {
                    return i3;
                }
            }
            return -1;
        }
        throw new IllegalArgumentException("Object must not be null");
    }

    public final int hashCode() {
        return (((this.f60377a * 31) + Arrays.hashCode(this.f60378b)) * 31) + Arrays.hashCode(this.f60379c);
    }

    @Override
    public final Iterator iterator() {
        return new ed.a(this);
    }
}
