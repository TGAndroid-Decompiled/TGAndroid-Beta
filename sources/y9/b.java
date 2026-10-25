package y9;

import aa.a0;
import java.io.File;
public final class b {
    public final a0 f52412a;
    public final String f52413b;
    public final File f52414c;

    public b(a0 a0Var, String str, File file) {
        this.f52412a = a0Var;
        if (str != null) {
            this.f52413b = str;
            this.f52414c = file;
            return;
        }
        throw new NullPointerException("Null sessionId");
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (this.f52412a.equals(bVar.f52412a) && this.f52413b.equals(bVar.f52413b) && this.f52414c.equals(bVar.f52414c)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((this.f52412a.hashCode() ^ 1000003) * 1000003) ^ this.f52413b.hashCode()) * 1000003) ^ this.f52414c.hashCode();
    }

    public final String toString() {
        return "CrashlyticsReportWithSessionId{report=" + this.f52412a + ", sessionId=" + this.f52413b + ", reportFile=" + this.f52414c + "}";
    }
}
