package q3;

import b2.m0;
import j$.util.Objects;
import java.util.Arrays;
public final class a extends j {
    public final String f45875b;
    public final String f45876c;
    public final int d;
    public final byte[] f45877e;

    public a(int i10, String str, String str2, byte[] bArr) {
        super("APIC");
        this.f45875b = str;
        this.f45876c = str2;
        this.d = i10;
        this.f45877e = bArr;
    }

    @Override
    public final void b(m0 m0Var) {
        m0Var.a(this.d, this.f45877e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.d == aVar.d && Objects.equals(this.f45875b, aVar.f45875b) && Objects.equals(this.f45876c, aVar.f45876c) && Arrays.equals(this.f45877e, aVar.f45877e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11 = (527 + this.d) * 31;
        int i12 = 0;
        String str = this.f45875b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i13 = (i11 + i10) * 31;
        String str2 = this.f45876c;
        if (str2 != null) {
            i12 = str2.hashCode();
        }
        return Arrays.hashCode(this.f45877e) + ((i13 + i12) * 31);
    }

    @Override
    public final String toString() {
        return this.f45898a + ": mimeType=" + this.f45875b + ", description=" + this.f45876c;
    }
}
