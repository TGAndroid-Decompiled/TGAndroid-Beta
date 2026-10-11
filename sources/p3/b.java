package p3;

import b2.m0;
import b2.o0;
import b2.s;
import e2.d;
import j$.util.Objects;
public final class b implements o0 {
    public final int f45345a;
    public final String f45346b;
    public final String f45347c;
    public final String d;
    public final boolean f45348e;
    public final int f45349f;

    public b(int i10, String str, String str2, String str3, boolean z10, int i11) {
        boolean z11;
        if (i11 != -1 && i11 <= 0) {
            z11 = false;
        } else {
            z11 = true;
        }
        d.b(z11);
        this.f45345a = i10;
        this.f45346b = str;
        this.f45347c = str2;
        this.d = str3;
        this.f45348e = z10;
        this.f45349f = i11;
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
        String str = this.f45347c;
        if (str != null) {
            m0Var.F = str;
        }
        String str2 = this.f45346b;
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
            if (this.f45345a == bVar.f45345a && Objects.equals(this.f45346b, bVar.f45346b) && Objects.equals(this.f45347c, bVar.f45347c) && Objects.equals(this.d, bVar.d) && this.f45348e == bVar.f45348e && this.f45349f == bVar.f45349f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int i12 = (527 + this.f45345a) * 31;
        int i13 = 0;
        String str = this.f45346b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i14 = (i12 + i10) * 31;
        String str2 = this.f45347c;
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
        return ((((i15 + i13) * 31) + (this.f45348e ? 1 : 0)) * 31) + this.f45349f;
    }

    public final String toString() {
        return "IcyHeaders: name=\"" + this.f45347c + "\", genre=\"" + this.f45346b + "\", bitrate=" + this.f45345a + ", metadataInterval=" + this.f45349f;
    }
}
