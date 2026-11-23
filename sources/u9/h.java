package u9;
public final class h {
    public final q f58670a;
    public final boolean f58671b;

    public h(q qVar, boolean z10) {
        this.f58670a = qVar;
        this.f58671b = z10;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof h) {
            h hVar = (h) obj;
            if (hVar.f58670a.equals(this.f58670a) && hVar.f58671b == this.f58671b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f58670a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.f58671b).hashCode();
    }
}
