package y7;
public final class a9 {
    public final String f60813a;

    public a9(String str) {
        this.f60813a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof a9) && this.f60813a.equals(((a9) obj).f60813a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f60813a.hashCode() ^ 1000003) * 1000003) ^ 1231) * 1000003) ^ 1;
    }

    public final String toString() {
        return a8.p0.p("MLKitLoggingOptions{libraryName=", this.f60813a, ", enableFirelog=true, firelogEventType=1}");
    }
}
