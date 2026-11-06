package q6;

import java.util.Arrays;
public final class i0 {
    public final String f53794a;
    public final String f53795b;
    public final boolean f53796c;

    public i0(String str, String str2, boolean z9) {
        m.e(str);
        this.f53794a = str;
        m.e(str2);
        this.f53795b = str2;
        this.f53796c = z9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i0)) {
            return false;
        }
        i0 i0Var = (i0) obj;
        if (m.k(this.f53794a, i0Var.f53794a) && m.k(this.f53795b, i0Var.f53795b) && m.k(null, null) && this.f53796c == i0Var.f53796c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f53794a, this.f53795b, null, 4225, Boolean.valueOf(this.f53796c)});
    }

    public final String toString() {
        String str = this.f53794a;
        if (str != null) {
            return str;
        }
        m.g(null);
        throw null;
    }
}
