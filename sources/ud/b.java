package ud;

import java.util.Iterator;
import java.util.NoSuchElementException;
public final class b implements Iterator {
    public final CharSequence f55808a;
    public int f55809b;
    public int f55810c;
    public int d;
    public int f55811e;

    public b(CharSequence string) {
        kotlin.jvm.internal.j.e(string, "string");
        this.f55808a = string;
    }

    @Override
    public final boolean hasNext() {
        int i3;
        int i10 = this.f55809b;
        if (i10 != 0) {
            if (i10 != 1) {
                return false;
            }
            return true;
        }
        int i11 = 2;
        if (this.f55811e < 0) {
            this.f55809b = 2;
            return false;
        }
        CharSequence charSequence = this.f55808a;
        int length = charSequence.length();
        int length2 = charSequence.length();
        for (int i12 = this.f55810c; i12 < length2; i12++) {
            char charAt = charSequence.charAt(i12);
            if (charAt == '\n' || charAt == '\r') {
                i11 = (charAt == '\r' && (i3 = i12 + 1) < charSequence.length() && charSequence.charAt(i3) == '\n') ? 1 : 1;
                length = i12;
                this.f55809b = 1;
                this.f55811e = i11;
                this.d = length;
                return true;
            }
        }
        i11 = -1;
        this.f55809b = 1;
        this.f55811e = i11;
        this.d = length;
        return true;
    }

    @Override
    public final Object next() {
        if (hasNext()) {
            this.f55809b = 0;
            int i3 = this.d;
            int i10 = this.f55810c;
            this.f55810c = this.f55811e + i3;
            return this.f55808a.subSequence(i10, i3).toString();
        }
        throw new NoSuchElementException();
    }

    @Override
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
