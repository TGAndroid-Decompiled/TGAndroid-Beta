package y7;
public final class b9 {
    public final String f58987a;

    public b9(String str) {
        this.f58987a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof b9) && this.f58987a.equals(((b9) obj).f58987a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f58987a.hashCode() ^ 1000003) * 1000003) ^ 1231) * 1000003) ^ 1;
    }

    public final String toString() {
        return a8.p0.p("MLKitLoggingOptions{libraryName=", this.f58987a, ", enableFirelog=true, firelogEventType=1}");
    }
}
