package q6;

import java.util.Arrays;
public final class i0 {
    public final String f55951a;
    public final String f55952b;
    public final boolean f55953c;

    public i0(String str, String str2, boolean z10) {
        m.f(str);
        this.f55951a = str;
        m.f(str2);
        this.f55952b = str2;
        this.f55953c = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i0)) {
            return false;
        }
        i0 i0Var = (i0) obj;
        if (m.l(this.f55951a, i0Var.f55951a) && m.l(this.f55952b, i0Var.f55952b) && m.l(null, null) && this.f55953c == i0Var.f55953c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f55951a, this.f55952b, null, 4225, Boolean.valueOf(this.f55953c)});
    }

    public final String toString() {
        String str = this.f55951a;
        if (str != null) {
            return str;
        }
        m.h(null);
        throw null;
    }
}
