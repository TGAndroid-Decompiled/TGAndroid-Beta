package q9;
public final class i {
    public final r f41186a;
    public final boolean f41187b;

    public i(r rVar, boolean z10) {
        this.f41186a = rVar;
        this.f41187b = z10;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof i) {
            i iVar = (i) obj;
            if (iVar.f41186a.equals(this.f41186a) && iVar.f41187b == this.f41187b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f41186a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.f41187b).hashCode();
    }
}
