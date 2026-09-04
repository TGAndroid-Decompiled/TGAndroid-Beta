package y9;

import java.util.List;
public final class y0 extends z1 {
    public final List f49917a;

    public y0(List list) {
        this.f49917a = list;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof z1) {
            return this.f49917a.equals(((y0) ((z1) obj)).f49917a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f49917a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "RolloutsState{rolloutAssignments=" + this.f49917a + "}";
    }
}
