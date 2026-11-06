package u9;
public final class h {
    public final q f56379a;
    public final boolean f56380b;

    public h(q qVar, boolean z9) {
        this.f56379a = qVar;
        this.f56380b = z9;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof h) {
            h hVar = (h) obj;
            if (hVar.f56379a.equals(this.f56379a) && hVar.f56380b == this.f56380b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f56379a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.f56380b).hashCode();
    }
}
