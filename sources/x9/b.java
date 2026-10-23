package x9;

import java.io.File;
import z9.a0;
public final class b {
    public final a0 f50116a;
    public final String f50117b;
    public final File f50118c;

    public b(a0 a0Var, String str, File file) {
        this.f50116a = a0Var;
        if (str != null) {
            this.f50117b = str;
            this.f50118c = file;
            return;
        }
        throw new NullPointerException("Null sessionId");
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (this.f50116a.equals(bVar.f50116a) && this.f50117b.equals(bVar.f50117b) && this.f50118c.equals(bVar.f50118c)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((this.f50116a.hashCode() ^ 1000003) * 1000003) ^ this.f50117b.hashCode()) * 1000003) ^ this.f50118c.hashCode();
    }

    public final String toString() {
        return "CrashlyticsReportWithSessionId{report=" + this.f50116a + ", sessionId=" + this.f50117b + ", reportFile=" + this.f50118c + "}";
    }
}
