package w9;

import java.io.File;
import y9.a0;
public final class b {
    public final a0 f44911a;
    public final String f44912b;
    public final File f44913c;

    public b(a0 a0Var, String str, File file) {
        this.f44911a = a0Var;
        if (str != null) {
            this.f44912b = str;
            this.f44913c = file;
            return;
        }
        throw new NullPointerException("Null sessionId");
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (this.f44911a.equals(bVar.f44911a) && this.f44912b.equals(bVar.f44912b) && this.f44913c.equals(bVar.f44913c)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((this.f44911a.hashCode() ^ 1000003) * 1000003) ^ this.f44912b.hashCode()) * 1000003) ^ this.f44913c.hashCode();
    }

    public final String toString() {
        return "CrashlyticsReportWithSessionId{report=" + this.f44911a + ", sessionId=" + this.f44912b + ", reportFile=" + this.f44913c + "}";
    }
}
