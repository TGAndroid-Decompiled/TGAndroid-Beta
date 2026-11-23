package t3;

import j$.util.Objects;
import java.util.Arrays;
public final class f extends i {
    public final String f57611b;
    public final String f57612c;
    public final String d;
    public final byte[] f57613e;

    public f(String str, byte[] bArr, String str2, String str3) {
        super("GEOB");
        this.f57611b = str;
        this.f57612c = str2;
        this.d = str3;
        this.f57613e = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && f.class == obj.getClass()) {
            f fVar = (f) obj;
            if (Objects.equals(this.f57611b, fVar.f57611b) && Objects.equals(this.f57612c, fVar.f57612c) && Objects.equals(this.d, fVar.d) && Arrays.equals(this.f57613e, fVar.f57613e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        int i10;
        int i11 = 0;
        String str = this.f57611b;
        if (str != null) {
            i7 = str.hashCode();
        } else {
            i7 = 0;
        }
        int i12 = (527 + i7) * 31;
        String str2 = this.f57612c;
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
        return Arrays.hashCode(this.f57613e) + ((i13 + i11) * 31);
    }

    @Override
    public final String toString() {
        return this.f57616a + ": mimeType=" + this.f57611b + ", filename=" + this.f57612c + ", description=" + this.d;
    }
}
