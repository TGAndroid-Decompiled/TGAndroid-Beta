package u9;
public final class h {
    public final q f58586a;
    public final boolean f58587b;

    public h(q qVar, boolean z10) {
        this.f58586a = qVar;
        this.f58587b = z10;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof h) {
            h hVar = (h) obj;
            if (hVar.f58586a.equals(this.f58586a) && hVar.f58587b == this.f58587b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f58586a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.f58587b).hashCode();
    }
}
