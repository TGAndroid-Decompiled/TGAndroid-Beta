package r3;

import a1.g;
import d2.p0;
import d2.r0;
import d2.v;
import java.util.Arrays;
public final class c implements r0 {
    public final byte[] f54242a;
    public final String f54243b;
    public final String f54244c;

    public c(byte[] bArr, String str, String str2) {
        this.f54242a = bArr;
        this.f54243b = str;
        this.f54244c = str2;
    }

    @Override
    public final void a(p0 p0Var) {
        String str = this.f54243b;
        if (str != null) {
            p0Var.f8260a = str;
        }
    }

    @Override
    public final v b() {
        return null;
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
            return Arrays.equals(this.f54242a, ((c) obj).f54242a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f54242a);
    }

    public final String toString() {
        return g.o(this.f54242a.length, "\"", com.google.android.recaptcha.internal.a.n("ICY: title=\"", this.f54243b, "\", url=\"", this.f54244c, "\", rawMetadata.length=\""));
    }
}
