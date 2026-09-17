package p3;

import b2.m0;
import b2.o0;
import b2.s;
import java.util.Arrays;
public final class c implements o0 {
    public final byte[] f43795a;
    public final String f43796b;
    public final String f43797c;

    public c(String str, String str2, byte[] bArr) {
        this.f43795a = bArr;
        this.f43796b = str;
        this.f43797c = str2;
    }

    @Override
    public final s a() {
        return null;
    }

    @Override
    public final void b(m0 m0Var) {
        String str = this.f43796b;
        if (str != null) {
            m0Var.f2147a = str;
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
            return Arrays.equals(this.f43795a, ((c) obj).f43795a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f43795a);
    }

    public final String toString() {
        return a4.a.n(this.f43795a.length, "\"", a4.a.w("ICY: title=\"", this.f43796b, "\", url=\"", this.f43797c, "\", rawMetadata.length=\""));
    }
}
