package v2;
public final class c {
    public final String f45623a;

    public c(String str) {
        if (str != null) {
            this.f45623a = str;
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
        return this.f45623a.equals(((c) obj).f45623a);
    }

    public final int hashCode() {
        return this.f45623a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return android.support.v4.media.a.r(new StringBuilder("Encoding{name=\""), this.f45623a, "\"}");
    }
}
