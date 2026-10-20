package r9;
public final class i {
    public final r f45142a;
    public final boolean f45143b;

    public i(r rVar, boolean z10) {
        this.f45142a = rVar;
        this.f45143b = z10;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof i) {
            i iVar = (i) obj;
            if (iVar.f45142a.equals(this.f45142a) && iVar.f45143b == this.f45143b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f45142a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.f45143b).hashCode();
    }
}
