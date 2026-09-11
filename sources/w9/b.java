package w9;

import java.io.File;
import y9.a0;
public final class b {
    public final a0 f48375a;
    public final String f48376b;
    public final File f48377c;

    public b(a0 a0Var, String str, File file) {
        this.f48375a = a0Var;
        if (str != null) {
            this.f48376b = str;
            this.f48377c = file;
            return;
        }
        throw new NullPointerException("Null sessionId");
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (this.f48375a.equals(bVar.f48375a) && this.f48376b.equals(bVar.f48376b) && this.f48377c.equals(bVar.f48377c)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((this.f48375a.hashCode() ^ 1000003) * 1000003) ^ this.f48376b.hashCode()) * 1000003) ^ this.f48377c.hashCode();
    }

    public final String toString() {
        return "CrashlyticsReportWithSessionId{report=" + this.f48375a + ", sessionId=" + this.f48376b + ", reportFile=" + this.f48377c + "}";
    }
}
