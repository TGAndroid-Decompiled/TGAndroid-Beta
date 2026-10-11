package q3;

import j$.util.Objects;
import java.util.Arrays;
public final class f extends j {
    public final String f46020b;
    public final String f46021c;
    public final String d;
    public final byte[] f46022e;

    public f(String str, byte[] bArr, String str2, String str3) {
        super("GEOB");
        this.f46020b = str;
        this.f46021c = str2;
        this.d = str3;
        this.f46022e = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && f.class == obj.getClass()) {
            f fVar = (f) obj;
            if (Objects.equals(this.f46020b, fVar.f46020b) && Objects.equals(this.f46021c, fVar.f46021c) && Objects.equals(this.d, fVar.d) && Arrays.equals(this.f46022e, fVar.f46022e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int i12 = 0;
        String str = this.f46020b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i13 = (527 + i10) * 31;
        String str2 = this.f46021c;
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
        return Arrays.hashCode(this.f46022e) + ((i14 + i12) * 31);
    }

    @Override
    public final String toString() {
        return this.f46028a + ": mimeType=" + this.f46020b + ", filename=" + this.f46021c + ", description=" + this.d;
    }
}
