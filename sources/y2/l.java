package y2;

import java.util.Arrays;
public final class l {
    public final v2.c f50195a;
    public final byte[] f50196b;

    public l(v2.c cVar, byte[] bArr) {
        if (cVar != null) {
            if (bArr != null) {
                this.f50195a = cVar;
                this.f50196b = bArr;
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
        if (!this.f50195a.equals(lVar.f50195a)) {
            return false;
        }
        return Arrays.equals(this.f50196b, lVar.f50196b);
    }

    public final int hashCode() {
        return ((this.f50195a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f50196b);
    }

    public final String toString() {
        return "EncodedPayload{encoding=" + this.f50195a + ", bytes=[...]}";
    }
}
