package p3;

import b2.m0;
import b2.o0;
import b2.s;
import java.util.Arrays;
public final class c implements o0 {
    public final byte[] f40568a;
    public final String f40569b;
    public final String f40570c;

    public c(String str, String str2, byte[] bArr) {
        this.f40568a = bArr;
        this.f40569b = str;
        this.f40570c = str2;
    }

    @Override
    public final s a() {
        return null;
    }

    @Override
    public final void b(m0 m0Var) {
        String str = this.f40569b;
        if (str != null) {
            m0Var.f3095a = str;
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
            return Arrays.equals(this.f40568a, ((c) obj).f40568a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f40568a);
    }

    public final String toString() {
        return a4.a.n(this.f40568a.length, "\"", a4.a.w("ICY: title=\"", this.f40569b, "\", url=\"", this.f40570c, "\", rawMetadata.length=\""));
    }
}
