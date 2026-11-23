package q6;

import java.util.Arrays;
public final class i0 {
    public final String f55955a;
    public final String f55956b;
    public final boolean f55957c;

    public i0(String str, String str2, boolean z10) {
        m.f(str);
        this.f55955a = str;
        m.f(str2);
        this.f55956b = str2;
        this.f55957c = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i0)) {
            return false;
        }
        i0 i0Var = (i0) obj;
        if (m.l(this.f55955a, i0Var.f55955a) && m.l(this.f55956b, i0Var.f55956b) && m.l(null, null) && this.f55957c == i0Var.f55957c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f55955a, this.f55956b, null, 4225, Boolean.valueOf(this.f55957c)});
    }

    public final String toString() {
        String str = this.f55955a;
        if (str != null) {
            return str;
        }
        m.h(null);
        throw null;
    }
}
