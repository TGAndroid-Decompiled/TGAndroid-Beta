package q3;

import b2.m0;
import j$.util.Objects;
import java.util.Arrays;
public final class a extends j {
    public final String f45974b;
    public final String f45975c;
    public final int d;
    public final byte[] f45976e;

    public a(int i10, String str, String str2, byte[] bArr) {
        super("APIC");
        this.f45974b = str;
        this.f45975c = str2;
        this.d = i10;
        this.f45976e = bArr;
    }

    @Override
    public final void b(m0 m0Var) {
        m0Var.a(this.d, this.f45976e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.d == aVar.d && Objects.equals(this.f45974b, aVar.f45974b) && Objects.equals(this.f45975c, aVar.f45975c) && Arrays.equals(this.f45976e, aVar.f45976e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11 = (527 + this.d) * 31;
        int i12 = 0;
        String str = this.f45974b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i13 = (i11 + i10) * 31;
        String str2 = this.f45975c;
        if (str2 != null) {
            i12 = str2.hashCode();
        }
        return Arrays.hashCode(this.f45976e) + ((i13 + i12) * 31);
    }

    @Override
    public final String toString() {
        return this.f45997a + ": mimeType=" + this.f45974b + ", description=" + this.f45975c;
    }
}
