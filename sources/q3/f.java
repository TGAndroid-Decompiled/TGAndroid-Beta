package q3;

import j$.util.Objects;
import java.util.Arrays;
public final class f extends j {
    public final String f46054b;
    public final String f46055c;
    public final String d;
    public final byte[] f46056e;

    public f(String str, byte[] bArr, String str2, String str3) {
        super("GEOB");
        this.f46054b = str;
        this.f46055c = str2;
        this.d = str3;
        this.f46056e = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && f.class == obj.getClass()) {
            f fVar = (f) obj;
            if (Objects.equals(this.f46054b, fVar.f46054b) && Objects.equals(this.f46055c, fVar.f46055c) && Objects.equals(this.d, fVar.d) && Arrays.equals(this.f46056e, fVar.f46056e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int i12 = 0;
        String str = this.f46054b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i13 = (527 + i10) * 31;
        String str2 = this.f46055c;
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
        return Arrays.hashCode(this.f46056e) + ((i14 + i12) * 31);
    }

    @Override
    public final String toString() {
        return this.f46062a + ": mimeType=" + this.f46054b + ", filename=" + this.f46055c + ", description=" + this.d;
    }
}
