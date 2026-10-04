package p3;

import b2.m0;
import b2.o0;
import b2.s;
import e2.d;
import j$.util.Objects;
public final class b implements o0 {
    public final int f44138a;
    public final String f44139b;
    public final String f44140c;
    public final String d;
    public final boolean f44141e;
    public final int f44142f;

    public b(int i10, String str, String str2, String str3, boolean z10, int i11) {
        boolean z11;
        if (i11 != -1 && i11 <= 0) {
            z11 = false;
        } else {
            z11 = true;
        }
        d.b(z11);
        this.f44138a = i10;
        this.f44139b = str;
        this.f44140c = str2;
        this.d = str3;
        this.f44141e = z10;
        this.f44142f = i11;
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
        String str = this.f44140c;
        if (str != null) {
            m0Var.F = str;
        }
        String str2 = this.f44139b;
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
            if (this.f44138a == bVar.f44138a && Objects.equals(this.f44139b, bVar.f44139b) && Objects.equals(this.f44140c, bVar.f44140c) && Objects.equals(this.d, bVar.d) && this.f44141e == bVar.f44141e && this.f44142f == bVar.f44142f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int i12 = (527 + this.f44138a) * 31;
        int i13 = 0;
        String str = this.f44139b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i14 = (i12 + i10) * 31;
        String str2 = this.f44140c;
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
        return ((((i15 + i13) * 31) + (this.f44141e ? 1 : 0)) * 31) + this.f44142f;
    }

    public final String toString() {
        return "IcyHeaders: name=\"" + this.f44140c + "\", genre=\"" + this.f44139b + "\", bitrate=" + this.f44138a + ", metadataInterval=" + this.f44142f;
    }
}
