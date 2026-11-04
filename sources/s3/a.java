package s3;

import d2.p0;
import j$.util.Objects;
import java.util.Arrays;
public final class a extends i {
    public final String f54604b;
    public final String f54605c;
    public final int d;
    public final byte[] f54606e;

    public a(int i3, String str, String str2, byte[] bArr) {
        super("APIC");
        this.f54604b = str;
        this.f54605c = str2;
        this.d = i3;
        this.f54606e = bArr;
    }

    @Override
    public final void a(p0 p0Var) {
        p0Var.a(this.d, this.f54606e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.d == aVar.d && Objects.equals(this.f54604b, aVar.f54604b) && Objects.equals(this.f54605c, aVar.f54605c) && Arrays.equals(this.f54606e, aVar.f54606e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i3;
        int i10 = (527 + this.d) * 31;
        int i11 = 0;
        String str = this.f54604b;
        if (str != null) {
            i3 = str.hashCode();
        } else {
            i3 = 0;
        }
        int i12 = (i10 + i3) * 31;
        String str2 = this.f54605c;
        if (str2 != null) {
            i11 = str2.hashCode();
        }
        return Arrays.hashCode(this.f54606e) + ((i12 + i11) * 31);
    }

    @Override
    public final String toString() {
        return this.f54624a + ": mimeType=" + this.f54604b + ", description=" + this.f54605c;
    }
}
