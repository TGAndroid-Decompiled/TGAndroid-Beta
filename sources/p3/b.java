package p3;

import b2.r0;
import b2.t0;
import b2.x;
import j$.util.Objects;
import v7.u6;
public final class b implements t0 {
    public final int f42690a;
    public final String f42691b;
    public final String f42692c;
    public final String d;
    public final boolean e;
    public final int f42693f;

    public b(int i10, String str, String str2, String str3, boolean z10, int i11) {
        boolean z11;
        if (i11 != -1 && i11 <= 0) {
            z11 = false;
        } else {
            z11 = true;
        }
        u6.g(z11);
        this.f42690a = i10;
        this.f42691b = str;
        this.f42692c = str2;
        this.d = str3;
        this.e = z10;
        this.f42693f = i11;
    }

    public static p3.b d(java.util.Map r14) {
        throw new UnsupportedOperationException("Method not decompiled: p3.b.d(java.util.Map):p3.b");
    }

    @Override
    public final x a() {
        return null;
    }

    @Override
    public final void b(r0 r0Var) {
        String str = this.f42692c;
        if (str != null) {
            r0Var.G = str;
        }
        String str2 = this.f42691b;
        if (str2 != null) {
            r0Var.E = str2;
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
            if (this.f42690a == bVar.f42690a && Objects.equals(this.f42691b, bVar.f42691b) && Objects.equals(this.f42692c, bVar.f42692c) && Objects.equals(this.d, bVar.d) && this.e == bVar.e && this.f42693f == bVar.f42693f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int i12 = (527 + this.f42690a) * 31;
        int i13 = 0;
        String str = this.f42691b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i14 = (i12 + i10) * 31;
        String str2 = this.f42692c;
        if (str2 != null) {
            i11 = str2.hashCode();
        } else {
            i11 = 0;
        }
        int i15 = (i14 + i11) * 31;
        String str3 = this.d;
        if (str3 != null) {
            i13 = str3.hashCode();
        }
        return ((((i15 + i13) * 31) + (this.e ? 1 : 0)) * 31) + this.f42693f;
    }

    public final String toString() {
        return "IcyHeaders: name=\"" + this.f42692c + "\", genre=\"" + this.f42691b + "\", bitrate=" + this.f42690a + ", metadataInterval=" + this.f42693f;
    }
}
