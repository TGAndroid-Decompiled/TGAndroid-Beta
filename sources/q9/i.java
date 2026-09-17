package q9;
public final class i {
    public final r f41212a;
    public final boolean f41213b;

    public i(r rVar, boolean z10) {
        this.f41212a = rVar;
        this.f41213b = z10;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof i) {
            i iVar = (i) obj;
            if (iVar.f41212a.equals(this.f41212a) && iVar.f41213b == this.f41213b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f41212a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.f41213b).hashCode();
    }
}
