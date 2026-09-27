package w9;

import java.io.File;
import y9.a0;
public final class b {
    public final a0 f45237a;
    public final String f45238b;
    public final File f45239c;

    public b(a0 a0Var, String str, File file) {
        this.f45237a = a0Var;
        if (str != null) {
            this.f45238b = str;
            this.f45239c = file;
            return;
        }
        throw new NullPointerException("Null sessionId");
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (this.f45237a.equals(bVar.f45237a) && this.f45238b.equals(bVar.f45238b) && this.f45239c.equals(bVar.f45239c)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((this.f45237a.hashCode() ^ 1000003) * 1000003) ^ this.f45238b.hashCode()) * 1000003) ^ this.f45239c.hashCode();
    }

    public final String toString() {
        return "CrashlyticsReportWithSessionId{report=" + this.f45237a + ", sessionId=" + this.f45238b + ", reportFile=" + this.f45239c + "}";
    }
}
