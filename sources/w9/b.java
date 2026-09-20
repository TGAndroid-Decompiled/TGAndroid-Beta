package w9;

import java.io.File;
import y9.a0;
public final class b {
    public final a0 f45209a;
    public final String f45210b;
    public final File f45211c;

    public b(a0 a0Var, String str, File file) {
        this.f45209a = a0Var;
        if (str != null) {
            this.f45210b = str;
            this.f45211c = file;
            return;
        }
        throw new NullPointerException("Null sessionId");
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (this.f45209a.equals(bVar.f45209a) && this.f45210b.equals(bVar.f45210b) && this.f45211c.equals(bVar.f45211c)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((this.f45209a.hashCode() ^ 1000003) * 1000003) ^ this.f45210b.hashCode()) * 1000003) ^ this.f45211c.hashCode();
    }

    public final String toString() {
        return "CrashlyticsReportWithSessionId{report=" + this.f45209a + ", sessionId=" + this.f45210b + ", reportFile=" + this.f45211c + "}";
    }
}
