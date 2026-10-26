package q3;

import j$.util.Objects;
import java.util.Arrays;
public final class f extends i {
    public final String f46939b;
    public final String f46940c;
    public final String d;
    public final byte[] e;

    public f(String str, byte[] bArr, String str2, String str3) {
        super("GEOB");
        this.f46939b = str;
        this.f46940c = str2;
        this.d = str3;
        this.e = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && f.class == obj.getClass()) {
            f fVar = (f) obj;
            if (Objects.equals(this.f46939b, fVar.f46939b) && Objects.equals(this.f46940c, fVar.f46940c) && Objects.equals(this.d, fVar.d) && Arrays.equals(this.e, fVar.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int i12 = 0;
        String str = this.f46939b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i13 = (527 + i10) * 31;
        String str2 = this.f46940c;
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
        return this.f46943a + ": mimeType=" + this.f46939b + ", filename=" + this.f46940c + ", description=" + this.d;
    }
}
