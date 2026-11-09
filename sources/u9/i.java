package u9;
public final class i {
    public final r f56484a;
    public final boolean f56485b;

    public i(r rVar, boolean z9) {
        this.f56484a = rVar;
        this.f56485b = z9;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof i) {
            i iVar = (i) obj;
            if (iVar.f56484a.equals(this.f56484a) && iVar.f56485b == this.f56485b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f56484a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.f56485b).hashCode();
    }
}
