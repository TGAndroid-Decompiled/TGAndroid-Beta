package q3;

import b2.m0;
import j$.util.Objects;
import java.util.Arrays;
public final class a extends j {
    public final String f45928b;
    public final String f45929c;
    public final int d;
    public final byte[] f45930e;

    public a(int i10, String str, String str2, byte[] bArr) {
        super("APIC");
        this.f45928b = str;
        this.f45929c = str2;
        this.d = i10;
        this.f45930e = bArr;
    }

    @Override
    public final void b(m0 m0Var) {
        m0Var.a(this.d, this.f45930e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.d == aVar.d && Objects.equals(this.f45928b, aVar.f45928b) && Objects.equals(this.f45929c, aVar.f45929c) && Arrays.equals(this.f45930e, aVar.f45930e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11 = (527 + this.d) * 31;
        int i12 = 0;
        String str = this.f45928b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i13 = (i11 + i10) * 31;
        String str2 = this.f45929c;
        if (str2 != null) {
            i12 = str2.hashCode();
        }
        return Arrays.hashCode(this.f45930e) + ((i13 + i12) * 31);
    }

    @Override
    public final String toString() {
        return this.f45951a + ": mimeType=" + this.f45928b + ", description=" + this.f45929c;
    }
}
