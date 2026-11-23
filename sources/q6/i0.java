package q6;

import java.util.Arrays;
public final class i0 {
    public final String f55920a;
    public final String f55921b;
    public final boolean f55922c;

    public i0(String str, String str2, boolean z10) {
        m.f(str);
        this.f55920a = str;
        m.f(str2);
        this.f55921b = str2;
        this.f55922c = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i0)) {
            return false;
        }
        i0 i0Var = (i0) obj;
        if (m.l(this.f55920a, i0Var.f55920a) && m.l(this.f55921b, i0Var.f55921b) && m.l(null, null) && this.f55922c == i0Var.f55922c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f55920a, this.f55921b, null, 4225, Boolean.valueOf(this.f55922c)});
    }

    public final String toString() {
        String str = this.f55920a;
        if (str != null) {
            return str;
        }
        m.h(null);
        throw null;
    }
}
