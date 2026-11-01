package p3;

import a1.g;
import b2.r0;
import b2.t0;
import b2.x;
import java.util.Arrays;
public final class c implements t0 {
    public final byte[] f44707a;
    public final String f44708b;
    public final String f44709c;

    public c(byte[] bArr, String str, String str2) {
        this.f44707a = bArr;
        this.f44708b = str;
        this.f44709c = str2;
    }

    @Override
    public final x a() {
        return null;
    }

    @Override
    public final void b(r0 r0Var) {
        String str = this.f44708b;
        if (str != null) {
            r0Var.f2199a = str;
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
            return Arrays.equals(this.f44707a, ((c) obj).f44707a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f44707a);
    }

    public final String toString() {
        return g.p(g.v("ICY: title=\"", this.f44708b, "\", url=\"", this.f44709c, "\", rawMetadata.length=\""), this.f44707a.length, "\"");
    }
}
