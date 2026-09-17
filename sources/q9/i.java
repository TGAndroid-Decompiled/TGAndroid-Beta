package q9;
public final class i {
    public final r f44228a;
    public final boolean f44229b;

    public i(r rVar, boolean z10) {
        this.f44228a = rVar;
        this.f44229b = z10;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof i) {
            i iVar = (i) obj;
            if (iVar.f44228a.equals(this.f44228a) && iVar.f44229b == this.f44229b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f44228a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.f44229b).hashCode();
    }
}
