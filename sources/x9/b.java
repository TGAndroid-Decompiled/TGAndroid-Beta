package x9;

import java.io.File;
import z9.a0;
public final class b {
    public final a0 f49663a;
    public final String f49664b;
    public final File f49665c;

    public b(a0 a0Var, String str, File file) {
        this.f49663a = a0Var;
        if (str != null) {
            this.f49664b = str;
            this.f49665c = file;
            return;
        }
        throw new NullPointerException("Null sessionId");
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (this.f49663a.equals(bVar.f49663a) && this.f49664b.equals(bVar.f49664b) && this.f49665c.equals(bVar.f49665c)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((this.f49663a.hashCode() ^ 1000003) * 1000003) ^ this.f49664b.hashCode()) * 1000003) ^ this.f49665c.hashCode();
    }

    public final String toString() {
        return "CrashlyticsReportWithSessionId{report=" + this.f49663a + ", sessionId=" + this.f49664b + ", reportFile=" + this.f49665c + "}";
    }
}
