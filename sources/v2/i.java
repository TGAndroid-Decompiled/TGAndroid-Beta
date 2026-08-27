package v2;

import java.util.ArrayList;

public final class i extends o {

    public final ArrayList f48715a;

    public i(ArrayList arrayList) {
        this.f48715a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        return this.f48715a.equals(((i) ((o) obj)).f48715a);
    }

    public final int hashCode() {
        return this.f48715a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "BatchedLogRequest{logRequests=" + this.f48715a + "}";
    }
}
