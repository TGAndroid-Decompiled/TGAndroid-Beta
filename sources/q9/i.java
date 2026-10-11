package q9;
public final class i {
    public final s f46100a;
    public final boolean f46101b;

    public i(s sVar, boolean z10) {
        this.f46100a = sVar;
        this.f46101b = z10;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof i) {
            i iVar = (i) obj;
            if (iVar.f46100a.equals(this.f46100a) && iVar.f46101b == this.f46101b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f46100a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.f46101b).hashCode();
    }
}
