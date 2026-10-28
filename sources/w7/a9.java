package w7;
public final class a9 {
    public final String f50870a;

    public a9(String str) {
        this.f50870a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof a9) && this.f50870a.equals(((a9) obj).f50870a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f50870a.hashCode() ^ 1000003) * 1000003) ^ 1231) * 1000003) ^ 1;
    }

    public final String toString() {
        return a1.g.p("MLKitLoggingOptions{libraryName=", this.f50870a, ", enableFirelog=true, firelogEventType=1}");
    }
}
