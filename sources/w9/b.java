package w9;

import java.io.File;
import y9.a0;
public final class b {
    public final a0 f48920a;
    public final String f48921b;
    public final File f48922c;

    public b(a0 a0Var, String str, File file) {
        this.f48920a = a0Var;
        if (str != null) {
            this.f48921b = str;
            this.f48922c = file;
            return;
        }
        throw new NullPointerException("Null sessionId");
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (this.f48920a.equals(bVar.f48920a) && this.f48921b.equals(bVar.f48921b) && this.f48922c.equals(bVar.f48922c)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((this.f48920a.hashCode() ^ 1000003) * 1000003) ^ this.f48921b.hashCode()) * 1000003) ^ this.f48922c.hashCode();
    }

    public final String toString() {
        return "CrashlyticsReportWithSessionId{report=" + this.f48920a + ", sessionId=" + this.f48921b + ", reportFile=" + this.f48922c + "}";
    }
}
