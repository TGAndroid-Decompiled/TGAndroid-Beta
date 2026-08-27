package w2;

import android.util.Base64;
import java.util.Arrays;

public final class i {

    public final String f48957a;

    public final byte[] f48958b;

    public final t2.d f48959c;

    public i(String str, byte[] bArr, t2.d dVar) {
        this.f48957a = str;
        this.f48958b = bArr;
        this.f48959c = dVar;
    }

    public static u2.b a() {
        u2.b bVar = new u2.b(4);
        bVar.d = t2.d.f48012a;
        return bVar;
    }

    public final i b(t2.d dVar) {
        u2.b bVarA = a();
        bVarA.h(this.f48957a);
        if (dVar == null) {
            throw new NullPointerException("Null priority");
        }
        bVarA.d = dVar;
        bVarA.f48263c = this.f48958b;
        return bVarA.d();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            if (this.f48957a.equals(iVar.f48957a) && Arrays.equals(this.f48958b, iVar.f48958b) && this.f48959c.equals(iVar.f48959c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f48957a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f48958b)) * 1000003) ^ this.f48959c.hashCode();
    }

    public final String toString() {
        byte[] bArr = this.f48958b;
        String strEncodeToString = bArr == null ? "" : Base64.encodeToString(bArr, 2);
        StringBuilder sb2 = new StringBuilder("TransportContext(");
        sb2.append(this.f48957a);
        sb2.append(", ");
        sb2.append(this.f48959c);
        sb2.append(", ");
        return a9.p.p(sb2, strEncodeToString, ")");
    }
}
