package wc;

import java.util.Arrays;
import java.util.Iterator;
public final class b implements Iterable, Cloneable {
    public static final String[] d = new String[0];
    public int f52817a = 0;
    public String[] f52818b;
    public String[] f52819c;

    public b() {
        String[] strArr = d;
        this.f52818b = strArr;
        this.f52819c = strArr;
    }

    public final Object clone() {
        try {
            b bVar = (b) super.clone();
            bVar.f52817a = this.f52817a;
            String[] strArr = this.f52818b;
            int i10 = this.f52817a;
            String[] strArr2 = new String[i10];
            System.arraycopy(strArr, 0, strArr2, 0, Math.min(strArr.length, i10));
            this.f52818b = strArr2;
            String[] strArr3 = this.f52819c;
            int i11 = this.f52817a;
            String[] strArr4 = new String[i11];
            System.arraycopy(strArr3, 0, strArr4, 0, Math.min(strArr3.length, i11));
            this.f52819c = strArr4;
            return bVar;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
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
        if (this.f52817a != bVar.f52817a || !Arrays.equals(this.f52818b, bVar.f52818b)) {
            return false;
        }
        return Arrays.equals(this.f52819c, bVar.f52819c);
    }

    public final int hashCode() {
        return (((this.f52817a * 31) + Arrays.hashCode(this.f52818b)) * 31) + Arrays.hashCode(this.f52819c);
    }

    @Override
    public final Iterator iterator() {
        return new bd.b(this);
    }

    public final int l(String str) {
        if (str != null) {
            for (int i10 = 0; i10 < this.f52817a; i10++) {
                if (str.equals(this.f52818b[i10])) {
                    return i10;
                }
            }
            return -1;
        }
        throw new IllegalArgumentException("Object must not be null");
    }
}
