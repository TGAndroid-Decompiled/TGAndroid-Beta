package y2;

import android.util.Base64;
import java.util.Arrays;
public final class i {
    public final String f50730a;
    public final byte[] f50731b;
    public final v2.d f50732c;

    public i(String str, byte[] bArr, v2.d dVar) {
        this.f50730a = str;
        this.f50731b = bArr;
        this.f50732c = dVar;
    }

    public static s5.m a() {
        s5.m mVar = new s5.m();
        mVar.d = v2.d.f48886a;
        return mVar;
    }

    public final i b(v2.d dVar) {
        s5.m a2 = a();
        a2.n(this.f50730a);
        if (dVar != null) {
            a2.d = dVar;
            a2.f47094c = this.f50731b;
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
            if (this.f50730a.equals(iVar.f50730a) && Arrays.equals(this.f50731b, iVar.f50731b) && this.f50732c.equals(iVar.f50732c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f50730a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f50731b)) * 1000003) ^ this.f50732c.hashCode();
    }

    public final String toString() {
        String encodeToString;
        byte[] bArr = this.f50731b;
        if (bArr == null) {
            encodeToString = "";
        } else {
            encodeToString = Base64.encodeToString(bArr, 2);
        }
        StringBuilder sb = new StringBuilder("TransportContext(");
        sb.append(this.f50730a);
        sb.append(", ");
        sb.append(this.f50732c);
        sb.append(", ");
        return android.support.v4.media.a.r(sb, encodeToString, ")");
    }
}
