package r9;
public final class i {
    public final r f44045a;
    public final boolean f44046b;

    public i(r rVar, boolean z10) {
        this.f44045a = rVar;
        this.f44046b = z10;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof i) {
            i iVar = (i) obj;
            if (iVar.f44045a.equals(this.f44045a) && iVar.f44046b == this.f44046b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f44045a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.f44046b).hashCode();
    }
}
