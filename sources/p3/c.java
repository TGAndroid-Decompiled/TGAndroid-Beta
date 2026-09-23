package p3;

import b2.m0;
import b2.o0;
import b2.s;
import java.util.Arrays;
public final class c implements o0 {
    public final byte[] f40492a;
    public final String f40493b;
    public final String f40494c;

    public c(String str, String str2, byte[] bArr) {
        this.f40492a = bArr;
        this.f40493b = str;
        this.f40494c = str2;
    }

    @Override
    public final s a() {
        return null;
    }

    @Override
    public final void b(m0 m0Var) {
        String str = this.f40493b;
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
            return Arrays.equals(this.f40492a, ((c) obj).f40492a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f40492a);
    }

    public final String toString() {
        return a4.a.o(this.f40492a.length, "\"", a4.a.x("ICY: title=\"", this.f40493b, "\", url=\"", this.f40494c, "\", rawMetadata.length=\""));
    }
}
