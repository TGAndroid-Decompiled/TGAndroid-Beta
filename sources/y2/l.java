package y2;

import java.util.Arrays;
public final class l {
    public final v2.c f50701a;
    public final byte[] f50702b;

    public l(v2.c cVar, byte[] bArr) {
        if (cVar != null) {
            if (bArr != null) {
                this.f50701a = cVar;
                this.f50702b = bArr;
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
        if (!this.f50701a.equals(lVar.f50701a)) {
            return false;
        }
        return Arrays.equals(this.f50702b, lVar.f50702b);
    }

    public final int hashCode() {
        return ((this.f50701a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f50702b);
    }

    public final String toString() {
        return "EncodedPayload{encoding=" + this.f50701a + ", bytes=[...]}";
    }
}
