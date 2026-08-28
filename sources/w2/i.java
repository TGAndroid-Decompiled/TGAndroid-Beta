package w2;

import android.util.Base64;
import java.util.Arrays;
public final class i {
    public final String f48454a;
    public final byte[] f48455b;
    public final t2.d f48456c;

    public i(String str, byte[] bArr, t2.d dVar) {
        this.f48454a = str;
        this.f48455b = bArr;
        this.f48456c = dVar;
    }

    public static t5.c a() {
        t5.c cVar = new t5.c(4);
        cVar.d = t2.d.f47601a;
        return cVar;
    }

    public final i b(t2.d dVar) {
        t5.c a2 = a();
        a2.h(this.f48454a);
        if (dVar != null) {
            a2.d = dVar;
            a2.f47682b = this.f48455b;
            return a2.b();
        }
        throw new NullPointerException("Null priority");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            if (this.f48454a.equals(iVar.f48454a) && Arrays.equals(this.f48455b, iVar.f48455b) && this.f48456c.equals(iVar.f48456c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f48454a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f48455b)) * 1000003) ^ this.f48456c.hashCode();
    }

    public final String toString() {
        String encodeToString;
        byte[] bArr = this.f48455b;
        if (bArr == null) {
            encodeToString = "";
        } else {
            encodeToString = Base64.encodeToString(bArr, 2);
        }
        StringBuilder sb2 = new StringBuilder("TransportContext(");
        sb2.append(this.f48454a);
        sb2.append(", ");
        sb2.append(this.f48456c);
        sb2.append(", ");
        return aa.d.r(sb2, encodeToString, ")");
    }
}
