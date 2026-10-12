package w9;

import java.io.File;
import y9.a0;
public final class b {
    public final a0 f50445a;
    public final String f50446b;
    public final File f50447c;

    public b(a0 a0Var, String str, File file) {
        this.f50445a = a0Var;
        if (str != null) {
            this.f50446b = str;
            this.f50447c = file;
            return;
        }
        throw new NullPointerException("Null sessionId");
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (this.f50445a.equals(bVar.f50445a) && this.f50446b.equals(bVar.f50446b) && this.f50447c.equals(bVar.f50447c)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((this.f50445a.hashCode() ^ 1000003) * 1000003) ^ this.f50446b.hashCode()) * 1000003) ^ this.f50447c.hashCode();
    }

    public final String toString() {
        return "CrashlyticsReportWithSessionId{report=" + this.f50445a + ", sessionId=" + this.f50446b + ", reportFile=" + this.f50447c + "}";
    }
}
