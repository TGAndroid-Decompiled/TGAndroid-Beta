package s3;

import a8.la;
import e2.n0;
import e2.p0;
import e2.u;
import j$.util.Objects;
public final class b implements p0 {
    public final int f56952a;
    public final String f56953b;
    public final String f56954c;
    public final String d;
    public final boolean f56955e;
    public final int f56956f;

    public b(int i7, String str, String str2, String str3, boolean z10, int i10) {
        boolean z11;
        if (i10 != -1 && i10 <= 0) {
            z11 = false;
        } else {
            z11 = true;
        }
        la.f(z11);
        this.f56952a = i7;
        this.f56953b = str;
        this.f56954c = str2;
        this.d = str3;
        this.f56955e = z10;
        this.f56956f = i10;
    }

    public static s3.b d(java.util.Map r14) {
        throw new UnsupportedOperationException("Method not decompiled: s3.b.d(java.util.Map):s3.b");
    }

    @Override
    public final u a() {
        return null;
    }

    @Override
    public final void b(n0 n0Var) {
        String str = this.f56954c;
        if (str != null) {
            n0Var.G = str;
        }
        String str2 = this.f56953b;
        if (str2 != null) {
            n0Var.E = str2;
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
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            if (this.f56952a == bVar.f56952a && Objects.equals(this.f56953b, bVar.f56953b) && Objects.equals(this.f56954c, bVar.f56954c) && Objects.equals(this.d, bVar.d) && this.f56955e == bVar.f56955e && this.f56956f == bVar.f56956f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        int i10;
        int i11 = (527 + this.f56952a) * 31;
        int i12 = 0;
        String str = this.f56953b;
        if (str != null) {
            i7 = str.hashCode();
        } else {
            i7 = 0;
        }
        int i13 = (i11 + i7) * 31;
        String str2 = this.f56954c;
        if (str2 != null) {
            i10 = str2.hashCode();
        } else {
            i10 = 0;
        }
        int i14 = (i13 + i10) * 31;
        String str3 = this.d;
        if (str3 != null) {
            i12 = str3.hashCode();
        }
        return ((((i14 + i12) * 31) + (this.f56955e ? 1 : 0)) * 31) + this.f56956f;
    }

    public final String toString() {
        return "IcyHeaders: name=\"" + this.f56954c + "\", genre=\"" + this.f56953b + "\", bitrate=" + this.f56952a + ", metadataInterval=" + this.f56956f;
    }
}
