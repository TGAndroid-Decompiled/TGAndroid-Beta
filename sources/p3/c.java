package p3;

import a1.g;
import b2.r0;
import b2.t0;
import b2.x;
import java.util.Arrays;
public final class c implements t0 {
    public final byte[] f42694a;
    public final String f42695b;
    public final String f42696c;

    public c(String str, String str2, byte[] bArr) {
        this.f42694a = bArr;
        this.f42695b = str;
        this.f42696c = str2;
    }

    @Override
    public final x a() {
        return null;
    }

    @Override
    public final void b(r0 r0Var) {
        String str = this.f42695b;
        if (str != null) {
            r0Var.f2299a = str;
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
            return Arrays.equals(this.f42694a, ((c) obj).f42694a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f42694a);
    }

    public final String toString() {
        return g.n(this.f42694a.length, "\"", g.w("ICY: title=\"", this.f42695b, "\", url=\"", this.f42696c, "\", rawMetadata.length=\""));
    }
}
