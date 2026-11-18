package t3;

import e2.n0;
import j$.util.Objects;
import java.util.Arrays;
public final class a extends i {
    public final String f57553b;
    public final String f57554c;
    public final int d;
    public final byte[] f57555e;

    public a(int i7, String str, String str2, byte[] bArr) {
        super("APIC");
        this.f57553b = str;
        this.f57554c = str2;
        this.d = i7;
        this.f57555e = bArr;
    }

    @Override
    public final void b(n0 n0Var) {
        n0Var.a(this.d, this.f57555e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.d == aVar.d && Objects.equals(this.f57553b, aVar.f57553b) && Objects.equals(this.f57554c, aVar.f57554c) && Arrays.equals(this.f57555e, aVar.f57555e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        int i10 = (527 + this.d) * 31;
        int i11 = 0;
        String str = this.f57553b;
        if (str != null) {
            i7 = str.hashCode();
        } else {
            i7 = 0;
        }
        int i12 = (i10 + i7) * 31;
        String str2 = this.f57554c;
        if (str2 != null) {
            i11 = str2.hashCode();
        }
        return Arrays.hashCode(this.f57555e) + ((i12 + i11) * 31);
    }

    @Override
    public final String toString() {
        return this.f57573a + ": mimeType=" + this.f57553b + ", description=" + this.f57554c;
    }
}
