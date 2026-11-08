package u9;
public final class i {
    public final r f56472a;
    public final boolean f56473b;

    public i(r rVar, boolean z9) {
        this.f56472a = rVar;
        this.f56473b = z9;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof i) {
            i iVar = (i) obj;
            if (iVar.f56472a.equals(this.f56472a) && iVar.f56473b == this.f56473b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f56472a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.f56473b).hashCode();
    }
}
