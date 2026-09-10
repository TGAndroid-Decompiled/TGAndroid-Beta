package v7;
public final class v8 {
    public final String f43189a;

    public v8(String str) {
        this.f43189a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof v8) && this.f43189a.equals(((v8) obj).f43189a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f43189a.hashCode() ^ 1000003) * 1000003) ^ 1231) * 1000003) ^ 1;
    }

    public final String toString() {
        return a4.a.p("MLKitLoggingOptions{libraryName=", this.f43189a, ", enableFirelog=true, firelogEventType=1}");
    }
}
