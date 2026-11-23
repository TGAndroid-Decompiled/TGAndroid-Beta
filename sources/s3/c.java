package s3;

import com.google.android.gms.internal.vision.e2;
import e2.n0;
import e2.p0;
import e2.u;
import java.util.Arrays;
public final class c implements p0 {
    public final byte[] f56926a;
    public final String f56927b;
    public final String f56928c;

    public c(byte[] bArr, String str, String str2) {
        this.f56926a = bArr;
        this.f56927b = str;
        this.f56928c = str2;
    }

    @Override
    public final u a() {
        return null;
    }

    @Override
    public final void b(n0 n0Var) {
        String str = this.f56927b;
        if (str != null) {
            n0Var.f10523a = str;
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
            return Arrays.equals(this.f56926a, ((c) obj).f56926a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f56926a);
    }

    public final String toString() {
        return a8.p0.n(this.f56926a.length, "\"", e2.n("ICY: title=\"", this.f56927b, "\", url=\"", this.f56928c, "\", rawMetadata.length=\""));
    }
}
