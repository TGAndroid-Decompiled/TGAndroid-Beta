package x9;

import java.io.File;
import z9.a0;
public final class b {
    public final a0 f49670a;
    public final String f49671b;
    public final File f49672c;

    public b(a0 a0Var, String str, File file) {
        this.f49670a = a0Var;
        if (str != null) {
            this.f49671b = str;
            this.f49672c = file;
            return;
        }
        throw new NullPointerException("Null sessionId");
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (this.f49670a.equals(bVar.f49670a) && this.f49671b.equals(bVar.f49671b) && this.f49672c.equals(bVar.f49672c)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((this.f49670a.hashCode() ^ 1000003) * 1000003) ^ this.f49671b.hashCode()) * 1000003) ^ this.f49672c.hashCode();
    }

    public final String toString() {
        return "CrashlyticsReportWithSessionId{report=" + this.f49670a + ", sessionId=" + this.f49671b + ", reportFile=" + this.f49672c + "}";
    }
}
