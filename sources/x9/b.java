package x9;

import java.io.File;
import z9.a0;
public final class b {
    public final a0 f49665a;
    public final String f49666b;
    public final File f49667c;

    public b(a0 a0Var, String str, File file) {
        this.f49665a = a0Var;
        if (str != null) {
            this.f49666b = str;
            this.f49667c = file;
            return;
        }
        throw new NullPointerException("Null sessionId");
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (this.f49665a.equals(bVar.f49665a) && this.f49666b.equals(bVar.f49666b) && this.f49667c.equals(bVar.f49667c)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((this.f49665a.hashCode() ^ 1000003) * 1000003) ^ this.f49666b.hashCode()) * 1000003) ^ this.f49667c.hashCode();
    }

    public final String toString() {
        return "CrashlyticsReportWithSessionId{report=" + this.f49665a + ", sessionId=" + this.f49666b + ", reportFile=" + this.f49667c + "}";
    }
}
