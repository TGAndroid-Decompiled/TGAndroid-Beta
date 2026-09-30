package q9;
public final class i {
    public final r f41481a;
    public final boolean f41482b;

    public i(r rVar, boolean z10) {
        this.f41481a = rVar;
        this.f41482b = z10;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof i) {
            i iVar = (i) obj;
            if (iVar.f41481a.equals(this.f41481a) && iVar.f41482b == this.f41482b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f41481a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.f41482b).hashCode();
    }
}
