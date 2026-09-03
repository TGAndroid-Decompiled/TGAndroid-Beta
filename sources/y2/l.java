package y2;

import java.util.Arrays;
public final class l {
    public final v2.c f50738a;
    public final byte[] f50739b;

    public l(v2.c cVar, byte[] bArr) {
        if (cVar != null) {
            if (bArr != null) {
                this.f50738a = cVar;
                this.f50739b = bArr;
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
        if (!this.f50738a.equals(lVar.f50738a)) {
            return false;
        }
        return Arrays.equals(this.f50739b, lVar.f50739b);
    }

    public final int hashCode() {
        return ((this.f50738a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f50739b);
    }

    public final String toString() {
        return "EncodedPayload{encoding=" + this.f50738a + ", bytes=[...]}";
    }
}
