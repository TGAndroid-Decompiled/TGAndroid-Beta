package q3;

import j$.util.Objects;
import java.util.Arrays;
public final class f extends j {
    public final String f45890b;
    public final String f45891c;
    public final String d;
    public final byte[] f45892e;

    public f(String str, byte[] bArr, String str2, String str3) {
        super("GEOB");
        this.f45890b = str;
        this.f45891c = str2;
        this.d = str3;
        this.f45892e = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && f.class == obj.getClass()) {
            f fVar = (f) obj;
            if (Objects.equals(this.f45890b, fVar.f45890b) && Objects.equals(this.f45891c, fVar.f45891c) && Objects.equals(this.d, fVar.d) && Arrays.equals(this.f45892e, fVar.f45892e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int i12 = 0;
        String str = this.f45890b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i13 = (527 + i10) * 31;
        String str2 = this.f45891c;
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
        return Arrays.hashCode(this.f45892e) + ((i14 + i12) * 31);
    }

    @Override
    public final String toString() {
        return this.f45898a + ": mimeType=" + this.f45890b + ", filename=" + this.f45891c + ", description=" + this.d;
    }
}
