package v7;
public final class v8 {
    public final String f46778a;

    public v8(String str) {
        this.f46778a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof v8) && this.f46778a.equals(((v8) obj).f46778a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f46778a.hashCode() ^ 1000003) * 1000003) ^ 1231) * 1000003) ^ 1;
    }

    public final String toString() {
        return a1.g.p("MLKitLoggingOptions{libraryName=", this.f46778a, ", enableFirelog=true, firelogEventType=1}");
    }
}
