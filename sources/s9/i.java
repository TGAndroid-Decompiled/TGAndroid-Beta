package s9;
public final class i {
    public final r f47999a;
    public final boolean f48000b;

    public i(r rVar, boolean z10) {
        this.f47999a = rVar;
        this.f48000b = z10;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof i) {
            i iVar = (i) obj;
            if (iVar.f47999a.equals(this.f47999a) && iVar.f48000b == this.f48000b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f47999a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.f48000b).hashCode();
    }
}
