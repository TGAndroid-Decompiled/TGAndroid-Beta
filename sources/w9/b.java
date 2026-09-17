package w9;

import java.io.File;
import y9.a0;
public final class b {
    public final a0 f48376a;
    public final String f48377b;
    public final File f48378c;

    public b(a0 a0Var, String str, File file) {
        this.f48376a = a0Var;
        if (str != null) {
            this.f48377b = str;
            this.f48378c = file;
            return;
        }
        throw new NullPointerException("Null sessionId");
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (this.f48376a.equals(bVar.f48376a) && this.f48377b.equals(bVar.f48377b) && this.f48378c.equals(bVar.f48378c)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((this.f48376a.hashCode() ^ 1000003) * 1000003) ^ this.f48377b.hashCode()) * 1000003) ^ this.f48378c.hashCode();
    }

    public final String toString() {
        return "CrashlyticsReportWithSessionId{report=" + this.f48376a + ", sessionId=" + this.f48377b + ", reportFile=" + this.f48378c + "}";
    }
}
