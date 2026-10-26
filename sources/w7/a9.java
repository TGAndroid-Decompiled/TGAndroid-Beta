package w7;
public final class a9 {
    public final String f50814a;

    public a9(String str) {
        this.f50814a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof a9) && this.f50814a.equals(((a9) obj).f50814a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f50814a.hashCode() ^ 1000003) * 1000003) ^ 1231) * 1000003) ^ 1;
    }

    public final String toString() {
        return a1.g.p("MLKitLoggingOptions{libraryName=", this.f50814a, ", enableFirelog=true, firelogEventType=1}");
    }
}
