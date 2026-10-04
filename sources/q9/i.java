package q9;
public final class i {
    public final r f44855a;
    public final boolean f44856b;

    public i(r rVar, boolean z10) {
        this.f44855a = rVar;
        this.f44856b = z10;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof i) {
            i iVar = (i) obj;
            if (iVar.f44855a.equals(this.f44855a) && iVar.f44856b == this.f44856b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f44855a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.f44856b).hashCode();
    }
}
