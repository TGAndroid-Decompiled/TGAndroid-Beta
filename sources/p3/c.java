package p3;

import b2.m0;
import b2.o0;
import b2.s;
import java.util.Arrays;
public final class c implements o0 {
    public final byte[] f44136a;
    public final String f44137b;
    public final String f44138c;

    public c(String str, String str2, byte[] bArr) {
        this.f44136a = bArr;
        this.f44137b = str;
        this.f44138c = str2;
    }

    @Override
    public final s a() {
        return null;
    }

    @Override
    public final void b(m0 m0Var) {
        String str = this.f44137b;
        if (str != null) {
            m0Var.f3341a = str;
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
            return Arrays.equals(this.f44136a, ((c) obj).f44136a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f44136a);
    }

    public final String toString() {
        return a4.a.n(this.f44136a.length, "\"", a4.a.w("ICY: title=\"", this.f44137b, "\", url=\"", this.f44138c, "\", rawMetadata.length=\""));
    }
}
