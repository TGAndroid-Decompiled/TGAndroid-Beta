package t3;

import j$.util.Objects;
import java.util.Arrays;
public final class f extends i {
    public final String f55397b;
    public final String f55398c;
    public final String d;
    public final byte[] f55399e;

    public f(String str, byte[] bArr, String str2, String str3) {
        super("GEOB");
        this.f55397b = str;
        this.f55398c = str2;
        this.d = str3;
        this.f55399e = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && f.class == obj.getClass()) {
            f fVar = (f) obj;
            if (Objects.equals(this.f55397b, fVar.f55397b) && Objects.equals(this.f55398c, fVar.f55398c) && Objects.equals(this.d, fVar.d) && Arrays.equals(this.f55399e, fVar.f55399e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        int i10;
        int i11 = 0;
        String str = this.f55397b;
        if (str != null) {
            i7 = str.hashCode();
        } else {
            i7 = 0;
        }
        int i12 = (527 + i7) * 31;
        String str2 = this.f55398c;
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
        return Arrays.hashCode(this.f55399e) + ((i13 + i11) * 31);
    }

    @Override
    public final String toString() {
        return this.f55402a + ": mimeType=" + this.f55397b + ", filename=" + this.f55398c + ", description=" + this.d;
    }
}
