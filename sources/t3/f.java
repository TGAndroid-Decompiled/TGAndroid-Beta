package t3;

import j$.util.Objects;
import java.util.Arrays;
public final class f extends i {
    public final String f57568b;
    public final String f57569c;
    public final String d;
    public final byte[] f57570e;

    public f(String str, byte[] bArr, String str2, String str3) {
        super("GEOB");
        this.f57568b = str;
        this.f57569c = str2;
        this.d = str3;
        this.f57570e = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && f.class == obj.getClass()) {
            f fVar = (f) obj;
            if (Objects.equals(this.f57568b, fVar.f57568b) && Objects.equals(this.f57569c, fVar.f57569c) && Objects.equals(this.d, fVar.d) && Arrays.equals(this.f57570e, fVar.f57570e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        int i10;
        int i11 = 0;
        String str = this.f57568b;
        if (str != null) {
            i7 = str.hashCode();
        } else {
            i7 = 0;
        }
        int i12 = (527 + i7) * 31;
        String str2 = this.f57569c;
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
        return Arrays.hashCode(this.f57570e) + ((i13 + i11) * 31);
    }

    @Override
    public final String toString() {
        return this.f57573a + ": mimeType=" + this.f57568b + ", filename=" + this.f57569c + ", description=" + this.d;
    }
}
