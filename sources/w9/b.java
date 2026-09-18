package w9;

import java.io.File;
import y9.a0;
public final class b {
    public final a0 f44939a;
    public final String f44940b;
    public final File f44941c;

    public b(a0 a0Var, String str, File file) {
        this.f44939a = a0Var;
        if (str != null) {
            this.f44940b = str;
            this.f44941c = file;
            return;
        }
        throw new NullPointerException("Null sessionId");
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (this.f44939a.equals(bVar.f44939a) && this.f44940b.equals(bVar.f44940b) && this.f44941c.equals(bVar.f44941c)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((this.f44939a.hashCode() ^ 1000003) * 1000003) ^ this.f44940b.hashCode()) * 1000003) ^ this.f44941c.hashCode();
    }

    public final String toString() {
        return "CrashlyticsReportWithSessionId{report=" + this.f44939a + ", sessionId=" + this.f44940b + ", reportFile=" + this.f44941c + "}";
    }
}
