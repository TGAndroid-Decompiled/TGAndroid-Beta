package q9;
public final class i {
    public final r f46025a;
    public final boolean f46026b;

    public i(r rVar, boolean z10) {
        this.f46025a = rVar;
        this.f46026b = z10;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof i) {
            i iVar = (i) obj;
            if (iVar.f46025a.equals(this.f46025a) && iVar.f46026b == this.f46026b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f46025a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.f46026b).hashCode();
    }
}
