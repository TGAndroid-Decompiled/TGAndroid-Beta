package v7;
public final class u8 {
    public final String f50620a;

    public u8(String str) {
        this.f50620a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof u8) && this.f50620a.equals(((u8) obj).f50620a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f50620a.hashCode() ^ 1000003) * 1000003) ^ 1231) * 1000003) ^ 1;
    }

    public final String toString() {
        return a1.g.n("MLKitLoggingOptions{libraryName=", this.f50620a, ", enableFirelog=true, firelogEventType=1}");
    }
}
