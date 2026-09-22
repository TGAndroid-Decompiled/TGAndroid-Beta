package w9;

import java.io.File;
import y9.a0;
public final class b {
    public final a0 f44907a;
    public final String f44908b;
    public final File f44909c;

    public b(a0 a0Var, String str, File file) {
        this.f44907a = a0Var;
        if (str != null) {
            this.f44908b = str;
            this.f44909c = file;
            return;
        }
        throw new NullPointerException("Null sessionId");
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (this.f44907a.equals(bVar.f44907a) && this.f44908b.equals(bVar.f44908b) && this.f44909c.equals(bVar.f44909c)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((this.f44907a.hashCode() ^ 1000003) * 1000003) ^ this.f44908b.hashCode()) * 1000003) ^ this.f44909c.hashCode();
    }

    public final String toString() {
        return "CrashlyticsReportWithSessionId{report=" + this.f44907a + ", sessionId=" + this.f44908b + ", reportFile=" + this.f44909c + "}";
    }
}
