package s3;

import e2.n0;
import e2.p0;
import e2.u;
import java.util.Arrays;
public final class c implements p0 {
    public final byte[] f54788a;
    public final String f54789b;
    public final String f54790c;

    public c(byte[] bArr, String str, String str2) {
        this.f54788a = bArr;
        this.f54789b = str;
        this.f54790c = str2;
    }

    @Override
    public final u a() {
        return null;
    }

    @Override
    public final void b(n0 n0Var) {
        String str = this.f54789b;
        if (str != null) {
            n0Var.f10382a = str;
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
            return Arrays.equals(this.f54788a, ((c) obj).f54788a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f54788a);
    }

    public final String toString() {
        return a8.p0.n(this.f54788a.length, "\"", com.google.android.recaptcha.internal.a.n("ICY: title=\"", this.f54789b, "\", url=\"", this.f54790c, "\", rawMetadata.length=\""));
    }
}
