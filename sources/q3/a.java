package q3;

import b2.r0;
import j$.util.Objects;
import java.util.Arrays;
public final class a extends i {
    public final String f46962b;
    public final String f46963c;
    public final int d;
    public final byte[] e;

    public a(int i10, String str, String str2, byte[] bArr) {
        super("APIC");
        this.f46962b = str;
        this.f46963c = str2;
        this.d = i10;
        this.e = bArr;
    }

    @Override
    public final void b(r0 r0Var) {
        r0Var.a(this.d, this.e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.d == aVar.d && Objects.equals(this.f46962b, aVar.f46962b) && Objects.equals(this.f46963c, aVar.f46963c) && Arrays.equals(this.e, aVar.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11 = (527 + this.d) * 31;
        int i12 = 0;
        String str = this.f46962b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i13 = (i11 + i10) * 31;
        String str2 = this.f46963c;
        if (str2 != null) {
            i12 = str2.hashCode();
        }
        return Arrays.hashCode(this.e) + ((i13 + i12) * 31);
    }

    @Override
    public final String toString() {
        return this.f46978a + ": mimeType=" + this.f46962b + ", description=" + this.f46963c;
    }
}
