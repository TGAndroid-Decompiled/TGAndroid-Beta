package q6;

import java.util.Arrays;
public final class i0 {
    public final String f53900a;
    public final String f53901b;
    public final boolean f53902c;

    public i0(String str, String str2, boolean z9) {
        m.e(str);
        this.f53900a = str;
        m.e(str2);
        this.f53901b = str2;
        this.f53902c = z9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i0)) {
            return false;
        }
        i0 i0Var = (i0) obj;
        if (m.k(this.f53900a, i0Var.f53900a) && m.k(this.f53901b, i0Var.f53901b) && m.k(null, null) && this.f53902c == i0Var.f53902c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f53900a, this.f53901b, null, 4225, Boolean.valueOf(this.f53902c)});
    }

    public final String toString() {
        String str = this.f53900a;
        if (str != null) {
            return str;
        }
        m.g(null);
        throw null;
    }
}
