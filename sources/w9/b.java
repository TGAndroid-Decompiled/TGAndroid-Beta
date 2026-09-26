package w9;

import java.io.File;
import y9.a0;
public final class b {
    public final a0 f45191a;
    public final String f45192b;
    public final File f45193c;

    public b(a0 a0Var, String str, File file) {
        this.f45191a = a0Var;
        if (str != null) {
            this.f45192b = str;
            this.f45193c = file;
            return;
        }
        throw new NullPointerException("Null sessionId");
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (this.f45191a.equals(bVar.f45191a) && this.f45192b.equals(bVar.f45192b) && this.f45193c.equals(bVar.f45193c)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((this.f45191a.hashCode() ^ 1000003) * 1000003) ^ this.f45192b.hashCode()) * 1000003) ^ this.f45193c.hashCode();
    }

    public final String toString() {
        return "CrashlyticsReportWithSessionId{report=" + this.f45191a + ", sessionId=" + this.f45192b + ", reportFile=" + this.f45193c + "}";
    }
}
