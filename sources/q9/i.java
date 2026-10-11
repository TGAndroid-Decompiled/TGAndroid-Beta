package q9;
public final class i {
    public final s f46134a;
    public final boolean f46135b;

    public i(s sVar, boolean z10) {
        this.f46134a = sVar;
        this.f46135b = z10;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof i) {
            i iVar = (i) obj;
            if (iVar.f46134a.equals(this.f46134a) && iVar.f46135b == this.f46135b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f46134a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.f46135b).hashCode();
    }
}
