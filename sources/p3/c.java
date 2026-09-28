package p3;

import b2.m0;
import b2.o0;
import b2.s;
import java.util.Arrays;
public final class c implements o0 {
    public final byte[] f40809a;
    public final String f40810b;
    public final String f40811c;

    public c(String str, String str2, byte[] bArr) {
        this.f40809a = bArr;
        this.f40810b = str;
        this.f40811c = str2;
    }

    @Override
    public final s a() {
        return null;
    }

    @Override
    public final void b(m0 m0Var) {
        String str = this.f40810b;
        if (str != null) {
            m0Var.f3087a = str;
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
            return Arrays.equals(this.f40809a, ((c) obj).f40809a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f40809a);
    }

    public final String toString() {
        return a4.a.o(this.f40809a.length, "\"", a4.a.x("ICY: title=\"", this.f40810b, "\", url=\"", this.f40811c, "\", rawMetadata.length=\""));
    }
}
