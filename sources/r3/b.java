package r3;

import b8.zb;
import d2.p0;
import d2.r0;
import d2.v;
import j$.util.Objects;
public final class b implements r0 {
    public final int f54237a;
    public final String f54238b;
    public final String f54239c;
    public final String d;
    public final boolean f54240e;
    public final int f54241f;

    public b(int i3, String str, String str2, String str3, boolean z10, int i10) {
        boolean z11;
        if (i10 != -1 && i10 <= 0) {
            z11 = false;
        } else {
            z11 = true;
        }
        zb.f(z11);
        this.f54237a = i3;
        this.f54238b = str;
        this.f54239c = str2;
        this.d = str3;
        this.f54240e = z10;
        this.f54241f = i10;
    }

    public static r3.b d(java.util.Map r14) {
        throw new UnsupportedOperationException("Method not decompiled: r3.b.d(java.util.Map):r3.b");
    }

    @Override
    public final void a(p0 p0Var) {
        String str = this.f54239c;
        if (str != null) {
            p0Var.G = str;
        }
        String str2 = this.f54238b;
        if (str2 != null) {
            p0Var.E = str2;
        }
    }

    @Override
    public final v b() {
        return null;
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
            if (this.f54237a == bVar.f54237a && Objects.equals(this.f54238b, bVar.f54238b) && Objects.equals(this.f54239c, bVar.f54239c) && Objects.equals(this.d, bVar.d) && this.f54240e == bVar.f54240e && this.f54241f == bVar.f54241f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i3;
        int i10;
        int i11 = (527 + this.f54237a) * 31;
        int i12 = 0;
        String str = this.f54238b;
        if (str != null) {
            i3 = str.hashCode();
        } else {
            i3 = 0;
        }
        int i13 = (i11 + i3) * 31;
        String str2 = this.f54239c;
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
        return ((((i14 + i12) * 31) + (this.f54240e ? 1 : 0)) * 31) + this.f54241f;
    }

    public final String toString() {
        return "IcyHeaders: name=\"" + this.f54239c + "\", genre=\"" + this.f54238b + "\", bitrate=" + this.f54237a + ", metadataInterval=" + this.f54241f;
    }
}
