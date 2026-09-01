package y2;

import android.util.Base64;
import java.util.Arrays;
public final class i {
    public final String f50694a;
    public final byte[] f50695b;
    public final v2.d f50696c;

    public i(String str, byte[] bArr, v2.d dVar) {
        this.f50694a = str;
        this.f50695b = bArr;
        this.f50696c = dVar;
    }

    public static s5.m a() {
        s5.m mVar = new s5.m();
        mVar.d = v2.d.f48850a;
        return mVar;
    }

    public final i b(v2.d dVar) {
        s5.m a2 = a();
        a2.n(this.f50694a);
        if (dVar != null) {
            a2.d = dVar;
            a2.f47063c = this.f50695b;
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
            if (this.f50694a.equals(iVar.f50694a) && Arrays.equals(this.f50695b, iVar.f50695b) && this.f50696c.equals(iVar.f50696c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f50694a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f50695b)) * 1000003) ^ this.f50696c.hashCode();
    }

    public final String toString() {
        String encodeToString;
        byte[] bArr = this.f50695b;
        if (bArr == null) {
            encodeToString = "";
        } else {
            encodeToString = Base64.encodeToString(bArr, 2);
        }
        StringBuilder sb = new StringBuilder("TransportContext(");
        sb.append(this.f50694a);
        sb.append(", ");
        sb.append(this.f50696c);
        sb.append(", ");
        return android.support.v4.media.a.r(sb, encodeToString, ")");
    }
}
