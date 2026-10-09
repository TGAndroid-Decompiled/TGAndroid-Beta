package w9;

import java.io.File;
import y9.a0;
public final class b {
    public final a0 f50218a;
    public final String f50219b;
    public final File f50220c;

    public b(a0 a0Var, String str, File file) {
        this.f50218a = a0Var;
        if (str != null) {
            this.f50219b = str;
            this.f50220c = file;
            return;
        }
        throw new NullPointerException("Null sessionId");
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (this.f50218a.equals(bVar.f50218a) && this.f50219b.equals(bVar.f50219b) && this.f50220c.equals(bVar.f50220c)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((this.f50218a.hashCode() ^ 1000003) * 1000003) ^ this.f50219b.hashCode()) * 1000003) ^ this.f50220c.hashCode();
    }

    public final String toString() {
        return "CrashlyticsReportWithSessionId{report=" + this.f50218a + ", sessionId=" + this.f50219b + ", reportFile=" + this.f50220c + "}";
    }
}
