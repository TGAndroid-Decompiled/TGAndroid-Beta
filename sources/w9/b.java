package w9;

import java.io.File;
import y9.a0;
public final class b {
    public final a0 f50339a;
    public final String f50340b;
    public final File f50341c;

    public b(a0 a0Var, String str, File file) {
        this.f50339a = a0Var;
        if (str != null) {
            this.f50340b = str;
            this.f50341c = file;
            return;
        }
        throw new NullPointerException("Null sessionId");
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (this.f50339a.equals(bVar.f50339a) && this.f50340b.equals(bVar.f50340b) && this.f50341c.equals(bVar.f50341c)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((this.f50339a.hashCode() ^ 1000003) * 1000003) ^ this.f50340b.hashCode()) * 1000003) ^ this.f50341c.hashCode();
    }

    public final String toString() {
        return "CrashlyticsReportWithSessionId{report=" + this.f50339a + ", sessionId=" + this.f50340b + ", reportFile=" + this.f50341c + "}";
    }
}
