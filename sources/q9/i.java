package q9;
public final class i {
    public final r f41479a;
    public final boolean f41480b;

    public i(r rVar, boolean z10) {
        this.f41479a = rVar;
        this.f41480b = z10;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof i) {
            i iVar = (i) obj;
            if (iVar.f41479a.equals(this.f41479a) && iVar.f41480b == this.f41480b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f41479a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.f41480b).hashCode();
    }
}
