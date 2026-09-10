package w9;

import java.io.File;
import y9.a0;
public final class b {
    public final a0 f43870a;
    public final String f43871b;
    public final File f43872c;

    public b(a0 a0Var, String str, File file) {
        this.f43870a = a0Var;
        if (str != null) {
            this.f43871b = str;
            this.f43872c = file;
            return;
        }
        throw new NullPointerException("Null sessionId");
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (this.f43870a.equals(bVar.f43870a) && this.f43871b.equals(bVar.f43871b) && this.f43872c.equals(bVar.f43872c)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((this.f43870a.hashCode() ^ 1000003) * 1000003) ^ this.f43871b.hashCode()) * 1000003) ^ this.f43872c.hashCode();
    }

    public final String toString() {
        return "CrashlyticsReportWithSessionId{report=" + this.f43870a + ", sessionId=" + this.f43871b + ", reportFile=" + this.f43872c + "}";
    }
}
