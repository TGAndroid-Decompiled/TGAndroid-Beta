package s3;

import j$.util.Objects;
import java.util.Arrays;
public final class f extends i {
    public final String f54619b;
    public final String f54620c;
    public final String d;
    public final byte[] f54621e;

    public f(String str, byte[] bArr, String str2, String str3) {
        super("GEOB");
        this.f54619b = str;
        this.f54620c = str2;
        this.d = str3;
        this.f54621e = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && f.class == obj.getClass()) {
            f fVar = (f) obj;
            if (Objects.equals(this.f54619b, fVar.f54619b) && Objects.equals(this.f54620c, fVar.f54620c) && Objects.equals(this.d, fVar.d) && Arrays.equals(this.f54621e, fVar.f54621e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i3;
        int i10;
        int i11 = 0;
        String str = this.f54619b;
        if (str != null) {
            i3 = str.hashCode();
        } else {
            i3 = 0;
        }
        int i12 = (527 + i3) * 31;
        String str2 = this.f54620c;
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
        return Arrays.hashCode(this.f54621e) + ((i13 + i11) * 31);
    }

    @Override
    public final String toString() {
        return this.f54624a + ": mimeType=" + this.f54619b + ", filename=" + this.f54620c + ", description=" + this.d;
    }
}
