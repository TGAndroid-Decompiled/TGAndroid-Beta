package q9;
public final class i {
    public final r f41465a;
    public final boolean f41466b;

    public i(r rVar, boolean z10) {
        this.f41465a = rVar;
        this.f41466b = z10;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof i) {
            i iVar = (i) obj;
            if (iVar.f41465a.equals(this.f41465a) && iVar.f41466b == this.f41466b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f41465a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.f41466b).hashCode();
    }
}
