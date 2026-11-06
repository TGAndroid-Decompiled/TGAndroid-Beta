package t3;

import e2.n0;
import j$.util.Objects;
import java.util.Arrays;
public final class a extends i {
    public final String f55266b;
    public final String f55267c;
    public final int d;
    public final byte[] f55268e;

    public a(int i7, String str, String str2, byte[] bArr) {
        super("APIC");
        this.f55266b = str;
        this.f55267c = str2;
        this.d = i7;
        this.f55268e = bArr;
    }

    @Override
    public final void b(n0 n0Var) {
        n0Var.a(this.d, this.f55268e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.d == aVar.d && Objects.equals(this.f55266b, aVar.f55266b) && Objects.equals(this.f55267c, aVar.f55267c) && Arrays.equals(this.f55268e, aVar.f55268e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        int i10 = (527 + this.d) * 31;
        int i11 = 0;
        String str = this.f55266b;
        if (str != null) {
            i7 = str.hashCode();
        } else {
            i7 = 0;
        }
        int i12 = (i10 + i7) * 31;
        String str2 = this.f55267c;
        if (str2 != null) {
            i11 = str2.hashCode();
        }
        return Arrays.hashCode(this.f55268e) + ((i12 + i11) * 31);
    }

    @Override
    public final String toString() {
        return this.f55286a + ": mimeType=" + this.f55266b + ", description=" + this.f55267c;
    }
}
