package q6;

import java.util.Arrays;
public final class i0 {
    public final String f53887a;
    public final String f53888b;
    public final boolean f53889c;

    public i0(String str, String str2, boolean z9) {
        m.e(str);
        this.f53887a = str;
        m.e(str2);
        this.f53888b = str2;
        this.f53889c = z9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i0)) {
            return false;
        }
        i0 i0Var = (i0) obj;
        if (m.k(this.f53887a, i0Var.f53887a) && m.k(this.f53888b, i0Var.f53888b) && m.k(null, null) && this.f53889c == i0Var.f53889c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f53887a, this.f53888b, null, 4225, Boolean.valueOf(this.f53889c)});
    }

    public final String toString() {
        String str = this.f53887a;
        if (str != null) {
            return str;
        }
        m.g(null);
        throw null;
    }
}
