package q3;

import b2.m0;
import j$.util.Objects;
import java.util.Arrays;
public final class a extends j {
    public final String f44767b;
    public final String f44768c;
    public final int d;
    public final byte[] f44769e;

    public a(int i10, String str, String str2, byte[] bArr) {
        super("APIC");
        this.f44767b = str;
        this.f44768c = str2;
        this.d = i10;
        this.f44769e = bArr;
    }

    @Override
    public final void b(m0 m0Var) {
        m0Var.a(this.d, this.f44769e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.d == aVar.d && Objects.equals(this.f44767b, aVar.f44767b) && Objects.equals(this.f44768c, aVar.f44768c) && Arrays.equals(this.f44769e, aVar.f44769e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11 = (527 + this.d) * 31;
        int i12 = 0;
        String str = this.f44767b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i13 = (i11 + i10) * 31;
        String str2 = this.f44768c;
        if (str2 != null) {
            i12 = str2.hashCode();
        }
        return Arrays.hashCode(this.f44769e) + ((i13 + i12) * 31);
    }

    @Override
    public final String toString() {
        return this.f44790a + ": mimeType=" + this.f44767b + ", description=" + this.f44768c;
    }
}
