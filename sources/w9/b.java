package w9;

import java.io.File;
import y9.a0;
public final class b {
    public final a0 f50453a;
    public final String f50454b;
    public final File f50455c;

    public b(a0 a0Var, String str, File file) {
        this.f50453a = a0Var;
        if (str != null) {
            this.f50454b = str;
            this.f50455c = file;
            return;
        }
        throw new NullPointerException("Null sessionId");
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (this.f50453a.equals(bVar.f50453a) && this.f50454b.equals(bVar.f50454b) && this.f50455c.equals(bVar.f50455c)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((this.f50453a.hashCode() ^ 1000003) * 1000003) ^ this.f50454b.hashCode()) * 1000003) ^ this.f50455c.hashCode();
    }

    public final String toString() {
        return "CrashlyticsReportWithSessionId{report=" + this.f50453a + ", sessionId=" + this.f50454b + ", reportFile=" + this.f50455c + "}";
    }
}
