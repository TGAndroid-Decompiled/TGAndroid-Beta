package w9;

import java.io.File;
import y9.a0;
public final class b {
    public final a0 f50216a;
    public final String f50217b;
    public final File f50218c;

    public b(a0 a0Var, String str, File file) {
        this.f50216a = a0Var;
        if (str != null) {
            this.f50217b = str;
            this.f50218c = file;
            return;
        }
        throw new NullPointerException("Null sessionId");
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (this.f50216a.equals(bVar.f50216a) && this.f50217b.equals(bVar.f50217b) && this.f50218c.equals(bVar.f50218c)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((this.f50216a.hashCode() ^ 1000003) * 1000003) ^ this.f50217b.hashCode()) * 1000003) ^ this.f50218c.hashCode();
    }

    public final String toString() {
        return "CrashlyticsReportWithSessionId{report=" + this.f50216a + ", sessionId=" + this.f50217b + ", reportFile=" + this.f50218c + "}";
    }
}
