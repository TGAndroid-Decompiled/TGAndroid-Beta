package x2;

import java.util.ArrayList;
public final class i extends o {
    public final ArrayList f50277a;

    public i(ArrayList arrayList) {
        this.f50277a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof o) {
            return this.f50277a.equals(((i) ((o) obj)).f50277a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f50277a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "BatchedLogRequest{logRequests=" + this.f50277a + "}";
    }
}
