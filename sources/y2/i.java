package y2;

import a4.w;
import android.util.Base64;
import java.util.Arrays;
public final class i {
    public final String f50187a;
    public final byte[] f50188b;
    public final v2.d f50189c;

    public i(String str, byte[] bArr, v2.d dVar) {
        this.f50187a = str;
        this.f50188b = bArr;
        this.f50189c = dVar;
    }

    public static v5.c a() {
        v5.c cVar = new v5.c(4);
        cVar.d = v2.d.f49328a;
        return cVar;
    }

    public final i b(v2.d dVar) {
        v5.c a2 = a();
        a2.h(this.f50187a);
        if (dVar != null) {
            a2.d = dVar;
            a2.f49409b = this.f50188b;
            return a2.d();
        }
        throw new NullPointerException("Null priority");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            if (this.f50187a.equals(iVar.f50187a) && Arrays.equals(this.f50188b, iVar.f50188b) && this.f50189c.equals(iVar.f50189c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f50187a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f50188b)) * 1000003) ^ this.f50189c.hashCode();
    }

    public final String toString() {
        String encodeToString;
        byte[] bArr = this.f50188b;
        if (bArr == null) {
            encodeToString = "";
        } else {
            encodeToString = Base64.encodeToString(bArr, 2);
        }
        StringBuilder sb2 = new StringBuilder("TransportContext(");
        sb2.append(this.f50187a);
        sb2.append(", ");
        sb2.append(this.f50189c);
        sb2.append(", ");
        return w.q(sb2, encodeToString, ")");
    }
}
