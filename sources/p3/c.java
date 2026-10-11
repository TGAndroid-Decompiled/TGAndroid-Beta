package p3;

import a1.g;
import b2.m0;
import b2.o0;
import b2.s;
import java.util.Arrays;
public final class c implements o0 {
    public final byte[] f45350a;
    public final String f45351b;
    public final String f45352c;

    public c(String str, String str2, byte[] bArr) {
        this.f45350a = bArr;
        this.f45351b = str;
        this.f45352c = str2;
    }

    @Override
    public final s a() {
        return null;
    }

    @Override
    public final void b(m0 m0Var) {
        String str = this.f45351b;
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
            return Arrays.equals(this.f45350a, ((c) obj).f45350a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f45350a);
    }

    public final String toString() {
        return g.o(this.f45350a.length, "\"", g.x("ICY: title=\"", this.f45351b, "\", url=\"", this.f45352c, "\", rawMetadata.length=\""));
    }
}
