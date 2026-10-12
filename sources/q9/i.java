package q9;
public final class i {
    public final r f45970a;
    public final boolean f45971b;

    public i(r rVar, boolean z10) {
        this.f45970a = rVar;
        this.f45971b = z10;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof i) {
            i iVar = (i) obj;
            if (iVar.f45970a.equals(this.f45970a) && iVar.f45971b == this.f45971b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f45970a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.f45971b).hashCode();
    }
}
