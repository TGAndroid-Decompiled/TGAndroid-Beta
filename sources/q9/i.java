package q9;
public final class i {
    public final s f41513a;
    public final boolean f41514b;

    public i(s sVar, boolean z10) {
        this.f41513a = sVar;
        this.f41514b = z10;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof i) {
            i iVar = (i) obj;
            if (iVar.f41513a.equals(this.f41513a) && iVar.f41514b == this.f41514b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f41513a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.f41514b).hashCode();
    }
}
