package q9;
public final class i {
    public final r f44862a;
    public final boolean f44863b;

    public i(r rVar, boolean z10) {
        this.f44862a = rVar;
        this.f44863b = z10;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof i) {
            i iVar = (i) obj;
            if (iVar.f44862a.equals(this.f44862a) && iVar.f44863b == this.f44863b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f44862a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.f44863b).hashCode();
    }
}
