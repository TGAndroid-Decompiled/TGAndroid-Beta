package t3;

import j$.util.Objects;
import java.util.Arrays;
public final class f extends i {
    public final String f57690b;
    public final String f57691c;
    public final String d;
    public final byte[] f57692e;

    public f(String str, byte[] bArr, String str2, String str3) {
        super("GEOB");
        this.f57690b = str;
        this.f57691c = str2;
        this.d = str3;
        this.f57692e = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && f.class == obj.getClass()) {
            f fVar = (f) obj;
            if (Objects.equals(this.f57690b, fVar.f57690b) && Objects.equals(this.f57691c, fVar.f57691c) && Objects.equals(this.d, fVar.d) && Arrays.equals(this.f57692e, fVar.f57692e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        int i10;
        int i11 = 0;
        String str = this.f57690b;
        if (str != null) {
            i7 = str.hashCode();
        } else {
            i7 = 0;
        }
        int i12 = (527 + i7) * 31;
        String str2 = this.f57691c;
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
        return Arrays.hashCode(this.f57692e) + ((i13 + i11) * 31);
    }

    @Override
    public final String toString() {
        return this.f57695a + ": mimeType=" + this.f57690b + ", filename=" + this.f57691c + ", description=" + this.d;
    }
}
