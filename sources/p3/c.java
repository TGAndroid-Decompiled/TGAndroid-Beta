package p3;

import b2.m0;
import b2.o0;
import b2.s;
import java.util.Arrays;
public final class c implements o0 {
    public final byte[] f44150a;
    public final String f44151b;
    public final String f44152c;

    public c(String str, String str2, byte[] bArr) {
        this.f44150a = bArr;
        this.f44151b = str;
        this.f44152c = str2;
    }

    @Override
    public final s a() {
        return null;
    }

    @Override
    public final void b(m0 m0Var) {
        String str = this.f44151b;
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
            return Arrays.equals(this.f44150a, ((c) obj).f44150a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f44150a);
    }

    public final String toString() {
        return a4.a.o(this.f44150a.length, "\"", a4.a.x("ICY: title=\"", this.f44151b, "\", url=\"", this.f44152c, "\", rawMetadata.length=\""));
    }
}
