package w9;

import java.io.File;
import y9.a0;
public final class b {
    public final a0 f44934a;
    public final String f44935b;
    public final File f44936c;

    public b(a0 a0Var, String str, File file) {
        this.f44934a = a0Var;
        if (str != null) {
            this.f44935b = str;
            this.f44936c = file;
            return;
        }
        throw new NullPointerException("Null sessionId");
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (this.f44934a.equals(bVar.f44934a) && this.f44935b.equals(bVar.f44935b) && this.f44936c.equals(bVar.f44936c)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((this.f44934a.hashCode() ^ 1000003) * 1000003) ^ this.f44935b.hashCode()) * 1000003) ^ this.f44936c.hashCode();
    }

    public final String toString() {
        return "CrashlyticsReportWithSessionId{report=" + this.f44934a + ", sessionId=" + this.f44935b + ", reportFile=" + this.f44936c + "}";
    }
}
