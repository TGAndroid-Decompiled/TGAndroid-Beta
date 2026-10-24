package x9;

import java.io.File;
import z9.a0;
public final class b {
    public final a0 f50115a;
    public final String f50116b;
    public final File f50117c;

    public b(a0 a0Var, String str, File file) {
        this.f50115a = a0Var;
        if (str != null) {
            this.f50116b = str;
            this.f50117c = file;
            return;
        }
        throw new NullPointerException("Null sessionId");
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (this.f50115a.equals(bVar.f50115a) && this.f50116b.equals(bVar.f50116b) && this.f50117c.equals(bVar.f50117c)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((this.f50115a.hashCode() ^ 1000003) * 1000003) ^ this.f50116b.hashCode()) * 1000003) ^ this.f50117c.hashCode();
    }

    public final String toString() {
        return "CrashlyticsReportWithSessionId{report=" + this.f50115a + ", sessionId=" + this.f50116b + ", reportFile=" + this.f50117c + "}";
    }
}
