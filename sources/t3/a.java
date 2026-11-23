package t3;

import e2.n0;
import j$.util.Objects;
import java.util.Arrays;
public final class a extends i {
    public final String f57596b;
    public final String f57597c;
    public final int d;
    public final byte[] f57598e;

    public a(int i7, String str, String str2, byte[] bArr) {
        super("APIC");
        this.f57596b = str;
        this.f57597c = str2;
        this.d = i7;
        this.f57598e = bArr;
    }

    @Override
    public final void b(n0 n0Var) {
        n0Var.a(this.d, this.f57598e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.d == aVar.d && Objects.equals(this.f57596b, aVar.f57596b) && Objects.equals(this.f57597c, aVar.f57597c) && Arrays.equals(this.f57598e, aVar.f57598e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        int i10 = (527 + this.d) * 31;
        int i11 = 0;
        String str = this.f57596b;
        if (str != null) {
            i7 = str.hashCode();
        } else {
            i7 = 0;
        }
        int i12 = (i10 + i7) * 31;
        String str2 = this.f57597c;
        if (str2 != null) {
            i11 = str2.hashCode();
        }
        return Arrays.hashCode(this.f57598e) + ((i12 + i11) * 31);
    }

    @Override
    public final String toString() {
        return this.f57616a + ": mimeType=" + this.f57596b + ", description=" + this.f57597c;
    }
}
