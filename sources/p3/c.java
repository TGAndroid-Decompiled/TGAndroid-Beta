package p3;

import a1.g;
import b2.q0;
import b2.s0;
import b2.w;
import java.util.Arrays;
public final class c implements s0 {
    public final byte[] f44081a;
    public final String f44082b;
    public final String f44083c;

    public c(String str, String str2, byte[] bArr) {
        this.f44081a = bArr;
        this.f44082b = str;
        this.f44083c = str2;
    }

    @Override
    public final w a() {
        return null;
    }

    @Override
    public final void b(q0 q0Var) {
        String str = this.f44082b;
        if (str != null) {
            q0Var.f3908a = str;
        }
    }

    @Override
    public final byte[] c() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c.class == obj.getClass()) {
            return Arrays.equals(this.f44081a, ((c) obj).f44081a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f44081a);
    }

    public final String toString() {
        return g.n(this.f44081a.length, "\"", g.w("ICY: title=\"", this.f44082b, "\", url=\"", this.f44083c, "\", rawMetadata.length=\""));
    }
}
