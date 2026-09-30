package w9;

import java.io.File;
import y9.a0;
public final class b {
    public final a0 f45194a;
    public final String f45195b;
    public final File f45196c;

    public b(a0 a0Var, String str, File file) {
        this.f45194a = a0Var;
        if (str != null) {
            this.f45195b = str;
            this.f45196c = file;
            return;
        }
        throw new NullPointerException("Null sessionId");
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (this.f45194a.equals(bVar.f45194a) && this.f45195b.equals(bVar.f45195b) && this.f45196c.equals(bVar.f45196c)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((this.f45194a.hashCode() ^ 1000003) * 1000003) ^ this.f45195b.hashCode()) * 1000003) ^ this.f45196c.hashCode();
    }

    public final String toString() {
        return "CrashlyticsReportWithSessionId{report=" + this.f45194a + ", sessionId=" + this.f45195b + ", reportFile=" + this.f45196c + "}";
    }
}
