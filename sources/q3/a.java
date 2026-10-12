package q3;

import b2.m0;
import j$.util.Objects;
import java.util.Arrays;
public final class a extends j {
    public final String f45867b;
    public final String f45868c;
    public final int d;
    public final byte[] f45869e;

    public a(int i10, String str, String str2, byte[] bArr) {
        super("APIC");
        this.f45867b = str;
        this.f45868c = str2;
        this.d = i10;
        this.f45869e = bArr;
    }

    @Override
    public final void b(m0 m0Var) {
        m0Var.a(this.d, this.f45869e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.d == aVar.d && Objects.equals(this.f45867b, aVar.f45867b) && Objects.equals(this.f45868c, aVar.f45868c) && Arrays.equals(this.f45869e, aVar.f45869e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11 = (527 + this.d) * 31;
        int i12 = 0;
        String str = this.f45867b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i13 = (i11 + i10) * 31;
        String str2 = this.f45868c;
        if (str2 != null) {
            i12 = str2.hashCode();
        }
        return Arrays.hashCode(this.f45869e) + ((i13 + i12) * 31);
    }

    @Override
    public final String toString() {
        return this.f45890a + ": mimeType=" + this.f45867b + ", description=" + this.f45868c;
    }
}
