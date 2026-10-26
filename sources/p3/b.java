package p3;

import a8.yb;
import b2.r0;
import b2.t0;
import b2.x;
import j$.util.Objects;
public final class b implements t0 {
    public final int f46643a;
    public final String f46644b;
    public final String f46645c;
    public final String d;
    public final boolean e;
    public final int f46646f;

    public b(int i10, String str, String str2, String str3, boolean z10, int i11) {
        boolean z11;
        if (i11 != -1 && i11 <= 0) {
            z11 = false;
        } else {
            z11 = true;
        }
        yb.g(z11);
        this.f46643a = i10;
        this.f46644b = str;
        this.f46645c = str2;
        this.d = str3;
        this.e = z10;
        this.f46646f = i11;
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
        String str = this.f46645c;
        if (str != null) {
            r0Var.G = str;
        }
        String str2 = this.f46644b;
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
            if (this.f46643a == bVar.f46643a && Objects.equals(this.f46644b, bVar.f46644b) && Objects.equals(this.f46645c, bVar.f46645c) && Objects.equals(this.d, bVar.d) && this.e == bVar.e && this.f46646f == bVar.f46646f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int i12 = (527 + this.f46643a) * 31;
        int i13 = 0;
        String str = this.f46644b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i14 = (i12 + i10) * 31;
        String str2 = this.f46645c;
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
        return ((((i15 + i13) * 31) + (this.e ? 1 : 0)) * 31) + this.f46646f;
    }

    public final String toString() {
        return "IcyHeaders: name=\"" + this.f46645c + "\", genre=\"" + this.f46644b + "\", bitrate=" + this.f46643a + ", metadataInterval=" + this.f46646f;
    }
}
