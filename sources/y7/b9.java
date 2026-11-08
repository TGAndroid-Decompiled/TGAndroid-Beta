package y7;
public final class b9 {
    public final String f58988a;

    public b9(String str) {
        this.f58988a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof b9) && this.f58988a.equals(((b9) obj).f58988a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f58988a.hashCode() ^ 1000003) * 1000003) ^ 1231) * 1000003) ^ 1;
    }

    public final String toString() {
        return a8.p0.p("MLKitLoggingOptions{libraryName=", this.f58988a, ", enableFirelog=true, firelogEventType=1}");
    }
}
