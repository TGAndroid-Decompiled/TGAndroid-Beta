package p3;

import a1.g;
import b2.r0;
import b2.t0;
import b2.x;
import java.util.Arrays;
public final class c implements t0 {
    public final byte[] f46682a;
    public final String f46683b;
    public final String f46684c;

    public c(String str, String str2, byte[] bArr) {
        this.f46682a = bArr;
        this.f46683b = str;
        this.f46684c = str2;
    }

    @Override
    public final x a() {
        return null;
    }

    @Override
    public final void b(r0 r0Var) {
        String str = this.f46683b;
        if (str != null) {
            r0Var.f3362a = str;
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
            return Arrays.equals(this.f46682a, ((c) obj).f46682a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f46682a);
    }

    public final String toString() {
        return g.n(this.f46682a.length, "\"", g.w("ICY: title=\"", this.f46683b, "\", url=\"", this.f46684c, "\", rawMetadata.length=\""));
    }
}
