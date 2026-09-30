package q9;
public final class i {
    public final r f41578a;
    public final boolean f41579b;

    public i(r rVar, boolean z10) {
        this.f41578a = rVar;
        this.f41579b = z10;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof i) {
            i iVar = (i) obj;
            if (iVar.f41578a.equals(this.f41578a) && iVar.f41579b == this.f41579b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f41578a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.f41579b).hashCode();
    }
}
