package q3;

import j$.util.Objects;
import java.util.Arrays;
public final class f extends j {
    public final String f45989b;
    public final String f45990c;
    public final String d;
    public final byte[] f45991e;

    public f(String str, byte[] bArr, String str2, String str3) {
        super("GEOB");
        this.f45989b = str;
        this.f45990c = str2;
        this.d = str3;
        this.f45991e = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && f.class == obj.getClass()) {
            f fVar = (f) obj;
            if (Objects.equals(this.f45989b, fVar.f45989b) && Objects.equals(this.f45990c, fVar.f45990c) && Objects.equals(this.d, fVar.d) && Arrays.equals(this.f45991e, fVar.f45991e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int i12 = 0;
        String str = this.f45989b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i13 = (527 + i10) * 31;
        String str2 = this.f45990c;
        if (str2 != null) {
            i11 = str2.hashCode();
        } else {
            i11 = 0;
        }
        int i14 = (i13 + i11) * 31;
        String str3 = this.d;
        if (str3 != null) {
            i12 = str3.hashCode();
        }
        return Arrays.hashCode(this.f45991e) + ((i14 + i12) * 31);
    }

    @Override
    public final String toString() {
        return this.f45997a + ": mimeType=" + this.f45989b + ", filename=" + this.f45990c + ", description=" + this.d;
    }
}
