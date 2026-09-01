package y2;

import java.util.Arrays;
public final class l {
    public final v2.c f50702a;
    public final byte[] f50703b;

    public l(v2.c cVar, byte[] bArr) {
        if (cVar != null) {
            if (bArr != null) {
                this.f50702a = cVar;
                this.f50703b = bArr;
                return;
            }
            throw new NullPointerException("bytes is null");
        }
        throw new NullPointerException("encoding is null");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        if (!this.f50702a.equals(lVar.f50702a)) {
            return false;
        }
        return Arrays.equals(this.f50703b, lVar.f50703b);
    }

    public final int hashCode() {
        return ((this.f50702a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f50703b);
    }

    public final String toString() {
        return "EncodedPayload{encoding=" + this.f50702a + ", bytes=[...]}";
    }
}
