package p3;

import a1.g;
import b2.r0;
import b2.t0;
import b2.x;
import java.util.Arrays;
public final class c implements t0 {
    public final byte[] f42994a;
    public final String f42995b;
    public final String f42996c;

    public c(String str, String str2, byte[] bArr) {
        this.f42994a = bArr;
        this.f42995b = str;
        this.f42996c = str2;
    }

    @Override
    public final x a() {
        return null;
    }

    @Override
    public final void b(r0 r0Var) {
        String str = this.f42995b;
        if (str != null) {
            r0Var.f2295a = str;
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
            return Arrays.equals(this.f42994a, ((c) obj).f42994a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f42994a);
    }

    public final String toString() {
        return g.n(this.f42994a.length, "\"", g.w("ICY: title=\"", this.f42995b, "\", url=\"", this.f42996c, "\", rawMetadata.length=\""));
    }
}
