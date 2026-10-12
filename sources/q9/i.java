package q9;
public final class i {
    public final r f45962a;
    public final boolean f45963b;

    public i(r rVar, boolean z10) {
        this.f45962a = rVar;
        this.f45963b = z10;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof i) {
            i iVar = (i) obj;
            if (iVar.f45962a.equals(this.f45962a) && iVar.f45963b == this.f45963b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f45962a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.f45963b).hashCode();
    }
}
