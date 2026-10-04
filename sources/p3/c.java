package p3;

import b2.m0;
import b2.o0;
import b2.s;
import java.util.Arrays;
public final class c implements o0 {
    public final byte[] f44135a;
    public final String f44136b;
    public final String f44137c;

    public c(String str, String str2, byte[] bArr) {
        this.f44135a = bArr;
        this.f44136b = str;
        this.f44137c = str2;
    }

    @Override
    public final s a() {
        return null;
    }

    @Override
    public final void b(m0 m0Var) {
        String str = this.f44136b;
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
            return Arrays.equals(this.f44135a, ((c) obj).f44135a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f44135a);
    }

    public final String toString() {
        return a4.a.n(this.f44135a.length, "\"", a4.a.w("ICY: title=\"", this.f44136b, "\", url=\"", this.f44137c, "\", rawMetadata.length=\""));
    }
}
