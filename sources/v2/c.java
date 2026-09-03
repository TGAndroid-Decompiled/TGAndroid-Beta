package v2;
public final class c {
    public final String f48885a;

    public c(String str) {
        if (str != null) {
            this.f48885a = str;
            return;
        }
        throw new NullPointerException("name is null");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        return this.f48885a.equals(((c) obj).f48885a);
    }

    public final int hashCode() {
        return this.f48885a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return android.support.v4.media.a.r(new StringBuilder("Encoding{name=\""), this.f48885a, "\"}");
    }
}
