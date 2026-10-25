package s9;
public final class i {
    public final r f47996a;
    public final boolean f47997b;

    public i(r rVar, boolean z10) {
        this.f47996a = rVar;
        this.f47997b = z10;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof i) {
            i iVar = (i) obj;
            if (iVar.f47996a.equals(this.f47996a) && iVar.f47997b == this.f47997b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f47996a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.f47997b).hashCode();
    }
}
