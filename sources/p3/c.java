package p3;

import b2.m0;
import b2.o0;
import b2.s;
import java.util.Arrays;
public final class c implements o0 {
    public final byte[] f40807a;
    public final String f40808b;
    public final String f40809c;

    public c(String str, String str2, byte[] bArr) {
        this.f40807a = bArr;
        this.f40808b = str;
        this.f40809c = str2;
    }

    @Override
    public final s a() {
        return null;
    }

    @Override
    public final void b(m0 m0Var) {
        String str = this.f40808b;
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
            return Arrays.equals(this.f40807a, ((c) obj).f40807a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f40807a);
    }

    public final String toString() {
        return a4.a.o(this.f40807a.length, "\"", a4.a.x("ICY: title=\"", this.f40808b, "\", url=\"", this.f40809c, "\", rawMetadata.length=\""));
    }
}
