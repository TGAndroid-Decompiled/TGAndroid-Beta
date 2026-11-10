package q6;

import java.util.Arrays;
public final class i0 {
    public final String f53899a;
    public final String f53900b;
    public final boolean f53901c;

    public i0(String str, String str2, boolean z9) {
        m.e(str);
        this.f53899a = str;
        m.e(str2);
        this.f53900b = str2;
        this.f53901c = z9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i0)) {
            return false;
        }
        i0 i0Var = (i0) obj;
        if (m.k(this.f53899a, i0Var.f53899a) && m.k(this.f53900b, i0Var.f53900b) && m.k(null, null) && this.f53901c == i0Var.f53901c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f53899a, this.f53900b, null, 4225, Boolean.valueOf(this.f53901c)});
    }

    public final String toString() {
        String str = this.f53899a;
        if (str != null) {
            return str;
        }
        m.g(null);
        throw null;
    }
}
