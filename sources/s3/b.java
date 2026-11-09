package s3;

import a8.ia;
import e2.n0;
import e2.p0;
import e2.u;
import j$.util.Objects;
public final class b implements p0 {
    public final int f54784a;
    public final String f54785b;
    public final String f54786c;
    public final String d;
    public final boolean f54787e;
    public final int f54788f;

    public b(int i7, String str, String str2, String str3, boolean z9, int i10) {
        boolean z10;
        if (i10 != -1 && i10 <= 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        ia.f(z10);
        this.f54784a = i7;
        this.f54785b = str;
        this.f54786c = str2;
        this.d = str3;
        this.f54787e = z9;
        this.f54788f = i10;
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
        String str = this.f54786c;
        if (str != null) {
            n0Var.G = str;
        }
        String str2 = this.f54785b;
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
            if (this.f54784a == bVar.f54784a && Objects.equals(this.f54785b, bVar.f54785b) && Objects.equals(this.f54786c, bVar.f54786c) && Objects.equals(this.d, bVar.d) && this.f54787e == bVar.f54787e && this.f54788f == bVar.f54788f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        int i10;
        int i11 = (527 + this.f54784a) * 31;
        int i12 = 0;
        String str = this.f54785b;
        if (str != null) {
            i7 = str.hashCode();
        } else {
            i7 = 0;
        }
        int i13 = (i11 + i7) * 31;
        String str2 = this.f54786c;
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
        return ((((i14 + i12) * 31) + (this.f54787e ? 1 : 0)) * 31) + this.f54788f;
    }

    public final String toString() {
        return "IcyHeaders: name=\"" + this.f54786c + "\", genre=\"" + this.f54785b + "\", bitrate=" + this.f54784a + ", metadataInterval=" + this.f54788f;
    }
}
