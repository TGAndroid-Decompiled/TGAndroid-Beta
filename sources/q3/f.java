package q3;

import j$.util.Objects;
import java.util.Arrays;
public final class f extends j {
    public final String f44774b;
    public final String f44775c;
    public final String d;
    public final byte[] f44776e;

    public f(String str, byte[] bArr, String str2, String str3) {
        super("GEOB");
        this.f44774b = str;
        this.f44775c = str2;
        this.d = str3;
        this.f44776e = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && f.class == obj.getClass()) {
            f fVar = (f) obj;
            if (Objects.equals(this.f44774b, fVar.f44774b) && Objects.equals(this.f44775c, fVar.f44775c) && Objects.equals(this.d, fVar.d) && Arrays.equals(this.f44776e, fVar.f44776e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int i12 = 0;
        String str = this.f44774b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i13 = (527 + i10) * 31;
        String str2 = this.f44775c;
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
        return Arrays.hashCode(this.f44776e) + ((i14 + i12) * 31);
    }

    @Override
    public final String toString() {
        return this.f44782a + ": mimeType=" + this.f44774b + ", filename=" + this.f44775c + ", description=" + this.d;
    }
}
