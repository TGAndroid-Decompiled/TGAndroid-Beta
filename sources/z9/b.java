package z9;

import ca.d0;
import java.io.File;
public final class b {
    public final d0 f60164a;
    public final String f60165b;
    public final File f60166c;

    public b(d0 d0Var, String str, File file) {
        this.f60164a = d0Var;
        if (str != null) {
            this.f60165b = str;
            this.f60166c = file;
            return;
        }
        throw new NullPointerException("Null sessionId");
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (this.f60164a.equals(bVar.f60164a) && this.f60165b.equals(bVar.f60165b) && this.f60166c.equals(bVar.f60166c)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((this.f60164a.hashCode() ^ 1000003) * 1000003) ^ this.f60165b.hashCode()) * 1000003) ^ this.f60166c.hashCode();
    }

    public final String toString() {
        return "CrashlyticsReportWithSessionId{report=" + this.f60164a + ", sessionId=" + this.f60165b + ", reportFile=" + this.f60166c + "}";
    }
}
