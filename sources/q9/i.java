package q9;
public final class i {
    public final r f44869a;
    public final boolean f44870b;

    public i(r rVar, boolean z10) {
        this.f44869a = rVar;
        this.f44870b = z10;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof i) {
            i iVar = (i) obj;
            if (iVar.f44869a.equals(this.f44869a) && iVar.f44870b == this.f44870b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f44869a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.f44870b).hashCode();
    }
}
