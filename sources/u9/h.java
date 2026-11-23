package u9;
public final class h {
    public final q f58590a;
    public final boolean f58591b;

    public h(q qVar, boolean z10) {
        this.f58590a = qVar;
        this.f58591b = z10;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof h) {
            h hVar = (h) obj;
            if (hVar.f58590a.equals(this.f58590a) && hVar.f58591b == this.f58591b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f58590a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.f58591b).hashCode();
    }
}
