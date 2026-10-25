package w7;
public final class a9 {
    public final String f50811a;

    public a9(String str) {
        this.f50811a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof a9) && this.f50811a.equals(((a9) obj).f50811a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f50811a.hashCode() ^ 1000003) * 1000003) ^ 1231) * 1000003) ^ 1;
    }

    public final String toString() {
        return a1.g.p("MLKitLoggingOptions{libraryName=", this.f50811a, ", enableFirelog=true, firelogEventType=1}");
    }
}
