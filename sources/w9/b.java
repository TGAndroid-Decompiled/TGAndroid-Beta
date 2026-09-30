package w9;

import java.io.File;
import y9.a0;
public final class b {
    public final a0 f45300a;
    public final String f45301b;
    public final File f45302c;

    public b(a0 a0Var, String str, File file) {
        this.f45300a = a0Var;
        if (str != null) {
            this.f45301b = str;
            this.f45302c = file;
            return;
        }
        throw new NullPointerException("Null sessionId");
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (this.f45300a.equals(bVar.f45300a) && this.f45301b.equals(bVar.f45301b) && this.f45302c.equals(bVar.f45302c)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((this.f45300a.hashCode() ^ 1000003) * 1000003) ^ this.f45301b.hashCode()) * 1000003) ^ this.f45302c.hashCode();
    }

    public final String toString() {
        return "CrashlyticsReportWithSessionId{report=" + this.f45300a + ", sessionId=" + this.f45301b + ", reportFile=" + this.f45302c + "}";
    }
}
