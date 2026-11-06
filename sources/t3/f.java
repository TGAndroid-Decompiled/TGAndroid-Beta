package t3;

import j$.util.Objects;
import java.util.Arrays;
public final class f extends i {
    public final String f55305b;
    public final String f55306c;
    public final String d;
    public final byte[] f55307e;

    public f(String str, byte[] bArr, String str2, String str3) {
        super("GEOB");
        this.f55305b = str;
        this.f55306c = str2;
        this.d = str3;
        this.f55307e = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && f.class == obj.getClass()) {
            f fVar = (f) obj;
            if (Objects.equals(this.f55305b, fVar.f55305b) && Objects.equals(this.f55306c, fVar.f55306c) && Objects.equals(this.d, fVar.d) && Arrays.equals(this.f55307e, fVar.f55307e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        int i10;
        int i11 = 0;
        String str = this.f55305b;
        if (str != null) {
            i7 = str.hashCode();
        } else {
            i7 = 0;
        }
        int i12 = (527 + i7) * 31;
        String str2 = this.f55306c;
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
        return Arrays.hashCode(this.f55307e) + ((i13 + i11) * 31);
    }

    @Override
    public final String toString() {
        return this.f55310a + ": mimeType=" + this.f55305b + ", filename=" + this.f55306c + ", description=" + this.d;
    }
}
