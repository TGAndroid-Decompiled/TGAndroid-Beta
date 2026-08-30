package v2;
public final class c {
    public final String f45559a;

    public c(String str) {
        if (str != null) {
            this.f45559a = str;
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
        return this.f45559a.equals(((c) obj).f45559a);
    }

    public final int hashCode() {
        return this.f45559a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return android.support.v4.media.a.r(new StringBuilder("Encoding{name=\""), this.f45559a, "\"}");
    }
}
