package y8;
public final class i {
    public final r f49640a;
    public final boolean f49641b;

    public i(r rVar, boolean z10) {
        this.f49640a = rVar;
        this.f49641b = z10;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof i) {
            i iVar = (i) obj;
            if (iVar.f49640a.equals(this.f49640a) && iVar.f49641b == this.f49641b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f49640a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.f49641b).hashCode();
    }
}
