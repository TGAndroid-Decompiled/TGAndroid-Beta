package t9;
public final class i {
    public final r f55059a;
    public final boolean f55060b;

    public i(r rVar, boolean z10) {
        this.f55059a = rVar;
        this.f55060b = z10;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof i) {
            i iVar = (i) obj;
            if (iVar.f55059a.equals(this.f55059a) && iVar.f55060b == this.f55060b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f55059a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.f55060b).hashCode();
    }
}
