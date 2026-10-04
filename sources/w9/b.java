package w9;

import java.io.File;
import y9.a0;
public final class b {
    public final a0 f48921a;
    public final String f48922b;
    public final File f48923c;

    public b(a0 a0Var, String str, File file) {
        this.f48921a = a0Var;
        if (str != null) {
            this.f48922b = str;
            this.f48923c = file;
            return;
        }
        throw new NullPointerException("Null sessionId");
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (this.f48921a.equals(bVar.f48921a) && this.f48922b.equals(bVar.f48922b) && this.f48923c.equals(bVar.f48923c)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((this.f48921a.hashCode() ^ 1000003) * 1000003) ^ this.f48922b.hashCode()) * 1000003) ^ this.f48923c.hashCode();
    }

    public final String toString() {
        return "CrashlyticsReportWithSessionId{report=" + this.f48921a + ", sessionId=" + this.f48922b + ", reportFile=" + this.f48923c + "}";
    }
}
