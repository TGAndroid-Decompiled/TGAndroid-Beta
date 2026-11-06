package xd;

import java.util.Iterator;
import java.util.NoSuchElementException;
public final class b implements Iterator {
    public final CharSequence f58589a;
    public int f58590b;
    public int f58591c;
    public int d;
    public int f58592e;

    public b(CharSequence string) {
        kotlin.jvm.internal.j.e(string, "string");
        this.f58589a = string;
    }

    @Override
    public final boolean hasNext() {
        int i7;
        int i10 = this.f58590b;
        if (i10 != 0) {
            if (i10 != 1) {
                return false;
            }
            return true;
        }
        int i11 = 2;
        if (this.f58592e < 0) {
            this.f58590b = 2;
            return false;
        }
        CharSequence charSequence = this.f58589a;
        int length = charSequence.length();
        int length2 = charSequence.length();
        for (int i12 = this.f58591c; i12 < length2; i12++) {
            char charAt = charSequence.charAt(i12);
            if (charAt == '\n' || charAt == '\r') {
                i11 = (charAt == '\r' && (i7 = i12 + 1) < charSequence.length() && charSequence.charAt(i7) == '\n') ? 1 : 1;
                length = i12;
                this.f58590b = 1;
                this.f58592e = i11;
                this.d = length;
                return true;
            }
        }
        i11 = -1;
        this.f58590b = 1;
        this.f58592e = i11;
        this.d = length;
        return true;
    }

    @Override
    public final Object next() {
        if (hasNext()) {
            this.f58590b = 0;
            int i7 = this.d;
            int i10 = this.f58591c;
            this.f58591c = this.f58592e + i7;
            return this.f58589a.subSequence(i10, i7).toString();
        }
        throw new NoSuchElementException();
    }

    @Override
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
