package v7;
public final class w8 {
    public final String f49579a;

    public w8(String str) {
        this.f49579a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof w8) && this.f49579a.equals(((w8) obj).f49579a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f49579a.hashCode() ^ 1000003) * 1000003) ^ 1231) * 1000003) ^ 1;
    }

    public final String toString() {
        return a1.g.q("MLKitLoggingOptions{libraryName=", this.f49579a, ", enableFirelog=true, firelogEventType=1}");
    }
}
