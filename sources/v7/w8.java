package v7;
public final class w8 {
    public final String f44451a;

    public w8(String str) {
        this.f44451a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof w8) && this.f44451a.equals(((w8) obj).f44451a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f44451a.hashCode() ^ 1000003) * 1000003) ^ 1231) * 1000003) ^ 1;
    }

    public final String toString() {
        return a4.a.p("MLKitLoggingOptions{libraryName=", this.f44451a, ", enableFirelog=true, firelogEventType=1}");
    }
}
