package w9;

import java.io.File;
import y9.a0;
public final class b {
    public final a0 f45229a;
    public final String f45230b;
    public final File f45231c;

    public b(a0 a0Var, String str, File file) {
        this.f45229a = a0Var;
        if (str != null) {
            this.f45230b = str;
            this.f45231c = file;
            return;
        }
        throw new NullPointerException("Null sessionId");
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (this.f45229a.equals(bVar.f45229a) && this.f45230b.equals(bVar.f45230b) && this.f45231c.equals(bVar.f45231c)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((this.f45229a.hashCode() ^ 1000003) * 1000003) ^ this.f45230b.hashCode()) * 1000003) ^ this.f45231c.hashCode();
    }

    public final String toString() {
        return "CrashlyticsReportWithSessionId{report=" + this.f45229a + ", sessionId=" + this.f45230b + ", reportFile=" + this.f45231c + "}";
    }
}
