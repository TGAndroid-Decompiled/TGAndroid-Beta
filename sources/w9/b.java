package w9;

import java.io.File;
import y9.a0;
public final class b {
    public final a0 f50305a;
    public final String f50306b;
    public final File f50307c;

    public b(a0 a0Var, String str, File file) {
        this.f50305a = a0Var;
        if (str != null) {
            this.f50306b = str;
            this.f50307c = file;
            return;
        }
        throw new NullPointerException("Null sessionId");
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (this.f50305a.equals(bVar.f50305a) && this.f50306b.equals(bVar.f50306b) && this.f50307c.equals(bVar.f50307c)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((this.f50305a.hashCode() ^ 1000003) * 1000003) ^ this.f50306b.hashCode()) * 1000003) ^ this.f50307c.hashCode();
    }

    public final String toString() {
        return "CrashlyticsReportWithSessionId{report=" + this.f50305a + ", sessionId=" + this.f50306b + ", reportFile=" + this.f50307c + "}";
    }
}
