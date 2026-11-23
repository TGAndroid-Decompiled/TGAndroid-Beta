package y7;
public final class b9 {
    public final String f60902a;

    public b9(String str) {
        this.f60902a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof b9) && this.f60902a.equals(((b9) obj).f60902a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f60902a.hashCode() ^ 1000003) * 1000003) ^ 1231) * 1000003) ^ 1;
    }

    public final String toString() {
        return a8.p0.p("MLKitLoggingOptions{libraryName=", this.f60902a, ", enableFirelog=true, firelogEventType=1}");
    }
}
