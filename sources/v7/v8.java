package v7;
public final class v8 {
    public final String f48097a;

    public v8(String str) {
        this.f48097a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof v8) && this.f48097a.equals(((v8) obj).f48097a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f48097a.hashCode() ^ 1000003) * 1000003) ^ 1231) * 1000003) ^ 1;
    }

    public final String toString() {
        return a4.a.q("MLKitLoggingOptions{libraryName=", this.f48097a, ", enableFirelog=true, firelogEventType=1}");
    }
}
