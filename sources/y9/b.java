package y9;

import aa.a0;
import java.io.File;
public final class b {
    public final a0 f52415a;
    public final String f52416b;
    public final File f52417c;

    public b(a0 a0Var, String str, File file) {
        this.f52415a = a0Var;
        if (str != null) {
            this.f52416b = str;
            this.f52417c = file;
            return;
        }
        throw new NullPointerException("Null sessionId");
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (this.f52415a.equals(bVar.f52415a) && this.f52416b.equals(bVar.f52416b) && this.f52417c.equals(bVar.f52417c)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((this.f52415a.hashCode() ^ 1000003) * 1000003) ^ this.f52416b.hashCode()) * 1000003) ^ this.f52417c.hashCode();
    }

    public final String toString() {
        return "CrashlyticsReportWithSessionId{report=" + this.f52415a + ", sessionId=" + this.f52416b + ", reportFile=" + this.f52417c + "}";
    }
}
