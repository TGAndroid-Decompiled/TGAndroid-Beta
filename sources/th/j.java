package th;

import j$.util.Objects;
public final class j extends hg.b {
    public final long f49092c;

    public j(long j10) {
        super(0, false);
        this.f49092c = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof j) && this.f49092c == ((j) obj).f49092c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f49092c));
    }
}
