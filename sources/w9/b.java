package w9;

import java.io.File;
import y9.a0;
public final class b {
    public final a0 f48405a;
    public final String f48406b;
    public final File f48407c;

    public b(a0 a0Var, String str, File file) {
        this.f48405a = a0Var;
        if (str != null) {
            this.f48406b = str;
            this.f48407c = file;
            return;
        }
        throw new NullPointerException("Null sessionId");
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (this.f48405a.equals(bVar.f48405a) && this.f48406b.equals(bVar.f48406b) && this.f48407c.equals(bVar.f48407c)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((this.f48405a.hashCode() ^ 1000003) * 1000003) ^ this.f48406b.hashCode()) * 1000003) ^ this.f48407c.hashCode();
    }

    public final String toString() {
        return "CrashlyticsReportWithSessionId{report=" + this.f48405a + ", sessionId=" + this.f48406b + ", reportFile=" + this.f48407c + "}";
    }
}
