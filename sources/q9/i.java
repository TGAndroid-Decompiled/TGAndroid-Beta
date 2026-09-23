package q9;
public final class i {
    public final r f41142a;
    public final boolean f41143b;

    public i(r rVar, boolean z10) {
        this.f41142a = rVar;
        this.f41143b = z10;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof i) {
            i iVar = (i) obj;
            if (iVar.f41142a.equals(this.f41142a) && iVar.f41143b == this.f41143b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f41142a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.f41143b).hashCode();
    }
}
