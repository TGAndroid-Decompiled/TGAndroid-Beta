package x2;

import java.util.ArrayList;
public final class i extends o {
    public final ArrayList f50313a;

    public i(ArrayList arrayList) {
        this.f50313a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof o) {
            return this.f50313a.equals(((i) ((o) obj)).f50313a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f50313a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "BatchedLogRequest{logRequests=" + this.f50313a + "}";
    }
}
