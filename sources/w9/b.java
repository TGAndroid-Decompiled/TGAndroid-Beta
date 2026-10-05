package w9;

import java.io.File;
import y9.a0;
public final class b {
    public final a0 f48936a;
    public final String f48937b;
    public final File f48938c;

    public b(a0 a0Var, String str, File file) {
        this.f48936a = a0Var;
        if (str != null) {
            this.f48937b = str;
            this.f48938c = file;
            return;
        }
        throw new NullPointerException("Null sessionId");
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (this.f48936a.equals(bVar.f48936a) && this.f48937b.equals(bVar.f48937b) && this.f48938c.equals(bVar.f48938c)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((this.f48936a.hashCode() ^ 1000003) * 1000003) ^ this.f48937b.hashCode()) * 1000003) ^ this.f48938c.hashCode();
    }

    public final String toString() {
        return "CrashlyticsReportWithSessionId{report=" + this.f48936a + ", sessionId=" + this.f48937b + ", reportFile=" + this.f48938c + "}";
    }
}
