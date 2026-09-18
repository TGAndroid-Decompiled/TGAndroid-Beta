package q9;
public final class i {
    public final r f41451a;
    public final boolean f41452b;

    public i(r rVar, boolean z10) {
        this.f41451a = rVar;
        this.f41452b = z10;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof i) {
            i iVar = (i) obj;
            if (iVar.f41451a.equals(this.f41451a) && iVar.f41452b == this.f41452b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f41451a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.f41452b).hashCode();
    }
}
