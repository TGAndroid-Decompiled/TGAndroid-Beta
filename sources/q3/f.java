package q3;

import j$.util.Objects;
import java.util.Arrays;
public final class f extends i {
    public final String f44371b;
    public final String f44372c;
    public final String d;
    public final byte[] e;

    public f(String str, byte[] bArr, String str2, String str3) {
        super("GEOB");
        this.f44371b = str;
        this.f44372c = str2;
        this.d = str3;
        this.e = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && f.class == obj.getClass()) {
            f fVar = (f) obj;
            if (Objects.equals(this.f44371b, fVar.f44371b) && Objects.equals(this.f44372c, fVar.f44372c) && Objects.equals(this.d, fVar.d) && Arrays.equals(this.e, fVar.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int i12 = 0;
        String str = this.f44371b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i13 = (527 + i10) * 31;
        String str2 = this.f44372c;
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
        return Arrays.hashCode(this.e) + ((i14 + i12) * 31);
    }

    @Override
    public final String toString() {
        return this.f44375a + ": mimeType=" + this.f44371b + ", filename=" + this.f44372c + ", description=" + this.d;
    }
}
