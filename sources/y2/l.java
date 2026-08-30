package y2;

import java.util.Arrays;
public final class l {
    public final v2.c f47021a;
    public final byte[] f47022b;

    public l(v2.c cVar, byte[] bArr) {
        if (cVar != null) {
            if (bArr != null) {
                this.f47021a = cVar;
                this.f47022b = bArr;
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
        if (!this.f47021a.equals(lVar.f47021a)) {
            return false;
        }
        return Arrays.equals(this.f47022b, lVar.f47022b);
    }

    public final int hashCode() {
        return ((this.f47021a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f47022b);
    }

    public final String toString() {
        return "EncodedPayload{encoding=" + this.f47021a + ", bytes=[...]}";
    }
}
