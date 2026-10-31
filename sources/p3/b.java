package p3;

import b2.r0;
import b2.t0;
import b2.x;
import j$.util.Objects;
import v7.t6;
public final class b implements t0 {
    public final int f44692a;
    public final String f44693b;
    public final String f44694c;
    public final String d;
    public final boolean e;
    public final int f44695f;

    public b(int i10, String str, String str2, String str3, boolean z10, int i11) {
        boolean z11;
        if (i11 != -1 && i11 <= 0) {
            z11 = false;
        } else {
            z11 = true;
        }
        t6.f(z11);
        this.f44692a = i10;
        this.f44693b = str;
        this.f44694c = str2;
        this.d = str3;
        this.e = z10;
        this.f44695f = i11;
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
        String str = this.f44694c;
        if (str != null) {
            r0Var.G = str;
        }
        String str2 = this.f44693b;
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
            if (this.f44692a == bVar.f44692a && Objects.equals(this.f44693b, bVar.f44693b) && Objects.equals(this.f44694c, bVar.f44694c) && Objects.equals(this.d, bVar.d) && this.e == bVar.e && this.f44695f == bVar.f44695f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int i12 = (527 + this.f44692a) * 31;
        int i13 = 0;
        String str = this.f44693b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i14 = (i12 + i10) * 31;
        String str2 = this.f44694c;
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
        return ((((i15 + i13) * 31) + (this.e ? 1 : 0)) * 31) + this.f44695f;
    }

    public final String toString() {
        return "IcyHeaders: name=\"" + this.f44694c + "\", genre=\"" + this.f44693b + "\", bitrate=" + this.f44692a + ", metadataInterval=" + this.f44695f;
    }
}
