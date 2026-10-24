package z9;

import java.util.List;
public final class y0 extends z1 {
    public final List f51972a;

    public y0(List list) {
        this.f51972a = list;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof z1) {
            return this.f51972a.equals(((y0) ((z1) obj)).f51972a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f51972a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "RolloutsState{rolloutAssignments=" + this.f51972a + "}";
    }
}
