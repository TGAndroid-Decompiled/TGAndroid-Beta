package q9;
public final class i {
    public final r f41480a;
    public final boolean f41481b;

    public i(r rVar, boolean z10) {
        this.f41480a = rVar;
        this.f41481b = z10;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof i) {
            i iVar = (i) obj;
            if (iVar.f41480a.equals(this.f41480a) && iVar.f41481b == this.f41481b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f41480a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.f41481b).hashCode();
    }
}
