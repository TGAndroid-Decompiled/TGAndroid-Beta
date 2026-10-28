package y9;

import aa.a0;
import java.io.File;
public final class b {
    public final a0 f52473a;
    public final String f52474b;
    public final File f52475c;

    public b(a0 a0Var, String str, File file) {
        this.f52473a = a0Var;
        if (str != null) {
            this.f52474b = str;
            this.f52475c = file;
            return;
        }
        throw new NullPointerException("Null sessionId");
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (this.f52473a.equals(bVar.f52473a) && this.f52474b.equals(bVar.f52474b) && this.f52475c.equals(bVar.f52475c)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((this.f52473a.hashCode() ^ 1000003) * 1000003) ^ this.f52474b.hashCode()) * 1000003) ^ this.f52475c.hashCode();
    }

    public final String toString() {
        return "CrashlyticsReportWithSessionId{report=" + this.f52473a + ", sessionId=" + this.f52474b + ", reportFile=" + this.f52475c + "}";
    }
}
