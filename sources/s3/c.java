package s3;

import com.google.android.gms.internal.vision.e2;
import e2.n0;
import e2.p0;
import e2.u;
import java.util.Arrays;
public final class c implements p0 {
    public final byte[] f56957a;
    public final String f56958b;
    public final String f56959c;

    public c(byte[] bArr, String str, String str2) {
        this.f56957a = bArr;
        this.f56958b = str;
        this.f56959c = str2;
    }

    @Override
    public final u a() {
        return null;
    }

    @Override
    public final void b(n0 n0Var) {
        String str = this.f56958b;
        if (str != null) {
            n0Var.f10557a = str;
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
            return Arrays.equals(this.f56957a, ((c) obj).f56957a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f56957a);
    }

    public final String toString() {
        return a8.p0.n(this.f56957a.length, "\"", e2.n("ICY: title=\"", this.f56958b, "\", url=\"", this.f56959c, "\", rawMetadata.length=\""));
    }
}
