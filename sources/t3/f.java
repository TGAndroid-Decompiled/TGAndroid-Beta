package t3;

import j$.util.Objects;
import java.util.Arrays;
public final class f extends i {
    public final String f57576b;
    public final String f57577c;
    public final String d;
    public final byte[] f57578e;

    public f(String str, byte[] bArr, String str2, String str3) {
        super("GEOB");
        this.f57576b = str;
        this.f57577c = str2;
        this.d = str3;
        this.f57578e = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && f.class == obj.getClass()) {
            f fVar = (f) obj;
            if (Objects.equals(this.f57576b, fVar.f57576b) && Objects.equals(this.f57577c, fVar.f57577c) && Objects.equals(this.d, fVar.d) && Arrays.equals(this.f57578e, fVar.f57578e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        int i10;
        int i11 = 0;
        String str = this.f57576b;
        if (str != null) {
            i7 = str.hashCode();
        } else {
            i7 = 0;
        }
        int i12 = (527 + i7) * 31;
        String str2 = this.f57577c;
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
        return Arrays.hashCode(this.f57578e) + ((i13 + i11) * 31);
    }

    @Override
    public final String toString() {
        return this.f57581a + ": mimeType=" + this.f57576b + ", filename=" + this.f57577c + ", description=" + this.d;
    }
}
