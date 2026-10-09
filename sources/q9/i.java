package q9;
public final class i {
    public final r f46023a;
    public final boolean f46024b;

    public i(r rVar, boolean z10) {
        this.f46023a = rVar;
        this.f46024b = z10;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof i) {
            i iVar = (i) obj;
            if (iVar.f46023a.equals(this.f46023a) && iVar.f46024b == this.f46024b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f46023a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.f46024b).hashCode();
    }
}
