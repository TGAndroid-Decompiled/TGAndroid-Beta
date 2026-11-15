package t3;

import e2.n0;
import j$.util.Objects;
import java.util.Arrays;
public final class a extends i {
    public final String f56977b;
    public final String f56978c;
    public final int d;
    public final byte[] f56979e;

    public a(int i7, String str, String str2, byte[] bArr) {
        super("APIC");
        this.f56977b = str;
        this.f56978c = str2;
        this.d = i7;
        this.f56979e = bArr;
    }

    @Override
    public final void b(n0 n0Var) {
        n0Var.a(this.d, this.f56979e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.d == aVar.d && Objects.equals(this.f56977b, aVar.f56977b) && Objects.equals(this.f56978c, aVar.f56978c) && Arrays.equals(this.f56979e, aVar.f56979e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        int i10 = (527 + this.d) * 31;
        int i11 = 0;
        String str = this.f56977b;
        if (str != null) {
            i7 = str.hashCode();
        } else {
            i7 = 0;
        }
        int i12 = (i10 + i7) * 31;
        String str2 = this.f56978c;
        if (str2 != null) {
            i11 = str2.hashCode();
        }
        return Arrays.hashCode(this.f56979e) + ((i12 + i11) * 31);
    }

    @Override
    public final String toString() {
        return this.f56997a + ": mimeType=" + this.f56977b + ", description=" + this.f56978c;
    }
}
