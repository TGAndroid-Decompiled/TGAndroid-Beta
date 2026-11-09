package t3;

import e2.n0;
import j$.util.Objects;
import java.util.Arrays;
public final class a extends i {
    public final String f55395b;
    public final String f55396c;
    public final int d;
    public final byte[] f55397e;

    public a(int i7, String str, String str2, byte[] bArr) {
        super("APIC");
        this.f55395b = str;
        this.f55396c = str2;
        this.d = i7;
        this.f55397e = bArr;
    }

    @Override
    public final void b(n0 n0Var) {
        n0Var.a(this.d, this.f55397e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.d == aVar.d && Objects.equals(this.f55395b, aVar.f55395b) && Objects.equals(this.f55396c, aVar.f55396c) && Arrays.equals(this.f55397e, aVar.f55397e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        int i10 = (527 + this.d) * 31;
        int i11 = 0;
        String str = this.f55395b;
        if (str != null) {
            i7 = str.hashCode();
        } else {
            i7 = 0;
        }
        int i12 = (i10 + i7) * 31;
        String str2 = this.f55396c;
        if (str2 != null) {
            i11 = str2.hashCode();
        }
        return Arrays.hashCode(this.f55397e) + ((i12 + i11) * 31);
    }

    @Override
    public final String toString() {
        return this.f55415a + ": mimeType=" + this.f55395b + ", description=" + this.f55396c;
    }
}
