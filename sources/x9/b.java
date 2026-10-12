package x9;

import java.io.File;
import z9.a0;
public final class b {
    public final a0 f48278a;
    public final String f48279b;
    public final File f48280c;

    public b(a0 a0Var, String str, File file) {
        this.f48278a = a0Var;
        if (str != null) {
            this.f48279b = str;
            this.f48280c = file;
            return;
        }
        throw new NullPointerException("Null sessionId");
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (this.f48278a.equals(bVar.f48278a) && this.f48279b.equals(bVar.f48279b) && this.f48280c.equals(bVar.f48280c)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((this.f48278a.hashCode() ^ 1000003) * 1000003) ^ this.f48279b.hashCode()) * 1000003) ^ this.f48280c.hashCode();
    }

    public final String toString() {
        return "CrashlyticsReportWithSessionId{report=" + this.f48278a + ", sessionId=" + this.f48279b + ", reportFile=" + this.f48280c + "}";
    }
}
