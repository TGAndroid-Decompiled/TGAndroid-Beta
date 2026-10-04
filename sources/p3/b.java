package p3;

import b2.m0;
import b2.o0;
import b2.s;
import e2.d;
import j$.util.Objects;
public final class b implements o0 {
    public final int f44130a;
    public final String f44131b;
    public final String f44132c;
    public final String d;
    public final boolean f44133e;
    public final int f44134f;

    public b(int i10, String str, String str2, String str3, boolean z10, int i11) {
        boolean z11;
        if (i11 != -1 && i11 <= 0) {
            z11 = false;
        } else {
            z11 = true;
        }
        d.b(z11);
        this.f44130a = i10;
        this.f44131b = str;
        this.f44132c = str2;
        this.d = str3;
        this.f44133e = z10;
        this.f44134f = i11;
    }

    public static p3.b d(java.util.Map r14) {
        throw new UnsupportedOperationException("Method not decompiled: p3.b.d(java.util.Map):p3.b");
    }

    @Override
    public final s a() {
        return null;
    }

    @Override
    public final void b(m0 m0Var) {
        String str = this.f44132c;
        if (str != null) {
            m0Var.F = str;
        }
        String str2 = this.f44131b;
        if (str2 != null) {
            m0Var.D = str2;
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
            if (this.f44130a == bVar.f44130a && Objects.equals(this.f44131b, bVar.f44131b) && Objects.equals(this.f44132c, bVar.f44132c) && Objects.equals(this.d, bVar.d) && this.f44133e == bVar.f44133e && this.f44134f == bVar.f44134f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int i12 = (527 + this.f44130a) * 31;
        int i13 = 0;
        String str = this.f44131b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i14 = (i12 + i10) * 31;
        String str2 = this.f44132c;
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
        return ((((i15 + i13) * 31) + (this.f44133e ? 1 : 0)) * 31) + this.f44134f;
    }

    public final String toString() {
        return "IcyHeaders: name=\"" + this.f44132c + "\", genre=\"" + this.f44131b + "\", bitrate=" + this.f44130a + ", metadataInterval=" + this.f44134f;
    }
}
