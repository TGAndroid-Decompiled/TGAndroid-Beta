package y9;

import java.util.List;
public final class y0 extends z1 {
    public final List f47044a;

    public y0(List list) {
        this.f47044a = list;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof z1) {
            return this.f47044a.equals(((y0) ((z1) obj)).f47044a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f47044a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "RolloutsState{rolloutAssignments=" + this.f47044a + "}";
    }
}
