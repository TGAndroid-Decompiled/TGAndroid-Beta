package y2;

import android.util.Base64;
import java.util.Arrays;
public final class i {
    public final String f47014a;
    public final byte[] f47015b;
    public final v2.d f47016c;

    public i(String str, byte[] bArr, v2.d dVar) {
        this.f47014a = str;
        this.f47015b = bArr;
        this.f47016c = dVar;
    }

    public static s5.m a() {
        s5.m mVar = new s5.m();
        mVar.d = v2.d.f45560a;
        return mVar;
    }

    public final i b(v2.d dVar) {
        s5.m a2 = a();
        a2.n(this.f47014a);
        if (dVar != null) {
            a2.d = dVar;
            a2.f44089c = this.f47015b;
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
            if (this.f47014a.equals(iVar.f47014a) && Arrays.equals(this.f47015b, iVar.f47015b) && this.f47016c.equals(iVar.f47016c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f47014a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f47015b)) * 1000003) ^ this.f47016c.hashCode();
    }

    public final String toString() {
        String encodeToString;
        byte[] bArr = this.f47015b;
        if (bArr == null) {
            encodeToString = "";
        } else {
            encodeToString = Base64.encodeToString(bArr, 2);
        }
        StringBuilder sb = new StringBuilder("TransportContext(");
        sb.append(this.f47014a);
        sb.append(", ");
        sb.append(this.f47016c);
        sb.append(", ");
        return android.support.v4.media.a.r(sb, encodeToString, ")");
    }
}
