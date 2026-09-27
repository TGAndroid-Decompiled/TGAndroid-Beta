package q9;
public final class i {
    public final r f41509a;
    public final boolean f41510b;

    public i(r rVar, boolean z10) {
        this.f41509a = rVar;
        this.f41510b = z10;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof i) {
            i iVar = (i) obj;
            if (iVar.f41509a.equals(this.f41509a) && iVar.f41510b == this.f41510b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f41509a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.f41510b).hashCode();
    }
}
