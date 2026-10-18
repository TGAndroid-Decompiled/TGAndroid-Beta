package r9;
public final class i {
    public final r f45180a;
    public final boolean f45181b;

    public i(r rVar, boolean z10) {
        this.f45180a = rVar;
        this.f45181b = z10;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof i) {
            i iVar = (i) obj;
            if (iVar.f45180a.equals(this.f45180a) && iVar.f45181b == this.f45181b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f45180a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.f45181b).hashCode();
    }
}
