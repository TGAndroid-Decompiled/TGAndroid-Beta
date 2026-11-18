package q6;

import java.util.Arrays;
public final class i0 {
    public final String f55910a;
    public final String f55911b;
    public final boolean f55912c;

    public i0(String str, String str2, boolean z10) {
        m.f(str);
        this.f55910a = str;
        m.f(str2);
        this.f55911b = str2;
        this.f55912c = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i0)) {
            return false;
        }
        i0 i0Var = (i0) obj;
        if (m.l(this.f55910a, i0Var.f55910a) && m.l(this.f55911b, i0Var.f55911b) && m.l(null, null) && this.f55912c == i0Var.f55912c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f55910a, this.f55911b, null, 4225, Boolean.valueOf(this.f55912c)});
    }

    public final String toString() {
        String str = this.f55910a;
        if (str != null) {
            return str;
        }
        m.h(null);
        throw null;
    }
}
