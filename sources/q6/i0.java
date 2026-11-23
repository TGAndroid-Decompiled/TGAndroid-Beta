package q6;

import java.util.Arrays;
public final class i0 {
    public final String f56033a;
    public final String f56034b;
    public final boolean f56035c;

    public i0(String str, String str2, boolean z10) {
        m.f(str);
        this.f56033a = str;
        m.f(str2);
        this.f56034b = str2;
        this.f56035c = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i0)) {
            return false;
        }
        i0 i0Var = (i0) obj;
        if (m.l(this.f56033a, i0Var.f56033a) && m.l(this.f56034b, i0Var.f56034b) && m.l(null, null) && this.f56035c == i0Var.f56035c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f56033a, this.f56034b, null, 4225, Boolean.valueOf(this.f56035c)});
    }

    public final String toString() {
        String str = this.f56033a;
        if (str != null) {
            return str;
        }
        m.h(null);
        throw null;
    }
}
