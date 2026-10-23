package p3;

import a1.g;
import b2.q0;
import b2.s0;
import b2.w;
import java.util.Arrays;
public final class c implements s0 {
    public final byte[] f44505a;
    public final String f44506b;
    public final String f44507c;

    public c(String str, String str2, byte[] bArr) {
        this.f44505a = bArr;
        this.f44506b = str;
        this.f44507c = str2;
    }

    @Override
    public final w a() {
        return null;
    }

    @Override
    public final void b(q0 q0Var) {
        String str = this.f44506b;
        if (str != null) {
            q0Var.f3911a = str;
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
            return Arrays.equals(this.f44505a, ((c) obj).f44505a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f44505a);
    }

    public final String toString() {
        return g.n(this.f44505a.length, "\"", g.w("ICY: title=\"", this.f44506b, "\", url=\"", this.f44507c, "\", rawMetadata.length=\""));
    }
}
