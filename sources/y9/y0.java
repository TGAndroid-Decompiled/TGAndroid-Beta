package y9;

import java.util.List;
public final class y0 extends z1 {
    public final List f46657a;

    public y0(List list) {
        this.f46657a = list;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof z1) {
            return this.f46657a.equals(((y0) ((z1) obj)).f46657a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f46657a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "RolloutsState{rolloutAssignments=" + this.f46657a + "}";
    }
}
