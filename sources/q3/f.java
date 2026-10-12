package q3;

import j$.util.Objects;
import java.util.Arrays;
public final class f extends j {
    public final String f45882b;
    public final String f45883c;
    public final String d;
    public final byte[] f45884e;

    public f(String str, byte[] bArr, String str2, String str3) {
        super("GEOB");
        this.f45882b = str;
        this.f45883c = str2;
        this.d = str3;
        this.f45884e = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && f.class == obj.getClass()) {
            f fVar = (f) obj;
            if (Objects.equals(this.f45882b, fVar.f45882b) && Objects.equals(this.f45883c, fVar.f45883c) && Objects.equals(this.d, fVar.d) && Arrays.equals(this.f45884e, fVar.f45884e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int i12 = 0;
        String str = this.f45882b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i13 = (527 + i10) * 31;
        String str2 = this.f45883c;
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
        return Arrays.hashCode(this.f45884e) + ((i14 + i12) * 31);
    }

    @Override
    public final String toString() {
        return this.f45890a + ": mimeType=" + this.f45882b + ", filename=" + this.f45883c + ", description=" + this.d;
    }
}
