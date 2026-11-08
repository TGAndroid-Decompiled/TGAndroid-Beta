package t3;

import e2.n0;
import j$.util.Objects;
import java.util.Arrays;
public final class a extends i {
    public final String f55383b;
    public final String f55384c;
    public final int d;
    public final byte[] f55385e;

    public a(int i7, String str, String str2, byte[] bArr) {
        super("APIC");
        this.f55383b = str;
        this.f55384c = str2;
        this.d = i7;
        this.f55385e = bArr;
    }

    @Override
    public final void b(n0 n0Var) {
        n0Var.a(this.d, this.f55385e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.d == aVar.d && Objects.equals(this.f55383b, aVar.f55383b) && Objects.equals(this.f55384c, aVar.f55384c) && Arrays.equals(this.f55385e, aVar.f55385e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        int i10 = (527 + this.d) * 31;
        int i11 = 0;
        String str = this.f55383b;
        if (str != null) {
            i7 = str.hashCode();
        } else {
            i7 = 0;
        }
        int i12 = (i10 + i7) * 31;
        String str2 = this.f55384c;
        if (str2 != null) {
            i11 = str2.hashCode();
        }
        return Arrays.hashCode(this.f55385e) + ((i12 + i11) * 31);
    }

    @Override
    public final String toString() {
        return this.f55403a + ": mimeType=" + this.f55383b + ", description=" + this.f55384c;
    }
}
