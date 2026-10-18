package x9;

import java.io.File;
import z9.a0;
public final class b {
    public final a0 f49664a;
    public final String f49665b;
    public final File f49666c;

    public b(a0 a0Var, String str, File file) {
        this.f49664a = a0Var;
        if (str != null) {
            this.f49665b = str;
            this.f49666c = file;
            return;
        }
        throw new NullPointerException("Null sessionId");
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (this.f49664a.equals(bVar.f49664a) && this.f49665b.equals(bVar.f49665b) && this.f49666c.equals(bVar.f49666c)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((this.f49664a.hashCode() ^ 1000003) * 1000003) ^ this.f49665b.hashCode()) * 1000003) ^ this.f49666c.hashCode();
    }

    public final String toString() {
        return "CrashlyticsReportWithSessionId{report=" + this.f49664a + ", sessionId=" + this.f49665b + ", reportFile=" + this.f49666c + "}";
    }
}
