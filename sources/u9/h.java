package u9;
public final class h {
    public final q f58555a;
    public final boolean f58556b;

    public h(q qVar, boolean z10) {
        this.f58555a = qVar;
        this.f58556b = z10;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof h) {
            h hVar = (h) obj;
            if (hVar.f58555a.equals(this.f58555a) && hVar.f58556b == this.f58556b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f58555a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.f58556b).hashCode();
    }
}
