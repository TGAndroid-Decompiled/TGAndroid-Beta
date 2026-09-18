package v7;
public final class v8 {
    public final String f44378a;

    public v8(String str) {
        this.f44378a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof v8) && this.f44378a.equals(((v8) obj).f44378a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f44378a.hashCode() ^ 1000003) * 1000003) ^ 1231) * 1000003) ^ 1;
    }

    public final String toString() {
        return a4.a.p("MLKitLoggingOptions{libraryName=", this.f44378a, ", enableFirelog=true, firelogEventType=1}");
    }
}
