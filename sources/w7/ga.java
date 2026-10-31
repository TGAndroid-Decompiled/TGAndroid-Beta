package w7;
public final class ga {
    public final boolean equals(Object obj) {
        if (obj == this || (obj instanceof ga)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return 1269983555;
    }

    public final String toString() {
        return "MLKitLoggingOptions{libraryName=vision-common, enableFirelog=true, firelogEventType=1}";
    }
}
