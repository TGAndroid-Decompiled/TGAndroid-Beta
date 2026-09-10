package p3;

import b2.m0;
import b2.o0;
import b2.s;
import java.util.Arrays;
public final class c implements o0 {
    public final byte[] f39666a;
    public final String f39667b;
    public final String f39668c;

    public c(String str, String str2, byte[] bArr) {
        this.f39666a = bArr;
        this.f39667b = str;
        this.f39668c = str2;
    }

    @Override
    public final s a() {
        return null;
    }

    @Override
    public final void b(m0 m0Var) {
        String str = this.f39667b;
        if (str != null) {
            m0Var.f1788a = str;
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
            return Arrays.equals(this.f39666a, ((c) obj).f39666a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f39666a);
    }

    public final String toString() {
        return a4.a.n(this.f39666a.length, "\"", a4.a.w("ICY: title=\"", this.f39667b, "\", url=\"", this.f39668c, "\", rawMetadata.length=\""));
    }
}
