package q9;
public final class i {
    public final r f44854a;
    public final boolean f44855b;

    public i(r rVar, boolean z10) {
        this.f44854a = rVar;
        this.f44855b = z10;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof i) {
            i iVar = (i) obj;
            if (iVar.f44854a.equals(this.f44854a) && iVar.f44855b == this.f44855b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f44854a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.f44855b).hashCode();
    }
}
