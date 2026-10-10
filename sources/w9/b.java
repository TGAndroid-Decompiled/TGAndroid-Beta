package w9;

import java.io.File;
import y9.a0;
public final class b {
    public final a0 f50262a;
    public final String f50263b;
    public final File f50264c;

    public b(a0 a0Var, String str, File file) {
        this.f50262a = a0Var;
        if (str != null) {
            this.f50263b = str;
            this.f50264c = file;
            return;
        }
        throw new NullPointerException("Null sessionId");
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (this.f50262a.equals(bVar.f50262a) && this.f50263b.equals(bVar.f50263b) && this.f50264c.equals(bVar.f50264c)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((this.f50262a.hashCode() ^ 1000003) * 1000003) ^ this.f50263b.hashCode()) * 1000003) ^ this.f50264c.hashCode();
    }

    public final String toString() {
        return "CrashlyticsReportWithSessionId{report=" + this.f50262a + ", sessionId=" + this.f50263b + ", reportFile=" + this.f50264c + "}";
    }
}
