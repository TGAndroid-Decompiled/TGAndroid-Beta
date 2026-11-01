package r9;
public final class i {
    public final r f46448a;
    public final boolean f46449b;

    public i(r rVar, boolean z10) {
        this.f46448a = rVar;
        this.f46449b = z10;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof i) {
            i iVar = (i) obj;
            if (iVar.f46448a.equals(this.f46448a) && iVar.f46449b == this.f46449b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f46448a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.f46449b).hashCode();
    }
}
