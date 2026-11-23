package s3;

import com.google.android.gms.internal.vision.e2;
import e2.n0;
import e2.p0;
import e2.u;
import java.util.Arrays;
public final class c implements p0 {
    public final byte[] f57042a;
    public final String f57043b;
    public final String f57044c;

    public c(byte[] bArr, String str, String str2) {
        this.f57042a = bArr;
        this.f57043b = str;
        this.f57044c = str2;
    }

    @Override
    public final u a() {
        return null;
    }

    @Override
    public final void b(n0 n0Var) {
        String str = this.f57043b;
        if (str != null) {
            n0Var.f10521a = str;
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
            return Arrays.equals(this.f57042a, ((c) obj).f57042a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f57042a);
    }

    public final String toString() {
        return a8.p0.n(this.f57042a.length, "\"", e2.n("ICY: title=\"", this.f57043b, "\", url=\"", this.f57044c, "\", rawMetadata.length=\""));
    }
}
