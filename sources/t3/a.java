package t3;

import e2.n0;
import j$.util.Objects;
import java.util.Arrays;
public final class a extends i {
    public final String f57592b;
    public final String f57593c;
    public final int d;
    public final byte[] f57594e;

    public a(int i7, String str, String str2, byte[] bArr) {
        super("APIC");
        this.f57592b = str;
        this.f57593c = str2;
        this.d = i7;
        this.f57594e = bArr;
    }

    @Override
    public final void b(n0 n0Var) {
        n0Var.a(this.d, this.f57594e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.d == aVar.d && Objects.equals(this.f57592b, aVar.f57592b) && Objects.equals(this.f57593c, aVar.f57593c) && Arrays.equals(this.f57594e, aVar.f57594e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        int i10 = (527 + this.d) * 31;
        int i11 = 0;
        String str = this.f57592b;
        if (str != null) {
            i7 = str.hashCode();
        } else {
            i7 = 0;
        }
        int i12 = (i10 + i7) * 31;
        String str2 = this.f57593c;
        if (str2 != null) {
            i11 = str2.hashCode();
        }
        return Arrays.hashCode(this.f57594e) + ((i12 + i11) * 31);
    }

    @Override
    public final String toString() {
        return this.f57612a + ": mimeType=" + this.f57592b + ", description=" + this.f57593c;
    }
}
