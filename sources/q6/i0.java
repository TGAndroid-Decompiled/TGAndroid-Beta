package q6;

import java.util.Arrays;
public final class i0 {
    public final String f53795a;
    public final String f53796b;
    public final boolean f53797c;

    public i0(String str, String str2, boolean z9) {
        m.e(str);
        this.f53795a = str;
        m.e(str2);
        this.f53796b = str2;
        this.f53797c = z9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i0)) {
            return false;
        }
        i0 i0Var = (i0) obj;
        if (m.k(this.f53795a, i0Var.f53795a) && m.k(this.f53796b, i0Var.f53796b) && m.k(null, null) && this.f53797c == i0Var.f53797c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f53795a, this.f53796b, null, 4225, Boolean.valueOf(this.f53797c)});
    }

    public final String toString() {
        String str = this.f53795a;
        if (str != null) {
            return str;
        }
        m.g(null);
        throw null;
    }
}
