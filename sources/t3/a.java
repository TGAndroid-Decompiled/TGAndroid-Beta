package t3;

import e2.n0;
import j$.util.Objects;
import java.util.Arrays;
public final class a extends i {
    public final String f57561b;
    public final String f57562c;
    public final int d;
    public final byte[] f57563e;

    public a(int i7, String str, String str2, byte[] bArr) {
        super("APIC");
        this.f57561b = str;
        this.f57562c = str2;
        this.d = i7;
        this.f57563e = bArr;
    }

    @Override
    public final void b(n0 n0Var) {
        n0Var.a(this.d, this.f57563e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.d == aVar.d && Objects.equals(this.f57561b, aVar.f57561b) && Objects.equals(this.f57562c, aVar.f57562c) && Arrays.equals(this.f57563e, aVar.f57563e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        int i10 = (527 + this.d) * 31;
        int i11 = 0;
        String str = this.f57561b;
        if (str != null) {
            i7 = str.hashCode();
        } else {
            i7 = 0;
        }
        int i12 = (i10 + i7) * 31;
        String str2 = this.f57562c;
        if (str2 != null) {
            i11 = str2.hashCode();
        }
        return Arrays.hashCode(this.f57563e) + ((i12 + i11) * 31);
    }

    @Override
    public final String toString() {
        return this.f57581a + ": mimeType=" + this.f57561b + ", description=" + this.f57562c;
    }
}
