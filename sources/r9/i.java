package r9;
public final class i {
    public final r f45160a;
    public final boolean f45161b;

    public i(r rVar, boolean z10) {
        this.f45160a = rVar;
        this.f45161b = z10;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof i) {
            i iVar = (i) obj;
            if (iVar.f45160a.equals(this.f45160a) && iVar.f45161b == this.f45161b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f45160a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.f45161b).hashCode();
    }
}
