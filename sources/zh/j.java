package zh;

import j$.util.Objects;
public final class j extends ng.a {
    public final long f48525c;

    public j(long j3) {
        super(0, false);
        this.f48525c = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof j) && this.f48525c == ((j) obj).f48525c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f48525c));
    }
}
