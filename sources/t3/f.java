package t3;

import j$.util.Objects;
import java.util.Arrays;
public final class f extends i {
    public final String f55281b;
    public final String f55282c;
    public final String d;
    public final byte[] f55283e;

    public f(String str, byte[] bArr, String str2, String str3) {
        super("GEOB");
        this.f55281b = str;
        this.f55282c = str2;
        this.d = str3;
        this.f55283e = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && f.class == obj.getClass()) {
            f fVar = (f) obj;
            if (Objects.equals(this.f55281b, fVar.f55281b) && Objects.equals(this.f55282c, fVar.f55282c) && Objects.equals(this.d, fVar.d) && Arrays.equals(this.f55283e, fVar.f55283e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        int i10;
        int i11 = 0;
        String str = this.f55281b;
        if (str != null) {
            i7 = str.hashCode();
        } else {
            i7 = 0;
        }
        int i12 = (527 + i7) * 31;
        String str2 = this.f55282c;
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
        return Arrays.hashCode(this.f55283e) + ((i13 + i11) * 31);
    }

    @Override
    public final String toString() {
        return this.f55286a + ": mimeType=" + this.f55281b + ", filename=" + this.f55282c + ", description=" + this.d;
    }
}
