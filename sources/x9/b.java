package x9;

import java.io.File;
import z9.a0;
public final class b {
    public final a0 f49673a;
    public final String f49674b;
    public final File f49675c;

    public b(a0 a0Var, String str, File file) {
        this.f49673a = a0Var;
        if (str != null) {
            this.f49674b = str;
            this.f49675c = file;
            return;
        }
        throw new NullPointerException("Null sessionId");
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (this.f49673a.equals(bVar.f49673a) && this.f49674b.equals(bVar.f49674b) && this.f49675c.equals(bVar.f49675c)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((this.f49673a.hashCode() ^ 1000003) * 1000003) ^ this.f49674b.hashCode()) * 1000003) ^ this.f49675c.hashCode();
    }

    public final String toString() {
        return "CrashlyticsReportWithSessionId{report=" + this.f49673a + ", sessionId=" + this.f49674b + ", reportFile=" + this.f49675c + "}";
    }
}
