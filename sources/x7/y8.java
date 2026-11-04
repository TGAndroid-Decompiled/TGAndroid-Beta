package x7;
public final class y8 {
    public final String f58504a;

    public y8(String str) {
        this.f58504a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof y8) && this.f58504a.equals(((y8) obj).f58504a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f58504a.hashCode() ^ 1000003) * 1000003) ^ 1231) * 1000003) ^ 1;
    }

    public final String toString() {
        return a1.g.q("MLKitLoggingOptions{libraryName=", this.f58504a, ", enableFirelog=true, firelogEventType=1}");
    }
}
