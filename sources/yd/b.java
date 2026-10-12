package yd;

import java.util.Iterator;
import java.util.NoSuchElementException;
public final class b implements Iterator {
    public final String f52327a;
    public int f52328b;
    public int f52329c;
    public int d;
    public int f52330e;

    public b(String str) {
        this.f52327a = str;
    }

    @Override
    public final boolean hasNext() {
        int i10;
        int i11 = this.f52328b;
        if (i11 != 0) {
            if (i11 != 1) {
                return false;
            }
            return true;
        }
        int i12 = 2;
        if (this.f52330e < 0) {
            this.f52328b = 2;
            return false;
        }
        String str = this.f52327a;
        int length = str.length();
        int length2 = str.length();
        for (int i13 = this.f52329c; i13 < length2; i13++) {
            char charAt = str.charAt(i13);
            if (charAt == '\n' || charAt == '\r') {
                i12 = (charAt == '\r' && (i10 = i13 + 1) < str.length() && str.charAt(i10) == '\n') ? 1 : 1;
                length = i13;
                this.f52328b = 1;
                this.f52330e = i12;
                this.d = length;
                return true;
            }
        }
        i12 = -1;
        this.f52328b = 1;
        this.f52330e = i12;
        this.d = length;
        return true;
    }

    @Override
    public final Object next() {
        if (hasNext()) {
            this.f52328b = 0;
            int i10 = this.d;
            int i11 = this.f52329c;
            this.f52329c = this.f52330e + i10;
            return this.f52327a.subSequence(i11, i10).toString();
        }
        throw new NoSuchElementException();
    }

    @Override
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
