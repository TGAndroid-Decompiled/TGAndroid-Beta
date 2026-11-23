package y7;
public final class a9 {
    public final String f60778a;

    public a9(String str) {
        this.f60778a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof a9) && this.f60778a.equals(((a9) obj).f60778a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f60778a.hashCode() ^ 1000003) * 1000003) ^ 1231) * 1000003) ^ 1;
    }

    public final String toString() {
        return a8.p0.p("MLKitLoggingOptions{libraryName=", this.f60778a, ", enableFirelog=true, firelogEventType=1}");
    }
}
