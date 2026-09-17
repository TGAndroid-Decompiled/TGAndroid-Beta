package v7;
public final class v8 {
    public final String f47648a;

    public v8(String str) {
        this.f47648a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof v8) && this.f47648a.equals(((v8) obj).f47648a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f47648a.hashCode() ^ 1000003) * 1000003) ^ 1231) * 1000003) ^ 1;
    }

    public final String toString() {
        return a4.a.p("MLKitLoggingOptions{libraryName=", this.f47648a, ", enableFirelog=true, firelogEventType=1}");
    }
}
