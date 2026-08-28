package w2;

import java.util.Arrays;
public final class l {
    public final t2.c f48462a;
    public final byte[] f48463b;

    public l(t2.c cVar, byte[] bArr) {
        if (cVar != null) {
            if (bArr != null) {
                this.f48462a = cVar;
                this.f48463b = bArr;
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
        if (!this.f48462a.equals(lVar.f48462a)) {
            return false;
        }
        return Arrays.equals(this.f48463b, lVar.f48463b);
    }

    public final int hashCode() {
        return ((this.f48462a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f48463b);
    }

    public final String toString() {
        return "EncodedPayload{encoding=" + this.f48462a + ", bytes=[...]}";
    }
}
