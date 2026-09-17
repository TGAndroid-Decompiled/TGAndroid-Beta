package p3;

import b2.m0;
import b2.o0;
import b2.s;
import java.util.Arrays;
public final class c implements o0 {
    public final byte[] f43822a;
    public final String f43823b;
    public final String f43824c;

    public c(String str, String str2, byte[] bArr) {
        this.f43822a = bArr;
        this.f43823b = str;
        this.f43824c = str2;
    }

    @Override
    public final s a() {
        return null;
    }

    @Override
    public final void b(m0 m0Var) {
        String str = this.f43823b;
        if (str != null) {
            m0Var.f2174a = str;
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
            return Arrays.equals(this.f43822a, ((c) obj).f43822a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f43822a);
    }

    public final String toString() {
        return a4.a.n(this.f43822a.length, "\"", a4.a.w("ICY: title=\"", this.f43823b, "\", url=\"", this.f43824c, "\", rawMetadata.length=\""));
    }
}
