package v2;

import java.util.ArrayList;
public final class i extends o {
    public final ArrayList f48288a;

    public i(ArrayList arrayList) {
        this.f48288a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof o) {
            return this.f48288a.equals(((i) ((o) obj)).f48288a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f48288a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "BatchedLogRequest{logRequests=" + this.f48288a + "}";
    }
}
