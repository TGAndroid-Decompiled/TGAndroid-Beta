package t3;

import j$.util.Objects;
import java.util.Arrays;
public final class f extends i {
    public final String f57607b;
    public final String f57608c;
    public final String d;
    public final byte[] f57609e;

    public f(String str, byte[] bArr, String str2, String str3) {
        super("GEOB");
        this.f57607b = str;
        this.f57608c = str2;
        this.d = str3;
        this.f57609e = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && f.class == obj.getClass()) {
            f fVar = (f) obj;
            if (Objects.equals(this.f57607b, fVar.f57607b) && Objects.equals(this.f57608c, fVar.f57608c) && Objects.equals(this.d, fVar.d) && Arrays.equals(this.f57609e, fVar.f57609e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        int i10;
        int i11 = 0;
        String str = this.f57607b;
        if (str != null) {
            i7 = str.hashCode();
        } else {
            i7 = 0;
        }
        int i12 = (527 + i7) * 31;
        String str2 = this.f57608c;
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
        return Arrays.hashCode(this.f57609e) + ((i13 + i11) * 31);
    }

    @Override
    public final String toString() {
        return this.f57612a + ": mimeType=" + this.f57607b + ", filename=" + this.f57608c + ", description=" + this.d;
    }
}
