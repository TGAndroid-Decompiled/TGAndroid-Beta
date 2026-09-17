package q9;
public final class i {
    public final r f44256a;
    public final boolean f44257b;

    public i(r rVar, boolean z10) {
        this.f44256a = rVar;
        this.f44257b = z10;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof i) {
            i iVar = (i) obj;
            if (iVar.f44256a.equals(this.f44256a) && iVar.f44257b == this.f44257b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f44256a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.f44257b).hashCode();
    }
}
