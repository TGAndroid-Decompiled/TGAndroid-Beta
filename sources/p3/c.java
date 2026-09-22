package p3;

import b2.m0;
import b2.o0;
import b2.s;
import java.util.Arrays;
public final class c implements o0 {
    public final byte[] f40856a;
    public final String f40857b;
    public final String f40858c;

    public c(String str, String str2, byte[] bArr) {
        this.f40856a = bArr;
        this.f40857b = str;
        this.f40858c = str2;
    }

    @Override
    public final s a() {
        return null;
    }

    @Override
    public final void b(m0 m0Var) {
        String str = this.f40857b;
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
            return Arrays.equals(this.f40856a, ((c) obj).f40856a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f40856a);
    }

    public final String toString() {
        return a4.a.n(this.f40856a.length, "\"", a4.a.w("ICY: title=\"", this.f40857b, "\", url=\"", this.f40858c, "\", rawMetadata.length=\""));
    }
}
