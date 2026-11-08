package q6;

import java.util.Arrays;
public final class i0 {
    public final String f53888a;
    public final String f53889b;
    public final boolean f53890c;

    public i0(String str, String str2, boolean z9) {
        m.e(str);
        this.f53888a = str;
        m.e(str2);
        this.f53889b = str2;
        this.f53890c = z9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i0)) {
            return false;
        }
        i0 i0Var = (i0) obj;
        if (m.k(this.f53888a, i0Var.f53888a) && m.k(this.f53889b, i0Var.f53889b) && m.k(null, null) && this.f53890c == i0Var.f53890c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f53888a, this.f53889b, null, 4225, Boolean.valueOf(this.f53890c)});
    }

    public final String toString() {
        String str = this.f53888a;
        if (str != null) {
            return str;
        }
        m.g(null);
        throw null;
    }
}
