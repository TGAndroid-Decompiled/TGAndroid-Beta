package q9;
public final class i {
    public final r f40567a;
    public final boolean f40568b;

    public i(r rVar, boolean z10) {
        this.f40567a = rVar;
        this.f40568b = z10;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof i) {
            i iVar = (i) obj;
            if (iVar.f40567a.equals(this.f40567a) && iVar.f40568b == this.f40568b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f40567a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.f40568b).hashCode();
    }
}
