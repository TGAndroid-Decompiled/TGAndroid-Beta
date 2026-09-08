package q3;

import b2.m0;
import j$.util.Objects;
import java.util.Arrays;
public final class a extends j {
    public final String f44160b;
    public final String f44161c;
    public final int d;
    public final byte[] f44162e;

    public a(int i10, String str, String str2, byte[] bArr) {
        super("APIC");
        this.f44160b = str;
        this.f44161c = str2;
        this.d = i10;
        this.f44162e = bArr;
    }

    @Override
    public final void b(m0 m0Var) {
        m0Var.a(this.d, this.f44162e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.d == aVar.d && Objects.equals(this.f44160b, aVar.f44160b) && Objects.equals(this.f44161c, aVar.f44161c) && Arrays.equals(this.f44162e, aVar.f44162e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11 = (527 + this.d) * 31;
        int i12 = 0;
        String str = this.f44160b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i13 = (i11 + i10) * 31;
        String str2 = this.f44161c;
        if (str2 != null) {
            i12 = str2.hashCode();
        }
        return Arrays.hashCode(this.f44162e) + ((i13 + i12) * 31);
    }

    @Override
    public final String toString() {
        return this.f44183a + ": mimeType=" + this.f44160b + ", description=" + this.f44161c;
    }
}
