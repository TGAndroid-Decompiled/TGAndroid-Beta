package w9;

import java.io.File;
import y9.a0;
public final class b {
    public final a0 f48929a;
    public final String f48930b;
    public final File f48931c;

    public b(a0 a0Var, String str, File file) {
        this.f48929a = a0Var;
        if (str != null) {
            this.f48930b = str;
            this.f48931c = file;
            return;
        }
        throw new NullPointerException("Null sessionId");
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (this.f48929a.equals(bVar.f48929a) && this.f48930b.equals(bVar.f48930b) && this.f48931c.equals(bVar.f48931c)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((this.f48929a.hashCode() ^ 1000003) * 1000003) ^ this.f48930b.hashCode()) * 1000003) ^ this.f48931c.hashCode();
    }

    public final String toString() {
        return "CrashlyticsReportWithSessionId{report=" + this.f48929a + ", sessionId=" + this.f48930b + ", reportFile=" + this.f48931c + "}";
    }
}
