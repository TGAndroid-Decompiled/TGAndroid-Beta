package p3;

import a1.g;
import b2.m0;
import b2.o0;
import b2.s;
import java.util.Arrays;
public final class c implements o0 {
    public final byte[] f45204a;
    public final String f45205b;
    public final String f45206c;

    public c(String str, String str2, byte[] bArr) {
        this.f45204a = bArr;
        this.f45205b = str;
        this.f45206c = str2;
    }

    @Override
    public final s a() {
        return null;
    }

    @Override
    public final void b(m0 m0Var) {
        String str = this.f45205b;
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
            return Arrays.equals(this.f45204a, ((c) obj).f45204a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f45204a);
    }

    public final String toString() {
        return g.o(this.f45204a.length, "\"", g.x("ICY: title=\"", this.f45205b, "\", url=\"", this.f45206c, "\", rawMetadata.length=\""));
    }
}
