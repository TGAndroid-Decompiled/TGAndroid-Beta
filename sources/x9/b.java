package x9;

import java.io.File;
import z9.a0;
public final class b {
    public final a0 f49674a;
    public final String f49675b;
    public final File f49676c;

    public b(a0 a0Var, String str, File file) {
        this.f49674a = a0Var;
        if (str != null) {
            this.f49675b = str;
            this.f49676c = file;
            return;
        }
        throw new NullPointerException("Null sessionId");
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (this.f49674a.equals(bVar.f49674a) && this.f49675b.equals(bVar.f49675b) && this.f49676c.equals(bVar.f49676c)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((this.f49674a.hashCode() ^ 1000003) * 1000003) ^ this.f49675b.hashCode()) * 1000003) ^ this.f49676c.hashCode();
    }

    public final String toString() {
        return "CrashlyticsReportWithSessionId{report=" + this.f49674a + ", sessionId=" + this.f49675b + ", reportFile=" + this.f49676c + "}";
    }
}
