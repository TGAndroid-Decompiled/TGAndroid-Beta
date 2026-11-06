package u9;
public final class h {
    public final q f56380a;
    public final boolean f56381b;

    public h(q qVar, boolean z9) {
        this.f56380a = qVar;
        this.f56381b = z9;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof h) {
            h hVar = (h) obj;
            if (hVar.f56380a.equals(this.f56380a) && hVar.f56381b == this.f56381b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f56380a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.f56381b).hashCode();
    }
}
