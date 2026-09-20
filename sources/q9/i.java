package q9;
public final class i {
    public final s f41492a;
    public final boolean f41493b;

    public i(s sVar, boolean z10) {
        this.f41492a = sVar;
        this.f41493b = z10;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof i) {
            i iVar = (i) obj;
            if (iVar.f41492a.equals(this.f41492a) && iVar.f41493b == this.f41493b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f41492a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.f41493b).hashCode();
    }
}
