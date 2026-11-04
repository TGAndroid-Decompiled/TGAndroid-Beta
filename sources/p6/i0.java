package p6;

import java.util.Arrays;
public final class i0 {
    public final String f53264a;
    public final String f53265b;
    public final boolean f53266c;

    public i0(String str, String str2, boolean z10) {
        m.e(str);
        this.f53264a = str;
        m.e(str2);
        this.f53265b = str2;
        this.f53266c = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i0)) {
            return false;
        }
        i0 i0Var = (i0) obj;
        if (m.k(this.f53264a, i0Var.f53264a) && m.k(this.f53265b, i0Var.f53265b) && m.k(null, null) && this.f53266c == i0Var.f53266c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f53264a, this.f53265b, null, 4225, Boolean.valueOf(this.f53266c)});
    }

    public final String toString() {
        String str = this.f53264a;
        if (str != null) {
            return str;
        }
        m.g(null);
        throw null;
    }
}
