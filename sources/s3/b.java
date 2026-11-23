package s3;

import a8.la;
import e2.n0;
import e2.p0;
import e2.u;
import j$.util.Objects;
public final class b implements p0 {
    public final int f56956a;
    public final String f56957b;
    public final String f56958c;
    public final String d;
    public final boolean f56959e;
    public final int f56960f;

    public b(int i7, String str, String str2, String str3, boolean z10, int i10) {
        boolean z11;
        if (i10 != -1 && i10 <= 0) {
            z11 = false;
        } else {
            z11 = true;
        }
        la.f(z11);
        this.f56956a = i7;
        this.f56957b = str;
        this.f56958c = str2;
        this.d = str3;
        this.f56959e = z10;
        this.f56960f = i10;
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
        String str = this.f56958c;
        if (str != null) {
            n0Var.G = str;
        }
        String str2 = this.f56957b;
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
            if (this.f56956a == bVar.f56956a && Objects.equals(this.f56957b, bVar.f56957b) && Objects.equals(this.f56958c, bVar.f56958c) && Objects.equals(this.d, bVar.d) && this.f56959e == bVar.f56959e && this.f56960f == bVar.f56960f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        int i10;
        int i11 = (527 + this.f56956a) * 31;
        int i12 = 0;
        String str = this.f56957b;
        if (str != null) {
            i7 = str.hashCode();
        } else {
            i7 = 0;
        }
        int i13 = (i11 + i7) * 31;
        String str2 = this.f56958c;
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
        return ((((i14 + i12) * 31) + (this.f56959e ? 1 : 0)) * 31) + this.f56960f;
    }

    public final String toString() {
        return "IcyHeaders: name=\"" + this.f56958c + "\", genre=\"" + this.f56957b + "\", bitrate=" + this.f56956a + ", metadataInterval=" + this.f56960f;
    }
}
