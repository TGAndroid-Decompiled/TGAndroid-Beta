package r9;
public final class i {
    public final r f45557a;
    public final boolean f45558b;

    public i(r rVar, boolean z10) {
        this.f45557a = rVar;
        this.f45558b = z10;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof i) {
            i iVar = (i) obj;
            if (iVar.f45557a.equals(this.f45557a) && iVar.f45558b == this.f45558b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f45557a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.f45558b).hashCode();
    }
}
