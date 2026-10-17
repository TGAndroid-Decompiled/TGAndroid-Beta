package x9;

import java.io.File;
import z9.a0;
public final class b {
    public final a0 f49686a;
    public final String f49687b;
    public final File f49688c;

    public b(a0 a0Var, String str, File file) {
        this.f49686a = a0Var;
        if (str != null) {
            this.f49687b = str;
            this.f49688c = file;
            return;
        }
        throw new NullPointerException("Null sessionId");
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (this.f49686a.equals(bVar.f49686a) && this.f49687b.equals(bVar.f49687b) && this.f49688c.equals(bVar.f49688c)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((this.f49686a.hashCode() ^ 1000003) * 1000003) ^ this.f49687b.hashCode()) * 1000003) ^ this.f49688c.hashCode();
    }

    public final String toString() {
        return "CrashlyticsReportWithSessionId{report=" + this.f49686a + ", sessionId=" + this.f49687b + ", reportFile=" + this.f49688c + "}";
    }
}
