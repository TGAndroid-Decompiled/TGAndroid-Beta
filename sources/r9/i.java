package r9;
public final class i {
    public final r f45145a;
    public final boolean f45146b;

    public i(r rVar, boolean z10) {
        this.f45145a = rVar;
        this.f45146b = z10;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof i) {
            i iVar = (i) obj;
            if (iVar.f45145a.equals(this.f45145a) && iVar.f45146b == this.f45146b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f45145a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.f45146b).hashCode();
    }
}
