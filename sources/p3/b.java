package p3;

import b2.q0;
import b2.s0;
import b2.w;
import j$.util.Objects;
import v7.u6;
public final class b implements s0 {
    public final int f44500a;
    public final String f44501b;
    public final String f44502c;
    public final String d;
    public final boolean e;
    public final int f44503f;

    public b(int i10, String str, String str2, String str3, boolean z10, int i11) {
        boolean z11;
        if (i11 != -1 && i11 <= 0) {
            z11 = false;
        } else {
            z11 = true;
        }
        u6.g(z11);
        this.f44500a = i10;
        this.f44501b = str;
        this.f44502c = str2;
        this.d = str3;
        this.e = z10;
        this.f44503f = i11;
    }

    public static p3.b d(java.util.Map r14) {
        throw new UnsupportedOperationException("Method not decompiled: p3.b.d(java.util.Map):p3.b");
    }

    @Override
    public final w a() {
        return null;
    }

    @Override
    public final void b(q0 q0Var) {
        String str = this.f44502c;
        if (str != null) {
            q0Var.G = str;
        }
        String str2 = this.f44501b;
        if (str2 != null) {
            q0Var.E = str2;
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
            if (this.f44500a == bVar.f44500a && Objects.equals(this.f44501b, bVar.f44501b) && Objects.equals(this.f44502c, bVar.f44502c) && Objects.equals(this.d, bVar.d) && this.e == bVar.e && this.f44503f == bVar.f44503f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int i12 = (527 + this.f44500a) * 31;
        int i13 = 0;
        String str = this.f44501b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i14 = (i12 + i10) * 31;
        String str2 = this.f44502c;
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
        return ((((i15 + i13) * 31) + (this.e ? 1 : 0)) * 31) + this.f44503f;
    }

    public final String toString() {
        return "IcyHeaders: name=\"" + this.f44502c + "\", genre=\"" + this.f44501b + "\", bitrate=" + this.f44500a + ", metadataInterval=" + this.f44503f;
    }
}
