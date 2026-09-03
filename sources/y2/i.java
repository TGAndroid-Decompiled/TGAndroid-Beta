package y2;

import android.util.Base64;
import java.util.Arrays;
public final class i {
    public final String f47108a;
    public final byte[] f47109b;
    public final v2.d f47110c;

    public i(String str, byte[] bArr, v2.d dVar) {
        this.f47108a = str;
        this.f47109b = bArr;
        this.f47110c = dVar;
    }

    public static s5.m a() {
        s5.m mVar = new s5.m();
        mVar.d = v2.d.f45624a;
        return mVar;
    }

    public final i b(v2.d dVar) {
        s5.m a2 = a();
        a2.n(this.f47108a);
        if (dVar != null) {
            a2.d = dVar;
            a2.f44154c = this.f47109b;
            return a2.f();
        }
        throw new NullPointerException("Null priority");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            if (this.f47108a.equals(iVar.f47108a) && Arrays.equals(this.f47109b, iVar.f47109b) && this.f47110c.equals(iVar.f47110c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f47108a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f47109b)) * 1000003) ^ this.f47110c.hashCode();
    }

    public final String toString() {
        String encodeToString;
        byte[] bArr = this.f47109b;
        if (bArr == null) {
            encodeToString = "";
        } else {
            encodeToString = Base64.encodeToString(bArr, 2);
        }
        StringBuilder sb = new StringBuilder("TransportContext(");
        sb.append(this.f47108a);
        sb.append(", ");
        sb.append(this.f47110c);
        sb.append(", ");
        return android.support.v4.media.a.r(sb, encodeToString, ")");
    }
}
