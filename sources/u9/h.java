package u9;
public final class h {
    public final q f58545a;
    public final boolean f58546b;

    public h(q qVar, boolean z10) {
        this.f58545a = qVar;
        this.f58546b = z10;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof h) {
            h hVar = (h) obj;
            if (hVar.f58545a.equals(this.f58545a) && hVar.f58546b == this.f58546b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f58545a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.f58546b).hashCode();
    }
}
