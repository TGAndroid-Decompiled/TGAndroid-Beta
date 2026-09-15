package q9;
public final class i {
    public final r f41190a;
    public final boolean f41191b;

    public i(r rVar, boolean z10) {
        this.f41190a = rVar;
        this.f41191b = z10;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof i) {
            i iVar = (i) obj;
            if (iVar.f41190a.equals(this.f41190a) && iVar.f41191b == this.f41191b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f41190a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.f41191b).hashCode();
    }
}
