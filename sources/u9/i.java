package u9;
public final class i {
    public final r f56471a;
    public final boolean f56472b;

    public i(r rVar, boolean z9) {
        this.f56471a = rVar;
        this.f56472b = z9;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof i) {
            i iVar = (i) obj;
            if (iVar.f56471a.equals(this.f56471a) && iVar.f56472b == this.f56472b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f56471a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.f56472b).hashCode();
    }
}
