package w9;

import java.io.File;
import y9.a0;
public final class b {
    public final a0 f45165a;
    public final String f45166b;
    public final File f45167c;

    public b(a0 a0Var, String str, File file) {
        this.f45165a = a0Var;
        if (str != null) {
            this.f45166b = str;
            this.f45167c = file;
            return;
        }
        throw new NullPointerException("Null sessionId");
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (this.f45165a.equals(bVar.f45165a) && this.f45166b.equals(bVar.f45166b) && this.f45167c.equals(bVar.f45167c)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((this.f45165a.hashCode() ^ 1000003) * 1000003) ^ this.f45166b.hashCode()) * 1000003) ^ this.f45167c.hashCode();
    }

    public final String toString() {
        return "CrashlyticsReportWithSessionId{report=" + this.f45165a + ", sessionId=" + this.f45166b + ", reportFile=" + this.f45167c + "}";
    }
}
