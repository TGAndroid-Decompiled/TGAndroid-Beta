package x9;

import java.io.File;
import z9.a0;
public final class b {
    public final a0 f48277a;
    public final String f48278b;
    public final File f48279c;

    public b(a0 a0Var, String str, File file) {
        this.f48277a = a0Var;
        if (str != null) {
            this.f48278b = str;
            this.f48279c = file;
            return;
        }
        throw new NullPointerException("Null sessionId");
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (this.f48277a.equals(bVar.f48277a) && this.f48278b.equals(bVar.f48278b) && this.f48279c.equals(bVar.f48279c)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((this.f48277a.hashCode() ^ 1000003) * 1000003) ^ this.f48278b.hashCode()) * 1000003) ^ this.f48279c.hashCode();
    }

    public final String toString() {
        return "CrashlyticsReportWithSessionId{report=" + this.f48277a + ", sessionId=" + this.f48278b + ", reportFile=" + this.f48279c + "}";
    }
}
