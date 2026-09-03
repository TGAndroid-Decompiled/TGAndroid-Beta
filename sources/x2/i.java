package x2;

import java.util.ArrayList;
public final class i extends o {
    public final ArrayList f46751a;

    public i(ArrayList arrayList) {
        this.f46751a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof o) {
            return this.f46751a.equals(((i) ((o) obj)).f46751a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f46751a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "BatchedLogRequest{logRequests=" + this.f46751a + "}";
    }
}
