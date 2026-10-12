package p3;

import a1.g;
import b2.m0;
import b2.o0;
import b2.s;
import java.util.Arrays;
public final class c implements o0 {
    public final byte[] f45199a;
    public final String f45200b;
    public final String f45201c;

    public c(String str, String str2, byte[] bArr) {
        this.f45199a = bArr;
        this.f45200b = str;
        this.f45201c = str2;
    }

    @Override
    public final s a() {
        return null;
    }

    @Override
    public final void b(m0 m0Var) {
        String str = this.f45200b;
        if (str != null) {
            m0Var.f3418a = str;
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
            return Arrays.equals(this.f45199a, ((c) obj).f45199a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f45199a);
    }

    public final String toString() {
        return g.o(this.f45199a.length, "\"", g.x("ICY: title=\"", this.f45200b, "\", url=\"", this.f45201c, "\", rawMetadata.length=\""));
    }
}
