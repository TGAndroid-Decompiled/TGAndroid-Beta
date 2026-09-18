package v7;
public final class v8 {
    public final String f44152a;

    public v8(String str) {
        this.f44152a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof v8) && this.f44152a.equals(((v8) obj).f44152a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f44152a.hashCode() ^ 1000003) * 1000003) ^ 1231) * 1000003) ^ 1;
    }

    public final String toString() {
        return a4.a.p("MLKitLoggingOptions{libraryName=", this.f44152a, ", enableFirelog=true, firelogEventType=1}");
    }
}
