package x7;
public final class ba {
    public final boolean equals(Object obj) {
        if (obj == this || (obj instanceof ba)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return -1705342425;
    }

    public final String toString() {
        return "MLKitLoggingOptions{libraryName=play-services-mlkit-image-labeling, enableFirelog=true, firelogEventType=1}";
    }
}
