package q3;

import b2.m0;
import j$.util.Objects;
import java.util.Arrays;
public final class a extends j {
    public final String f46005b;
    public final String f46006c;
    public final int d;
    public final byte[] f46007e;

    public a(int i10, String str, String str2, byte[] bArr) {
        super("APIC");
        this.f46005b = str;
        this.f46006c = str2;
        this.d = i10;
        this.f46007e = bArr;
    }

    @Override
    public final void b(m0 m0Var) {
        m0Var.a(this.d, this.f46007e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.d == aVar.d && Objects.equals(this.f46005b, aVar.f46005b) && Objects.equals(this.f46006c, aVar.f46006c) && Arrays.equals(this.f46007e, aVar.f46007e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11 = (527 + this.d) * 31;
        int i12 = 0;
        String str = this.f46005b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i13 = (i11 + i10) * 31;
        String str2 = this.f46006c;
        if (str2 != null) {
            i12 = str2.hashCode();
        }
        return Arrays.hashCode(this.f46007e) + ((i13 + i12) * 31);
    }

    @Override
    public final String toString() {
        return this.f46028a + ": mimeType=" + this.f46005b + ", description=" + this.f46006c;
    }
}
