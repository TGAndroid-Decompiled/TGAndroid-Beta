package v7;
public final class v8 {
    public final String f48090a;

    public v8(String str) {
        this.f48090a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof v8) && this.f48090a.equals(((v8) obj).f48090a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f48090a.hashCode() ^ 1000003) * 1000003) ^ 1231) * 1000003) ^ 1;
    }

    public final String toString() {
        return a4.a.q("MLKitLoggingOptions{libraryName=", this.f48090a, ", enableFirelog=true, firelogEventType=1}");
    }
}
