package v7;
public final class v8 {
    public final String f47676a;

    public v8(String str) {
        this.f47676a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof v8) && this.f47676a.equals(((v8) obj).f47676a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f47676a.hashCode() ^ 1000003) * 1000003) ^ 1231) * 1000003) ^ 1;
    }

    public final String toString() {
        return a4.a.p("MLKitLoggingOptions{libraryName=", this.f47676a, ", enableFirelog=true, firelogEventType=1}");
    }
}
