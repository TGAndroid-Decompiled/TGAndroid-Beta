package p3;

import a1.g;
import b2.m0;
import b2.o0;
import b2.s;
import java.util.Arrays;
public final class c implements o0 {
    public final byte[] f45314a;
    public final String f45315b;
    public final String f45316c;

    public c(String str, String str2, byte[] bArr) {
        this.f45314a = bArr;
        this.f45315b = str;
        this.f45316c = str2;
    }

    @Override
    public final s a() {
        return null;
    }

    @Override
    public final void b(m0 m0Var) {
        String str = this.f45315b;
        if (str != null) {
            m0Var.f3420a = str;
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
            return Arrays.equals(this.f45314a, ((c) obj).f45314a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f45314a);
    }

    public final String toString() {
        return g.o(this.f45314a.length, "\"", g.x("ICY: title=\"", this.f45315b, "\", url=\"", this.f45316c, "\", rawMetadata.length=\""));
    }
}
