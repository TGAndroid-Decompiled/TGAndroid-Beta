package p3;

import b2.m0;
import b2.o0;
import b2.s;
import java.util.Arrays;
public final class c implements o0 {
    public final byte[] f40907a;
    public final String f40908b;
    public final String f40909c;

    public c(String str, String str2, byte[] bArr) {
        this.f40907a = bArr;
        this.f40908b = str;
        this.f40909c = str2;
    }

    @Override
    public final s a() {
        return null;
    }

    @Override
    public final void b(m0 m0Var) {
        String str = this.f40908b;
        if (str != null) {
            m0Var.f3094a = str;
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
            return Arrays.equals(this.f40907a, ((c) obj).f40907a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f40907a);
    }

    public final String toString() {
        return a4.a.o(this.f40907a.length, "\"", a4.a.x("ICY: title=\"", this.f40908b, "\", url=\"", this.f40909c, "\", rawMetadata.length=\""));
    }
}
