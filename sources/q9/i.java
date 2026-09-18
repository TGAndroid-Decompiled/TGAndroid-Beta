package q9;
public final class i {
    public final r f41217a;
    public final boolean f41218b;

    public i(r rVar, boolean z10) {
        this.f41217a = rVar;
        this.f41218b = z10;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof i) {
            i iVar = (i) obj;
            if (iVar.f41217a.equals(this.f41217a) && iVar.f41218b == this.f41218b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f41217a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.f41218b).hashCode();
    }
}
