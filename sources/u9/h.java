package u9;
public final class h {
    public final q f58544a;
    public final boolean f58545b;

    public h(q qVar, boolean z10) {
        this.f58544a = qVar;
        this.f58545b = z10;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof h) {
            h hVar = (h) obj;
            if (hVar.f58544a.equals(this.f58544a) && hVar.f58545b == this.f58545b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f58544a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.f58545b).hashCode();
    }
}
