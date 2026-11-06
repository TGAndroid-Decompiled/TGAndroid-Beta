package u9;
public final class h {
    public final q f56355a;
    public final boolean f56356b;

    public h(q qVar, boolean z9) {
        this.f56355a = qVar;
        this.f56356b = z9;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof h) {
            h hVar = (h) obj;
            if (hVar.f56355a.equals(this.f56355a) && hVar.f56356b == this.f56356b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f56355a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.f56356b).hashCode();
    }
}
