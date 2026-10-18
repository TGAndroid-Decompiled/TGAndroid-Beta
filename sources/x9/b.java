package x9;

import java.io.File;
import z9.a0;
public final class b {
    public final a0 f49711a;
    public final String f49712b;
    public final File f49713c;

    public b(a0 a0Var, String str, File file) {
        this.f49711a = a0Var;
        if (str != null) {
            this.f49712b = str;
            this.f49713c = file;
            return;
        }
        throw new NullPointerException("Null sessionId");
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (this.f49711a.equals(bVar.f49711a) && this.f49712b.equals(bVar.f49712b) && this.f49713c.equals(bVar.f49713c)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((this.f49711a.hashCode() ^ 1000003) * 1000003) ^ this.f49712b.hashCode()) * 1000003) ^ this.f49713c.hashCode();
    }

    public final String toString() {
        return "CrashlyticsReportWithSessionId{report=" + this.f49711a + ", sessionId=" + this.f49712b + ", reportFile=" + this.f49713c + "}";
    }
}
