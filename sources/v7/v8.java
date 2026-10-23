package v7;
public final class v8 {
    public final String f48174a;

    public v8(String str) {
        this.f48174a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof v8) && this.f48174a.equals(((v8) obj).f48174a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f48174a.hashCode() ^ 1000003) * 1000003) ^ 1231) * 1000003) ^ 1;
    }

    public final String toString() {
        return a1.g.p("MLKitLoggingOptions{libraryName=", this.f48174a, ", enableFirelog=true, firelogEventType=1}");
    }
}
