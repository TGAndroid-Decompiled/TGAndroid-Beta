package p3;

import b2.m0;
import b2.o0;
import b2.s;
import java.util.Arrays;
public final class c implements o0 {
    public final byte[] f40806a;
    public final String f40807b;
    public final String f40808c;

    public c(String str, String str2, byte[] bArr) {
        this.f40806a = bArr;
        this.f40807b = str;
        this.f40808c = str2;
    }

    @Override
    public final s a() {
        return null;
    }

    @Override
    public final void b(m0 m0Var) {
        String str = this.f40807b;
        if (str != null) {
            m0Var.f3089a = str;
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
            return Arrays.equals(this.f40806a, ((c) obj).f40806a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f40806a);
    }

    public final String toString() {
        return a4.a.n(this.f40806a.length, "\"", a4.a.w("ICY: title=\"", this.f40807b, "\", url=\"", this.f40808c, "\", rawMetadata.length=\""));
    }
}
