package v2;

import a4.w;
public final class c {
    public final String f49327a;

    public c(String str) {
        if (str != null) {
            this.f49327a = str;
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
        return this.f49327a.equals(((c) obj).f49327a);
    }

    public final int hashCode() {
        return this.f49327a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return w.q(new StringBuilder("Encoding{name=\""), this.f49327a, "\"}");
    }
}
