package t2;
public final class c {
    public final String f47600a;

    public c(String str) {
        if (str != null) {
            this.f47600a = str;
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
        return this.f47600a.equals(((c) obj).f47600a);
    }

    public final int hashCode() {
        return this.f47600a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return aa.d.r(new StringBuilder("Encoding{name=\""), this.f47600a, "\"}");
    }
}
