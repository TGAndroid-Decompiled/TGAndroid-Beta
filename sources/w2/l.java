package w2;

import java.util.Arrays;

public final class l {

    public final t2.c f48965a;

    public final byte[] f48966b;

    public l(t2.c cVar, byte[] bArr) {
        if (cVar == null) {
            throw new NullPointerException("encoding is null");
        }
        if (bArr == null) {
            throw new NullPointerException("bytes is null");
        }
        this.f48965a = cVar;
        this.f48966b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        if (this.f48965a.equals(lVar.f48965a)) {
            return Arrays.equals(this.f48966b, lVar.f48966b);
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f48965a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f48966b);
    }

    public final String toString() {
        return "EncodedPayload{encoding=" + this.f48965a + ", bytes=[...]}";
    }
}
