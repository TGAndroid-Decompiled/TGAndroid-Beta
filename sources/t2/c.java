package t2;

import a9.p;

public final class c {

    public final String f48011a;

    public c(String str) {
        if (str == null) {
            throw new NullPointerException("name is null");
        }
        this.f48011a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        return this.f48011a.equals(((c) obj).f48011a);
    }

    public final int hashCode() {
        return this.f48011a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return p.p(new StringBuilder("Encoding{name=\""), this.f48011a, "\"}");
    }
}
