package x9;

import java.io.File;
import z9.a0;
public final class b {
    public final a0 f53440a;
    public final String f53441b;
    public final File f53442c;

    public b(a0 a0Var, String str, File file) {
        this.f53440a = a0Var;
        if (str != null) {
            this.f53441b = str;
            this.f53442c = file;
            return;
        }
        throw new NullPointerException("Null sessionId");
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (this.f53440a.equals(bVar.f53440a) && this.f53441b.equals(bVar.f53441b) && this.f53442c.equals(bVar.f53442c)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((this.f53440a.hashCode() ^ 1000003) * 1000003) ^ this.f53441b.hashCode()) * 1000003) ^ this.f53442c.hashCode();
    }

    public final String toString() {
        return "CrashlyticsReportWithSessionId{report=" + this.f53440a + ", sessionId=" + this.f53441b + ", reportFile=" + this.f53442c + "}";
    }
}
