package r9;
public final class i {
    public final r f46437a;
    public final boolean f46438b;

    public i(r rVar, boolean z10) {
        this.f46437a = rVar;
        this.f46438b = z10;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof i) {
            i iVar = (i) obj;
            if (iVar.f46437a.equals(this.f46437a) && iVar.f46438b == this.f46438b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f46437a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.f46438b).hashCode();
    }
}
