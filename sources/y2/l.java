package y2;

import java.util.Arrays;
public final class l {
    public final v2.c f47115a;
    public final byte[] f47116b;

    public l(v2.c cVar, byte[] bArr) {
        if (cVar != null) {
            if (bArr != null) {
                this.f47115a = cVar;
                this.f47116b = bArr;
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
        if (!this.f47115a.equals(lVar.f47115a)) {
            return false;
        }
        return Arrays.equals(this.f47116b, lVar.f47116b);
    }

    public final int hashCode() {
        return ((this.f47115a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f47116b);
    }

    public final String toString() {
        return "EncodedPayload{encoding=" + this.f47115a + ", bytes=[...]}";
    }
}
