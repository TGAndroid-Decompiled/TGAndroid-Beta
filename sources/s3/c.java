package s3;

import e2.n0;
import e2.p0;
import e2.u;
import java.util.Arrays;
public final class c implements p0 {
    public final byte[] f54685a;
    public final String f54686b;
    public final String f54687c;

    public c(byte[] bArr, String str, String str2) {
        this.f54685a = bArr;
        this.f54686b = str;
        this.f54687c = str2;
    }

    @Override
    public final u a() {
        return null;
    }

    @Override
    public final void b(n0 n0Var) {
        String str = this.f54686b;
        if (str != null) {
            n0Var.f10377a = str;
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
            return Arrays.equals(this.f54685a, ((c) obj).f54685a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f54685a);
    }

    public final String toString() {
        return a8.p0.n(this.f54685a.length, "\"", com.google.android.recaptcha.internal.a.n("ICY: title=\"", this.f54686b, "\", url=\"", this.f54687c, "\", rawMetadata.length=\""));
    }
}
