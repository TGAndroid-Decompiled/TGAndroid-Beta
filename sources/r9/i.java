package r9;
public final class i {
    public final r f45132a;
    public final boolean f45133b;

    public i(r rVar, boolean z10) {
        this.f45132a = rVar;
        this.f45133b = z10;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof i) {
            i iVar = (i) obj;
            if (iVar.f45132a.equals(this.f45132a) && iVar.f45133b == this.f45133b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f45132a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.f45133b).hashCode();
    }
}
