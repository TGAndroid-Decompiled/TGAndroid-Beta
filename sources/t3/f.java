package t3;

import j$.util.Objects;
import java.util.Arrays;
public final class f extends i {
    public final String f55398b;
    public final String f55399c;
    public final String d;
    public final byte[] f55400e;

    public f(String str, byte[] bArr, String str2, String str3) {
        super("GEOB");
        this.f55398b = str;
        this.f55399c = str2;
        this.d = str3;
        this.f55400e = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && f.class == obj.getClass()) {
            f fVar = (f) obj;
            if (Objects.equals(this.f55398b, fVar.f55398b) && Objects.equals(this.f55399c, fVar.f55399c) && Objects.equals(this.d, fVar.d) && Arrays.equals(this.f55400e, fVar.f55400e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        int i10;
        int i11 = 0;
        String str = this.f55398b;
        if (str != null) {
            i7 = str.hashCode();
        } else {
            i7 = 0;
        }
        int i12 = (527 + i7) * 31;
        String str2 = this.f55399c;
        if (str2 != null) {
            i10 = str2.hashCode();
        } else {
            i10 = 0;
        }
        int i13 = (i12 + i10) * 31;
        String str3 = this.d;
        if (str3 != null) {
            i11 = str3.hashCode();
        }
        return Arrays.hashCode(this.f55400e) + ((i13 + i11) * 31);
    }

    @Override
    public final String toString() {
        return this.f55403a + ": mimeType=" + this.f55398b + ", filename=" + this.f55399c + ", description=" + this.d;
    }
}
