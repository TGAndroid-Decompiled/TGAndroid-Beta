package w9;

import java.io.File;
import y9.a0;
public final class b {
    public final a0 f48404a;
    public final String f48405b;
    public final File f48406c;

    public b(a0 a0Var, String str, File file) {
        this.f48404a = a0Var;
        if (str != null) {
            this.f48405b = str;
            this.f48406c = file;
            return;
        }
        throw new NullPointerException("Null sessionId");
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (this.f48404a.equals(bVar.f48404a) && this.f48405b.equals(bVar.f48405b) && this.f48406c.equals(bVar.f48406c)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((this.f48404a.hashCode() ^ 1000003) * 1000003) ^ this.f48405b.hashCode()) * 1000003) ^ this.f48406c.hashCode();
    }

    public final String toString() {
        return "CrashlyticsReportWithSessionId{report=" + this.f48404a + ", sessionId=" + this.f48405b + ", reportFile=" + this.f48406c + "}";
    }
}
