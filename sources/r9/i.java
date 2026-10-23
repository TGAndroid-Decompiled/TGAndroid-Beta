package r9;
public final class i {
    public final r f45146a;
    public final boolean f45147b;

    public i(r rVar, boolean z10) {
        this.f45146a = rVar;
        this.f45147b = z10;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof i) {
            i iVar = (i) obj;
            if (iVar.f45146a.equals(this.f45146a) && iVar.f45147b == this.f45147b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f45146a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.f45147b).hashCode();
    }
}
