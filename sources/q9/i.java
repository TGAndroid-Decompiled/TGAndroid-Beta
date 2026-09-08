package q9;
public final class i {
    public final r f44255a;
    public final boolean f44256b;

    public i(r rVar, boolean z10) {
        this.f44255a = rVar;
        this.f44256b = z10;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof i) {
            i iVar = (i) obj;
            if (iVar.f44255a.equals(this.f44255a) && iVar.f44256b == this.f44256b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f44255a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.f44256b).hashCode();
    }
}
