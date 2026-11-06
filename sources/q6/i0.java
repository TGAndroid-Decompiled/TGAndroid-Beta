package q6;

import java.util.Arrays;
public final class i0 {
    public final String f53770a;
    public final String f53771b;
    public final boolean f53772c;

    public i0(String str, String str2, boolean z9) {
        m.e(str);
        this.f53770a = str;
        m.e(str2);
        this.f53771b = str2;
        this.f53772c = z9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i0)) {
            return false;
        }
        i0 i0Var = (i0) obj;
        if (m.k(this.f53770a, i0Var.f53770a) && m.k(this.f53771b, i0Var.f53771b) && m.k(null, null) && this.f53772c == i0Var.f53772c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f53770a, this.f53771b, null, 4225, Boolean.valueOf(this.f53772c)});
    }

    public final String toString() {
        String str = this.f53770a;
        if (str != null) {
            return str;
        }
        m.g(null);
        throw null;
    }
}
