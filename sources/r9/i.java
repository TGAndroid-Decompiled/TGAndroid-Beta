package r9;
public final class i {
    public final r f45134a;
    public final boolean f45135b;

    public i(r rVar, boolean z10) {
        this.f45134a = rVar;
        this.f45135b = z10;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof i) {
            i iVar = (i) obj;
            if (iVar.f45134a.equals(this.f45134a) && iVar.f45135b == this.f45135b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f45134a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.f45135b).hashCode();
    }
}
