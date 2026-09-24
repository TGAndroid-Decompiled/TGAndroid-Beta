package w9;

import java.io.File;
import y9.a0;
public final class b {
    public final a0 f45178a;
    public final String f45179b;
    public final File f45180c;

    public b(a0 a0Var, String str, File file) {
        this.f45178a = a0Var;
        if (str != null) {
            this.f45179b = str;
            this.f45180c = file;
            return;
        }
        throw new NullPointerException("Null sessionId");
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (this.f45178a.equals(bVar.f45178a) && this.f45179b.equals(bVar.f45179b) && this.f45180c.equals(bVar.f45180c)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((this.f45178a.hashCode() ^ 1000003) * 1000003) ^ this.f45179b.hashCode()) * 1000003) ^ this.f45180c.hashCode();
    }

    public final String toString() {
        return "CrashlyticsReportWithSessionId{report=" + this.f45178a + ", sessionId=" + this.f45179b + ", reportFile=" + this.f45180c + "}";
    }
}
