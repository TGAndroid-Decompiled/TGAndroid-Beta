package t3;

import e2.n0;
import j$.util.Objects;
import java.util.Arrays;
public final class a extends i {
    public final String f55291b;
    public final String f55292c;
    public final int d;
    public final byte[] f55293e;

    public a(int i7, String str, String str2, byte[] bArr) {
        super("APIC");
        this.f55291b = str;
        this.f55292c = str2;
        this.d = i7;
        this.f55293e = bArr;
    }

    @Override
    public final void b(n0 n0Var) {
        n0Var.a(this.d, this.f55293e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.d == aVar.d && Objects.equals(this.f55291b, aVar.f55291b) && Objects.equals(this.f55292c, aVar.f55292c) && Arrays.equals(this.f55293e, aVar.f55293e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        int i10 = (527 + this.d) * 31;
        int i11 = 0;
        String str = this.f55291b;
        if (str != null) {
            i7 = str.hashCode();
        } else {
            i7 = 0;
        }
        int i12 = (i10 + i7) * 31;
        String str2 = this.f55292c;
        if (str2 != null) {
            i11 = str2.hashCode();
        }
        return Arrays.hashCode(this.f55293e) + ((i12 + i11) * 31);
    }

    @Override
    public final String toString() {
        return this.f55311a + ": mimeType=" + this.f55291b + ", description=" + this.f55292c;
    }
}
