package q9;
public final class i {
    public final r f41478a;
    public final boolean f41479b;

    public i(r rVar, boolean z10) {
        this.f41478a = rVar;
        this.f41479b = z10;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof i) {
            i iVar = (i) obj;
            if (iVar.f41478a.equals(this.f41478a) && iVar.f41479b == this.f41479b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f41478a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.f41479b).hashCode();
    }
}
