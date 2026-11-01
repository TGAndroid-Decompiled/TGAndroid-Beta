package x9;

import java.io.File;
import z9.a0;
public final class b {
    public final a0 f53458a;
    public final String f53459b;
    public final File f53460c;

    public b(a0 a0Var, String str, File file) {
        this.f53458a = a0Var;
        if (str != null) {
            this.f53459b = str;
            this.f53460c = file;
            return;
        }
        throw new NullPointerException("Null sessionId");
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (this.f53458a.equals(bVar.f53458a) && this.f53459b.equals(bVar.f53459b) && this.f53460c.equals(bVar.f53460c)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((this.f53458a.hashCode() ^ 1000003) * 1000003) ^ this.f53459b.hashCode()) * 1000003) ^ this.f53460c.hashCode();
    }

    public final String toString() {
        return "CrashlyticsReportWithSessionId{report=" + this.f53458a + ", sessionId=" + this.f53459b + ", reportFile=" + this.f53460c + "}";
    }
}
