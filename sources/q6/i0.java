package q6;

import java.util.Arrays;
public final class i0 {
    public final String f55336a;
    public final String f55337b;
    public final boolean f55338c;

    public i0(String str, String str2, boolean z10) {
        m.e(str);
        this.f55336a = str;
        m.e(str2);
        this.f55337b = str2;
        this.f55338c = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i0)) {
            return false;
        }
        i0 i0Var = (i0) obj;
        if (m.k(this.f55336a, i0Var.f55336a) && m.k(this.f55337b, i0Var.f55337b) && m.k(null, null) && this.f55338c == i0Var.f55338c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f55336a, this.f55337b, null, 4225, Boolean.valueOf(this.f55338c)});
    }

    public final String toString() {
        String str = this.f55336a;
        if (str != null) {
            return str;
        }
        m.g(null);
        throw null;
    }
}
