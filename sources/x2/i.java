package x2;

import java.util.ArrayList;
public final class i extends o {
    public final ArrayList f46682a;

    public i(ArrayList arrayList) {
        this.f46682a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof o) {
            return this.f46682a.equals(((i) ((o) obj)).f46682a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f46682a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "BatchedLogRequest{logRequests=" + this.f46682a + "}";
    }
}
