package v7;
public final class w8 {
    public final String f49351a;

    public w8(String str) {
        this.f49351a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof w8) && this.f49351a.equals(((w8) obj).f49351a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f49351a.hashCode() ^ 1000003) * 1000003) ^ 1231) * 1000003) ^ 1;
    }

    public final String toString() {
        return a1.g.q("MLKitLoggingOptions{libraryName=", this.f49351a, ", enableFirelog=true, firelogEventType=1}");
    }
}
