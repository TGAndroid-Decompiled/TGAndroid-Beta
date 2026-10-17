package z7;
public final class uf {
    public final boolean equals(Object obj) {
        if (obj == this || (obj instanceof uf)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return -535171828;
    }

    public final String toString() {
        return "MLKitLoggingOptions{libraryName=subject-segmentation, enableFirelog=true, firelogEventType=1}";
    }
}
