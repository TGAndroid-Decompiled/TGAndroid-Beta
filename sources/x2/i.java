package x2;

import java.util.ArrayList;
public final class i extends o {
    public final ArrayList f50026a;

    public i(ArrayList arrayList) {
        this.f50026a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof o) {
            return this.f50026a.equals(((i) ((o) obj)).f50026a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f50026a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "BatchedLogRequest{logRequests=" + this.f50026a + "}";
    }
}
