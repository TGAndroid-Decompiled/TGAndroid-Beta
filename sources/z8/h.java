package z8;

public final class h {

    public final q f50236a;

    public final boolean f50237b;

    public h(q qVar, boolean z10) {
        this.f50236a = qVar;
        this.f50237b = z10;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof h) {
            h hVar = (h) obj;
            if (hVar.f50236a.equals(this.f50236a) && hVar.f50237b == this.f50237b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f50236a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.f50237b).hashCode();
    }
}
