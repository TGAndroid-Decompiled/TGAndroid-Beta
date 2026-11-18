package xd;

import java.util.Iterator;
import java.util.NoSuchElementException;
public final class b implements Iterator {
    public final CharSequence f60446a;
    public int f60447b;
    public int f60448c;
    public int d;
    public int f60449e;

    public b(CharSequence string) {
        kotlin.jvm.internal.j.e(string, "string");
        this.f60446a = string;
    }

    @Override
    public final boolean hasNext() {
        int i7;
        int i10 = this.f60447b;
        if (i10 != 0) {
            if (i10 != 1) {
                return false;
            }
            return true;
        }
        int i11 = 2;
        if (this.f60449e < 0) {
            this.f60447b = 2;
            return false;
        }
        CharSequence charSequence = this.f60446a;
        int length = charSequence.length();
        int length2 = charSequence.length();
        for (int i12 = this.f60448c; i12 < length2; i12++) {
            char charAt = charSequence.charAt(i12);
            if (charAt == '\n' || charAt == '\r') {
                i11 = (charAt == '\r' && (i7 = i12 + 1) < charSequence.length() && charSequence.charAt(i7) == '\n') ? 1 : 1;
                length = i12;
                this.f60447b = 1;
                this.f60449e = i11;
                this.d = length;
                return true;
            }
        }
        i11 = -1;
        this.f60447b = 1;
        this.f60449e = i11;
        this.d = length;
        return true;
    }

    @Override
    public final Object next() {
        if (hasNext()) {
            this.f60447b = 0;
            int i7 = this.d;
            int i10 = this.f60448c;
            this.f60448c = this.f60449e + i7;
            return this.f60446a.subSequence(i10, i7).toString();
        }
        throw new NoSuchElementException();
    }

    @Override
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
