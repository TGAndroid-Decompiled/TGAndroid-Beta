package q9;
public final class i {
    public final r f44227a;
    public final boolean f44228b;

    public i(r rVar, boolean z10) {
        this.f44227a = rVar;
        this.f44228b = z10;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof i) {
            i iVar = (i) obj;
            if (iVar.f44227a.equals(this.f44227a) && iVar.f44228b == this.f44228b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f44227a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.f44228b).hashCode();
    }
}
