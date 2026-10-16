package r9;
public final class i {
    public final r f43804a;
    public final boolean f43805b;

    public i(r rVar, boolean z10) {
        this.f43804a = rVar;
        this.f43805b = z10;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof i) {
            i iVar = (i) obj;
            if (iVar.f43804a.equals(this.f43804a) && iVar.f43805b == this.f43805b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f43804a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.f43805b).hashCode();
    }
}
