package u9;
public final class i {
    public final r f56483a;
    public final boolean f56484b;

    public i(r rVar, boolean z9) {
        this.f56483a = rVar;
        this.f56484b = z9;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof i) {
            i iVar = (i) obj;
            if (iVar.f56483a.equals(this.f56483a) && iVar.f56484b == this.f56484b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f56483a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.f56484b).hashCode();
    }
}
