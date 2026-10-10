package q9;
public final class i {
    public final r f46069a;
    public final boolean f46070b;

    public i(r rVar, boolean z10) {
        this.f46069a = rVar;
        this.f46070b = z10;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof i) {
            i iVar = (i) obj;
            if (iVar.f46069a.equals(this.f46069a) && iVar.f46070b == this.f46070b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f46069a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.f46070b).hashCode();
    }
}
