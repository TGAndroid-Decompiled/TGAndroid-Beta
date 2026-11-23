package s3;

import a8.ma;
import e2.n0;
import e2.p0;
import e2.u;
import j$.util.Objects;
public final class b implements p0 {
    public final int f57037a;
    public final String f57038b;
    public final String f57039c;
    public final String d;
    public final boolean f57040e;
    public final int f57041f;

    public b(int i7, String str, String str2, String str3, boolean z10, int i10) {
        boolean z11;
        if (i10 != -1 && i10 <= 0) {
            z11 = false;
        } else {
            z11 = true;
        }
        ma.f(z11);
        this.f57037a = i7;
        this.f57038b = str;
        this.f57039c = str2;
        this.d = str3;
        this.f57040e = z10;
        this.f57041f = i10;
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
        String str = this.f57039c;
        if (str != null) {
            n0Var.G = str;
        }
        String str2 = this.f57038b;
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
            if (this.f57037a == bVar.f57037a && Objects.equals(this.f57038b, bVar.f57038b) && Objects.equals(this.f57039c, bVar.f57039c) && Objects.equals(this.d, bVar.d) && this.f57040e == bVar.f57040e && this.f57041f == bVar.f57041f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        int i10;
        int i11 = (527 + this.f57037a) * 31;
        int i12 = 0;
        String str = this.f57038b;
        if (str != null) {
            i7 = str.hashCode();
        } else {
            i7 = 0;
        }
        int i13 = (i11 + i7) * 31;
        String str2 = this.f57039c;
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
        return ((((i14 + i12) * 31) + (this.f57040e ? 1 : 0)) * 31) + this.f57041f;
    }

    public final String toString() {
        return "IcyHeaders: name=\"" + this.f57039c + "\", genre=\"" + this.f57038b + "\", bitrate=" + this.f57037a + ", metadataInterval=" + this.f57041f;
    }
}
