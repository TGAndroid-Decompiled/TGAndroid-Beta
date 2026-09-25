package w9;

import java.io.File;
import y9.a0;
public final class b {
    public final a0 f45193a;
    public final String f45194b;
    public final File f45195c;

    public b(a0 a0Var, String str, File file) {
        this.f45193a = a0Var;
        if (str != null) {
            this.f45194b = str;
            this.f45195c = file;
            return;
        }
        throw new NullPointerException("Null sessionId");
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (this.f45193a.equals(bVar.f45193a) && this.f45194b.equals(bVar.f45194b) && this.f45195c.equals(bVar.f45195c)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((this.f45193a.hashCode() ^ 1000003) * 1000003) ^ this.f45194b.hashCode()) * 1000003) ^ this.f45195c.hashCode();
    }

    public final String toString() {
        return "CrashlyticsReportWithSessionId{report=" + this.f45193a + ", sessionId=" + this.f45194b + ", reportFile=" + this.f45195c + "}";
    }
}
