package w9;

import java.io.File;
import y9.a0;
public final class b {
    public final a0 f45192a;
    public final String f45193b;
    public final File f45194c;

    public b(a0 a0Var, String str, File file) {
        this.f45192a = a0Var;
        if (str != null) {
            this.f45193b = str;
            this.f45194c = file;
            return;
        }
        throw new NullPointerException("Null sessionId");
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (this.f45192a.equals(bVar.f45192a) && this.f45193b.equals(bVar.f45193b) && this.f45194c.equals(bVar.f45194c)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((this.f45192a.hashCode() ^ 1000003) * 1000003) ^ this.f45193b.hashCode()) * 1000003) ^ this.f45194c.hashCode();
    }

    public final String toString() {
        return "CrashlyticsReportWithSessionId{report=" + this.f45192a + ", sessionId=" + this.f45193b + ", reportFile=" + this.f45194c + "}";
    }
}
