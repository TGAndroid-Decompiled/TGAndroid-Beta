package v7;
public final class w8 {
    public final String f44399a;

    public w8(String str) {
        this.f44399a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof w8) && this.f44399a.equals(((w8) obj).f44399a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f44399a.hashCode() ^ 1000003) * 1000003) ^ 1231) * 1000003) ^ 1;
    }

    public final String toString() {
        return a4.a.q("MLKitLoggingOptions{libraryName=", this.f44399a, ", enableFirelog=true, firelogEventType=1}");
    }
}
