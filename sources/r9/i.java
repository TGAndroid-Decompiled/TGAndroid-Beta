package r9;
public final class i {
    public final r f45558a;
    public final boolean f45559b;

    public i(r rVar, boolean z10) {
        this.f45558a = rVar;
        this.f45559b = z10;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof i) {
            i iVar = (i) obj;
            if (iVar.f45558a.equals(this.f45558a) && iVar.f45559b == this.f45559b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f45558a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.f45559b).hashCode();
    }
}
