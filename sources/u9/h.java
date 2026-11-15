package u9;
public final class h {
    public final q f57979a;
    public final boolean f57980b;

    public h(q qVar, boolean z10) {
        this.f57979a = qVar;
        this.f57980b = z10;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof h) {
            h hVar = (h) obj;
            if (hVar.f57979a.equals(this.f57979a) && hVar.f57980b == this.f57980b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f57979a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.f57980b).hashCode();
    }
}
